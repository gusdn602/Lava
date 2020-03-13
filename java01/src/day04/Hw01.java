package day04;
import java.util.*;
/*
 	두 수를 입력받은 후
 	두 수의 최대 공약수를 구해서 출력해주는 프로그램 작성.
 	
 	최대공약수 : 두수를 나눌 수 있는 최대 수
 */
public class Hw01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("첫번째 수 입력");
		int num1 = sc.nextInt();
		System.out.println("두번째 수 입력");
		int num2 = sc.nextInt();
		
		int val = (num2 > num1) ? num1 : num2;
		
		for(int i = val; i >0; i--) {
			if(num1 % i == 0 && num2 % i ==0) {
				System.out.println(num1 + "과" + num2 + "최대 공약수 :" + i);
				break;
			}
		}
	}

}
