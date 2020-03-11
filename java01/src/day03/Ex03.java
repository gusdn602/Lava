package day03;
import java.util.*;
/*
 	문제 2]
 		전기 요금을 계산하는 프로그램을 작성하세요.
 					코드		기본요금	사용요금
 		가정용		(1)		3800	245	
 		산업용		(2)		2400	157
 		교육용		(3)		2900	169
 		상업용		(4)		3200	174
 		
 		전기금 = 기본요금 + 사용량 * 사용요금
 		
 		사용자코드와 사용량을 입력받아서
 		전기 요금을 계산해주는 프로그램을 작성하세요.
 */
public class Ex03 {

	public Ex03() {
		ex03();
	}
	
	public void ex03() {
		Scanner sc = new Scanner(System.in);
		System.out.println("코드를 입력하시오");
		int code = sc.nextInt();
		System.out.println("사용량를 입력하시오");
		int  can = sc.nextInt();
		
		int home = 1;
		int home1 = 3800;
		int home2 = 245;
		
		int fec = 2;
		int fec1 = 2400;
		int fec2 = 157;
		
		int edu = 3;
		int edu1 = 2900;
		int edu2 = 169;
		
		int store = 4;
		int store1 = 3200;
		int store2 = 174;
	
	
	
	
	
		if(code == 1) {
			System.out.println("이번달 전기요금은 " + (home1 + can * home2) + " 입니다.");
		} else if(code == 2 ){
		 	System.out.println("이번달 전기요금은 " + (fec1 + can * fec2) + " 입니다.");
		} else if(code == 3){
			System.out.println("이번달 전기요금은" + (edu1 + can * edu2) + "입니다.");	
		} else if(code == 4){
			 System.out.println("이번달 전기요금은" + (store1 + can *store2) + "입니다.");
		} 
	}

	

	public static void main(String[] args) {
		new Ex03();

	}

}
