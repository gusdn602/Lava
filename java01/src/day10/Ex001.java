package day10;
/*
���� 1]
	���� ������, �ѷ�, ���̸� ������ Ŭ������ �����
	�� Ŭ���� ��ü 10���� �迭�� ������ �迭�� ����
	�� ����� �ʱ�ȭ�ϰ�
	����ϼ���. 
*/

public class Ex001 {
	
	public static void main(String[] args) {
		Ex01[] ex01 = new Ex01[10];
		
		for(int i = 0 ; i < ex01.length ; i++ ) {
			ex01[i] = new Ex01();
			ex01[i].setBan();
			ex01[i].setDool();
			ex01[i].setArea();
		}
		
		// ����ϱ�
		for(int i = 0 ; i < ex01.length ; i++ ) {
			ex01[i].Print();
		}
		
		
	}
}
