package day04;
/*
 	4�ڸ� ���ڷ� �� �⵵�� �Է¹޾Ƽ�
 	�� �ذ� �������� �ƴ��� �Ǵ��ϼ���.
 */
//���̺귯�� ����
import java.util.*;
public class Test01 {

	public Test01() {
		
	}

	public static void main(String[] args) {
		//�۾�����
		// 0. �ʿ��� ���� ����
		Scanner sc;
		int year;
		String hea = "���";
		// 1. �Է¹��� �غ�
		sc = new Scanner(System.in);
		// 2. �޼��� ���
		System.out.print("��⵵ ??? : ");
		// 3. �⵵ ������ ������ ���
		year = sc.nextInt();
		// 4. ����ó���ؼ� �Ǵ�
		if(year % 400 == 0) {
			/*
			 	400���� ���� �������� ���� �߻����� ��� ����Ǵ� �κ�
			 	�� ���� �� ���� �����Ű�� 
			 	��ü ���ǹ� ��ü�� �����Ѵ�.
			 */
			hea = "����";
			System.out.print("4�� ���� �������� ��");
		} else if(year % 100 == 0) {
			/*
			 	�� ���� �����ϴ� ��� 400���� ���� �������� �ʴ� ��� 
			 	100���� ���� �������� ���� ����Ǵ� �κ�.
			 */
			hea = "���";
			System.out.print("100�� ���� �������� ��");
		} else if(year % 4 == 0) {
			// year % 400 != 0 && year % 100 != 0
			hea = "����";
			System.out.print("400���� ���� �������� ��");
		} /*else {
			hea = "���";
		}*/
		// 5. ��� ����ϱ�
			System.out.print("�Է��� �� [" + year + "]�� ["+ hea + "]�Դϴ�.");
	}
}


