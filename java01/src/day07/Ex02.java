package day07;
/*
 ���� 1] 
	���ĺ� 10���� ������ �迭�� �����
	�빮�� 10���� �����ϰ� �����ؼ� �迭�� �����ϰ�
	����� �迭�� ���� ����� �����ؼ� 
	����ϰ�, 
	���� �迭�� �ҹ��ڷ� ������ �� 
	�� �迭�� ����ϼ���
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
