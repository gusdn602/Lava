package day11;
/*
 	���� 1]
 		�� Ŭ������ ���� ������ ������ Ŭ�����̴�.
 		�� Ŭ���� ��ü�� �ɶ� �������� �Է¹޾Ƽ� ���� ���� ������ �Է��� �ǰ�
 		Ŭ������ ���� �ϼ���.
 		
 		�������� �Է��� �ȵ� ���� 10���� �Էµǰ� �ϼ���.
 */
public class Circle {
	//�� Ŭ������ ���� ���� ������ ����ϴ� Ŭ�����̹Ƿ�
	//������, �ѷ�, ���̸� ����ϸ� �ɰ��̴�.
	int ban;
	double bandool, nall;
	
	//�⺻ ������ �Լ�
	public Circle() {
		this(10);
	}
	//������ �Լ� �����ε�
	public Circle (int ban) {
		this.ban = ban;
		getArrround(ban);
		getArea(ban);
	}
	
	//���� �ѷ� �����ִ� �Լ� 
	public double getArrround(int ban) {
		return bandool = 2* ban* 3.14;
	}
	
	public double getArea(int ban) {
		return nall = ban*ban*3.14;
	}
	public void toPrint() {
		System.out.printf("������ : %5d | ���� �ѷ� : %7.2f | ���� ���� | %7.2f \n " , ban,bandool, nall);
	}
}
