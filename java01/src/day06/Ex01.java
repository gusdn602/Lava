package day06;
/*
 문제 1]
		'A' ~'J' 까지의 문자를 순차적으로 만들어서
		배열에 넣어서 각 문자를 하나씩 꺼내서 소문자로 변경하고 
		출력하세요.
		
		배열에 담긴 내용을 문자열로 확인해서 출력하세요.
 */
import java.util.*;
public class Ex01 {

	public static void main(String[] args) {
		char arr[] = new char[10];
		char arr2[] = new char[10];
		 
		char tmp = 'a' -'A';
			for(int i = 0; i<10; i++) {
				arr[i] = (char)('A' + i);
				arr2[i] = (char)(arr[i] + tmp);
				
			}
			System.out.print(Arrays.toString(arr2));
	}

}
