package day08;

import java.util.Arrays;

/*
 comm 1]
	"Pengsoo Good!"
	이라는 문자열은 한 문자씩 꺼내서 
	배열로 저장하고 
	하나씩 꺼내서 출력하세요.
 */
public class Ex01 {

	public static void main(String[] args) {
		String peng = "pengsoo Good!";
		char[] p = new char[peng.length()]; 
		char idx = 0;
		for(int i=0; i <peng.length(); i++) {
			p[i] = peng.charAt(i);
		
		}
		System.out.print(Arrays.toString(p));
	}

}
