
/*
	 ���� 6]
	 ������ �⵵�� �Է¹޾Ƽ�
	 �ش� �⵵�� �������� ������� �Ǻ��ؼ� ������ִ� ���α׷��� �ۼ��ϼ���.
	 
	 ��, ���� �����ڸ� ����� ��.
	 
	 ������ ���� ]
	 		4�� ���� �������� 100���� ������������ ������ 
	 		400���� ���� �������� �ظ� �����̶�� �Ѵ�.
*/
package day03;
import java.util.*;
public class Hw06 {
	public Hw06() {
		solv();
	}
	public void solv() {
		//1. �Է¹��� �غ�
		Scanner sc = new Scanner(System.in);
		//2. �޼��� ���
		System.out.print("�⵵�� �Է��ϼ���! :");
		//3. �Է��� ���ڿ� �������
		int year = sc.nextInt();
		//4. �������� ������� �Ǻ�
		String result = (year % 4 !=0) ? ("���") : (year % 100 != 0) ? ("����") : (
						(year % 400==0) ? "����" : "���"
				);
		//5. ���
		System.out.println("�Է��� �� [" + year + "]�� [" + result + "] �Դϴ�.2020");
	}


	public static void main(String[] args) {
		new Hw06();
	}

}
