package day08;

import java.util.Arrays;

/*
 comm 1]
	"Pengsoo Good!"
	�̶�� ���ڿ��� �� ���ھ� ������ 
	�迭�� �����ϰ� 
	�ϳ��� ������ ����ϼ���.
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
