package day17;

public class Saggak {
	private int wi, he; //wi, he�� ���������� ����
	private double area; //area�� �Ǽ�Ÿ������ ����
	
	public Saggak() { //������ �Լ� ���� ������ ��ӹ޴� �ٸ� class���� ������ �Լ� ��� �Ұ�
		
	}
	public Saggak(int wi, int he) {
		this.wi = wi;	//���������� wi�� Saggak�Լ��� wi�� ���� 
		this.he = he;	//���������� he�� Saggak�Լ��� he�� ����
		setArea();
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
	public void setArea() { // area�� �����ε���,  wi�� he�� ���� ���� ���������� area�� ��´�
		this.area = wi * he;
	}
	
	

}
