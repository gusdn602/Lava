package day07;
import java.util.Arrays;

import javax.swing.*;
public class Solv01 {

	public static void main(String[] args) {
		String str = JOptionPane.showInputDialog("���ڿ� �ƹ��ų� �־��ּ���");
		char[] ch = new char[str.length()]; //���ڿ��� ���̸�ŭ ���ڹ迭�� ����� �ش�.
		// ���ڿ� ������ ���ڹ迭
		char[] ch1 = new char[str.length()];
		
		//���ڿ��� ���̸�ŭ �ݺ��ؼ� 
		//���ڸ� ������
		//���� ���ڸ� ���� ���ڹ迭�� �������� �־�д�.
		for(int i = 0; i< str.length(); i++) {
			ch[i] = str.charAt(i);
			ch[i] = str.charAt(str.length() - 1 -i);
		}
		System.out.println("���ڿ� :" + str);
		System.out.println("ch :" + Arrays.toString(ch));
		System.out.println("ch1 :" + Arrays.toString(ch1));
		System.out.println("���ڿ� :" + str + "\nch :" + 
		Arrays.toString(ch)+ "/nch1" + Arrays.toString(ch1));
		
		JOptionPane.showMessageDialog(null, "���쾾 ����!!!");
	}

}
