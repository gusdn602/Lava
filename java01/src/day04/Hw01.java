package day04;
import java.util.*;
/*
 	�� ���� �Է¹��� ��
 	�� ���� �ִ� ������� ���ؼ� ������ִ� ���α׷� �ۼ�.
 	
 	�ִ����� : �μ��� ���� �� �ִ� �ִ� ��
 */
public class Hw01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("ù��° �� �Է�");
		int num1 = sc.nextInt();
		System.out.println("�ι�° �� �Է�");
		int num2 = sc.nextInt();
		
		int val = (num2 > num1) ? num1 : num2;
		
		for(int i = val; i >0; i--) {
			if(num1 % i == 0 && num2 % i ==0) {
				System.out.println(num1 + "��" + num2 + "�ִ� ����� :" + i);
				break;
			}
		}
	}

}
