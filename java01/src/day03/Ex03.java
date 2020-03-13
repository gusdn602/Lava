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
		int home = 1;
		
		int fec = 2;
		
		int edu = 3;
		
		int store = 4;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("코드를 입력하시오");
		int code = sc.nextInt();
		if (!(code >= 1 && code <= 4)) {
			System.out.println("존재하지 않는 코드입니다.");
			return;
		}
		System.out.println("사용량를 입력하시오");
		int  can = sc.nextInt();
		if (!(code >= 1 && code <= 4)) {
			System.out.println("존재하지 않는 코드입니다.");
			return;
		}
			
	
		
		if(code == 1) {
			System.out.println("이번달 전기요금은 " + (3800 + can * 245) + " 입니다.");
		} else if(code == 2 ){
		 	System.out.println("이번달 전기요금은 " + (2400 + can * 157) + " 입니다.");
		} else if(code == 3){
			System.out.println("이번달 전기요금은" + (2900 + can * 169) + "입니다.");	
		} else if(code == 4){
			 System.out.println("이번달 전기요금은" + (3200 + can *174) + "입니다.");
		} 
	}

	

	public static void main(String[] args) {
		new Ex03();

	}

}
