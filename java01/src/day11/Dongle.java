package day11;

public class Dongle extends Dohyung{
	int rad;
	double arround;
	
	public Dongle() {
		this(1);
	}
	public Dongle(int rad) {
		this.rad = rad;
		setArround();
		setArea();
	}
	
	//���� �ѷ� �Ի��� �ִ� �Լ�.
	public void setArround() {
		arround = 2 * rad* 3.14;
	}
	//���� ���� �Ի��� �ִ� �Լ�.
	public void setArea() {
		area = rad * rad * 3.14;
	}
	// ����Լ�  - Dohyung�� toPrint() Overriding
	public void toPrint() {
		System.out.printf("���� ������ : %3d\n���� �ѷ� : %5.2f\n���� ���� : %5.2f\n", rad, arround, area);
	}
}
