package day14;

public class Dongle {
	private int red;
	private double arround, area;
	public Dongle(int red) {
		this.red = red;
		setArround();
		serArea();
	}
	//�ѷ� �����ִ� �Լ�
	public void setArround() {
		arround = 2 * 3.14 * red;
	}
	
	//���������ִ� �Լ�
	public void serArea() {
		area = 3.14 * red * red;
	}
	//area�� ���������ڰ� private �̰� �̰��� Ŭ������������ ������ �����ϹǷ� �Լ��� ���� �����͸� ��ȯ���ֵ��� ����.
	//�Լ��� ���� �����͸� ��ȯ���ֵ��� ����
	public double getArea() {
		return area;
	}
	//���� ������ ������ ���� ������ �Ǵܵǵ��� equals �Լ��� �������̵� �غ���
	public boolean equals(Object obj) {
		//��ȯ�� ���� ���� ���� �� �ʱ�ȭ
		boolean bool = false;
		
		//�ԷµǴ� Dongle �ν��Ͻ��� ������Ʈ Ÿ������ �ڵ� ����ȯ�� �Ǽ� ����� �� ���̹Ƿ� 
		//Dongle Ÿ������ ���� ����ȯ�� ���Ѽ� ����� ����ؾ� �Ѵ�.
		Dongle d1 = (Dongle) obj;
		
		//Ÿ���� ��ȯ�� ��� ���� ������ ������ ���غ���
		//�񱳴� ����� �ΰ��� �ʿ��ϴ�. �ϳ��� �Ű� ������ �Է��� �޾Ҵ�. �׷� �ٸ� �ϳ���???
		bool = (this.area == d1.area) ? true : false;
		
		//��� ��ȯ���ְ�...
		return bool;
	}
}
