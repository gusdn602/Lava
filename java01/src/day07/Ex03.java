package day07;
/*
 문제 2]
	정수 10개를 저장할 배열을 만들고 
	랜덤하게 1 ~ 50 까지 수중 발생시켜서
	배열에 담고
	배열의 5번째까지 데이터를 깊은 복사로 복사하세요.
 */
import javax.swing.*;
import java.util.*;
public class Ex03 {

	public static void main(String[] args) {
		int[] num = new int[10];
		int[] num2 = new int[5];
		for(int i = 0; i<num.length; i++) {
			int no = (int)(Math.random() * (50 - 1 +1 )+1);
			num[i] = no;	
			
		}
		System.arraycopy(num, 0, num2, 0, 5);
		JOptionPane.showMessageDialog(null, Arrays.toString(num2));
	}

}
