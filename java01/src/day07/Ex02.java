package day07;
/*
 문제 1] 
	알파벳 10개를 저장할 배열을 만들고
	대문자 10개를 랜덤하게 추출해서 배열에 저장하고
	저장된 배열을 얕은 복사로 복사해서 
	출력하고, 
	원래 배열을 소문자로 변경한 후 
	두 배열을 출력하세요
 */
import javax.swing.*;
import java.util.*;
public class Ex02 {

	public static void main(String[] args) {
		char[] spel = new char [10];
		char[] num1;
		for(int i = 0; i<spel.length; i++) {
			char al = (char)(Math.random() * ('Z' - 'A'  + 1)+'A');	
			spel[i] = al;	
		}
		num1 = spel;
		JOptionPane.showMessageDialog(null, Arrays.toString(spel));
		JOptionPane.showMessageDialog(null, Arrays.toString(num1));
		for(int j = 0; j<num1.length; j++) {
			num1[j] += 'a' - 'A';
		}
		JOptionPane.showMessageDialog(null, Arrays.toString(spel));
		JOptionPane.showMessageDialog(null, Arrays.toString(num1));
	}
	

}
