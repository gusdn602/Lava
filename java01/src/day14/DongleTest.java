package day14;

public class DongleTest {
	
	public DongleTest() {
	//Dongle ��ü �ΰ��� ����� ���غ���.
		Dongle d1 = new Dongle(5);
		Dongle d2 = new Dongle(10);
		
		System.out.println("d1.area :" + d1.getArea());
		System.out.println("d2.area :" + d2.getArea());
		
		//�� ���� ������ ���غ���
		System.out.println("d1�� d2�� " + (d1.equals(d2) ?("���� ���Դϴ�.") : ("�ٸ� ���Դϴ�.")));
	}
	public static void main(String[] args) {
		new DongleTest();

	}

}
