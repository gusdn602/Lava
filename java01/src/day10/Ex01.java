package day10;
/*
 ���� 1]
	���� ������, �ѷ�, ���̸� ������ Ŭ������ �����
	�� Ŭ���� ��ü 10���� �迭�� ������ �迭�� ����
	�� ����� �ʱ�ȭ�ϰ�
	����ϼ���. 
 */

public class Ex01 {

		double ban; //������
		double dool; // �ѷ�
		double area; // ����
		
	public void setBan() {
		ban = (int)(Math.random()*201 - 100); // 100 - (-100) + 1) + (-100)
	}
	
	public void setDool() {
		dool = 2*3.14*ban;
	}
	
	public void setArea() {
		area = 3.14*ban*ban;
	}
	public void Print() {
		System.out.printf("������ : %10.2f, \n��   �� : %10.2f, \n��   �� : %10.2f\n", ban, dool,area);
	}
}
