package day02;

import java.util.Scanner;

public class Ex01 {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("�������� �Է��ϼ��� :");
		String str = sc.nextLine();
		sc.close();
		int num = Integer.parseInt(str);
		int result = 2*num;
		System.out.println("�Է��� ��" + num + "�� ���̴�" + result*3.14 + "�Դϴ�.");
	}
}
