package day09;
/*
 문제 1]
	반지름을 랜덤하게 발생해서		--함수로 ... 
	그 반지름을 입력하면 원의 넓이를 구해주는 함수와 
	원의 둘레를 구해주는 함수를 제작하고 
	실행해서 출력하세요.
 */
import java.util.*;
import javax.swing.*;

public class Ex01 {
	int ban = (int)(Math.random() * (100 - 1 +1)+1);
	
	public Ex01() {
		dool();
		nall();
		print();
	}
	
	public double dool() {
		return 2*3.14*ban; 
	}
	
	public double nall() {
		return 	3.14 * ban * ban; 
	}
	
	public void print() {
		System.out.println("반지름 :" + ban + "\n원의 넓이는 : " + nall() + "\n원의 둘레는" + dool());
	}
	
	public static void main(String[] args) {
		new Ex01();

	}

}
