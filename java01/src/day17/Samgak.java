package day17;

public class Samgak {
	private int wi,he;
	private double area;
	//�⺻ ������ �Լ�
	public Samgak() {}
	
	//������ �Լ� �����ε�
	public Samgak(int wi, int he) {
		this.wi = wi;		//private�� wi�� Samgak�Լ� ���� wi�� ����
		this.he = he;		//private�� he�� Samgak�Լ� ���� he�� ����
		setArea();			//setArea()�� ȣ��
	}
	
	public int getWi() {
		return wi;		
	}
	public void setWi(int wi) {
		this.wi = wi;
	}
	public int getHe() {
		return he;
	}
	public void setHe(int he) {
		this.he = he;
	}
	public double getArea() {
		return area;
	}
	public void setArea(double area) {
		this.area = area;
	}
	public void setArea() {		//setArea�� �Լ��ȿ� wi * he��  ���������� ������  doubleŸ���� area�� ������� ����
		this.area = wi * he;
	}
}
