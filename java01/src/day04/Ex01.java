package day04;
/*
 	4 �ڸ� ���ڷ� �� �⵵�� �Է¹޾Ƽ� 
 	�������� ������� �Ǵ��ؼ� ����ϼ���.
 	��, switch ~ case �������� ó���ϼ���.
 */
import java.util.*; //�Է¹��� �غ�
public class Ex01 {


	public static void main(String[] args) {
		//�Է¹��� �غ�
		
		Scanner sc = new Scanner(System.in);
		
		//�޼��� ���
		System.out.print("4�ڸ� �⵵");
		// �Է¹ޱ�
		int year = sc.nextInt();
		//�ڵ常��� ( 4�� ���� �������¼� -1, 100���� ���� �������¼� -2, 400���� ���� �������� �� -3)
		int code = 0;
		if(year % 400 == 0) {
			code = 3;
		} else if(year % 100 == 0) {
			code = 2;
		} else if(year % 4 == 0) {
			code = 1;
		}
		//switch ~ case ����ġ��...
		String hea = "���";
		switch (code) {
		case 3:
			hea = "���";
		case 2:
			break;
		case 1:
			hea = "����";
			break;
		}
		System.out.print("�Է��� �⵵ [ " + year + "]��[" + hea + "] �Դϴ�.");
	}
}


