package day07;
import java.util.Arrays;

/*
����� ���� ] 
	45 ~ 1 ���� ������ �迭�� �����
	�迭���� �ζ� ��ȣ�� ������ �ζ� �Ѱ����� ����� ����ϼ���.
	
 */
import javax.swing.*;
public class Ex01 {

	public static void main(String[] args) {
		int[] lotto = new int[6];
		loop:
		for(int i = 0; i<lotto.length; i++) {
			int no = (int)(Math.random()*(45 - 1 +1)+1);
			for(int j = 0; j < i; j++) {
				if(lotto[j] == no) {
					i++;
					continue loop;
				}
			}
			lotto[i] = no;
			
		}
		JOptionPane.showMessageDialog(null, "***��÷��ȣ***\n" + Arrays.toString(lotto));
		
	}

}
