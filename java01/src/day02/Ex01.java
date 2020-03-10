package day02;

import java.util.Scanner;

public class Ex01 {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("반지름을 입력하세요 :");
		String str = sc.nextLine();
		sc.close();
		int num = Integer.parseInt(str);
		int result = 2*num;
		System.out.println("입력한 수" + num + "의 넓이는" + result*3.14 + "입니다.");
	}
}
