package day04;
import java.util.*;
/*
 	���� 2]
 		�� ���� �ֻ����� ������ ���� 6�� �Ǵ� ��츦 ����ϼ���.
 */
public class Ex02 {

	public static void main(String[] args) {
		
		
		for(int i = 1; i<=6; i++) {
			for(int j = 1; j<=6; j++) {
				if(i + j == 6) {
					System.out.println("ù��° ���� " + i + "�ι�° ���� :" +j );
				} 
			}
		}

	}
}
