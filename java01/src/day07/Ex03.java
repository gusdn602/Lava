package day07;
/*
 ���� 2]
	���� 10���� ������ �迭�� ����� 
	�����ϰ� 1 ~ 50 ���� ���� �߻����Ѽ�
	�迭�� ���
	�迭�� 5��°���� �����͸� ���� ����� �����ϼ���.
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
