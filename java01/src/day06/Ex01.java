package day06;
/*
 ���� 1]
		'A' ~'J' ������ ���ڸ� ���������� ����
		�迭�� �־ �� ���ڸ� �ϳ��� ������ �ҹ��ڷ� �����ϰ� 
		����ϼ���.
		
		�迭�� ��� ������ ���ڿ��� Ȯ���ؼ� ����ϼ���.
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
