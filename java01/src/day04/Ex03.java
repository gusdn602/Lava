package day04;
/*
 	���� 3]
 		2x + 4y =10�� �������� ����� ����ϼ���.
 		��, x,y �� ��� 0�̻� 10������ �����̴�. 
 */
public class Ex03 {



	public static void main(String[] args) {
		for(int x = 0; x< 11; x++) {
			for(int y = 0; y <11; y++) {
				if(2* x + 4 * y == 10) {
					System.out.println("x�� " + x  + "�̰� y��" + y + "�϶� ����" + (2*x+4*y)+"�Դϴ�");
				}
			}
		}
		
	}

}
