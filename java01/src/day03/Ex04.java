package day03;
import java.util.*;
/*
 	문제 3]
 		부서 번호를 입력하면 
 		부서이름을 출력해주는 프로그램을 작성하세요.
 		
 		10 - 총무부
 		20 - 회계부
 		30 - 영업부
 		40 - 기술부
 		나머지 - 다음기회에...
 */
public class Ex04 {

	public Ex04() {
		ex04();
	}
public void ex04() {
	Scanner sc = new Scanner(System.in);
	System.out.println("코드를 입력하세요");
	int code = sc.nextInt();
	
	if(code == 10) {
		System.out.println("총무부입니다.");
	} else if(code == 20){
		System.out.println("회계부입니다.");
	} else if(code == 30) {
		System.out.println("영업부입니다.");
	} else if(code == 40) {
		System.out.println("다음기회에");
	}
}
	public static void main(String[] args) {
		new Ex04();

	}

}
