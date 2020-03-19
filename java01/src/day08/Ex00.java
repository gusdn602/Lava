package day08;

import java.util.Arrays;

/*
 문제 0] 
	구구단을 출력하는데 
	단과 곱을 배열을 만들어서 처리하고 출력하세요.
	------------------------------------------
	|단				|		곱				|
	------------------------------------------
	
	int[] dan = {2,3,....9};
	int[] gop = {1,2,3,....9};
	--초기화는 반복문으로
	
	int[][] gugudan = {dan, gop};
	
	출력형태는 
			2 x 1 = 2
			...
			2 x 9 = 18
			----------
			3 x 1 = 3
			....	
 */
public class Ex00 {

	public static void main(String[] args) {
		int[] dan = {2,3,4,5,6,7,8,9};
		int[] gop = {2,3,4,5,6,7,8,9};
		int[][] gugudan = {dan, gop};
		for(int i = 0; i<dan.length; i++) {
			dan[i] = dan[i]+2;
		for(int j = 0; j<gop.length; j++) {
			gop[j] = gop[j]+1;
			
			
		}
	}
		

	}
	

}
