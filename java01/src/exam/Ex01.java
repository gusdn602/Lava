package exam;

import javax.swing.*;

/*
 	JOptionPane���� ���ڸ� �Է¹޾Ƽ� 
 	�迭�� ����� 
 	�迭�� ����� �� �ִ� ������ŭ ���ڸ� �Է¹޾Ƽ� 
 	�� ���ڵ��� ���� �����ִ� ���α׷��� �ۼ��ϼ���.
 	��, ���� ���ϴ� ����� �Լ��� ���� ó���ϼ���
 */
import java.util.*;
public class Ex01 {
	/*
	String input = JOptionPane.showInputDialog("���ڸ� �Է��ϼ���");
	int tmp = 0;
	int cnt = 0;
	String[] bee1 = new String[in()];
	
	public Ex01() {
		in();
	}
	
	public int in() {
		tmp = Integer.parseInt(input);
		return tmp;
	}
	
	*/
	//�迭�� ������� Ÿ�԰� ���̰� �ʿ��ϴ�.
	//���⼭ ���ڸ� �Է¹������ ������ 
	//�迭�� ���̷� ����� ���ڸ� �Է¹������ ���̹Ƿ�
	//���� �迭�� ���̿� �ش��ϴ� ���ڸ� �Է¹޾Ƽ� ���������� ��ȯ���ش�.
	
	int len = 0;
	
	while(true) {
		//���� ���� ���ڿ� �Է� �ް�
		String snum = JOptionPane.showInputDialog("�迭�� ���̸� �Է��ϼ���!");
			try {
				len = Integer.parseInt(snum);
				//�� ������ �д´ٸ� ���� ���ڷ� ��ȯ������ ������ ������ �� ���̹Ƿ�
				//�� �ݺ����� �������ش�.
				break;
			} catch(Exception e) {
				JOptionPane.showMessageDialog(null, "���ڰ� �ƴ� ���ڸ� �Է��߽��ϴ�.");
				continue;
			}
			
	}
	int[] num = new int [len];
	
	//�迭�� ����� ���� ���� �迭�� ���ڸ� ä���ش�.
	loop:
	for(int i = 0; i < len; i++) {
		while(true) {
			String sno = JOptionPane.showInputDialog("���ڸ� �Է��ϼ���!");
			try {
				int no = Integer.parseInt(sno);
				//�� ������ �����ϴ� ���� ���� ������ ��ȯ ������ ���������� ������ �� ����̹Ƿ�
				//�迭�� ä���ָ� �ȴ�.
				num[i] = no;
				//���� ���� ���� �����͸� ä���ش�.
				continue loop;
			}	catch(Exception e) {
				//�� ���� �迭�� ä�� ���ڸ� ������ ����̹Ƿ�
				//���ڸ� �ٽ� ������
				continue;
			}
		}
	}

	//���� �迭�� �ϼ� �Ǿ����� ���� ��������
	 int sum = getSum(num);
	 //���
	 JOptionPane.showInputDialog(null, num.toString() + "\n" + "sum :" + sum);
}

/*
public int getSum(int...arr) {
	int sum = 0;
	for(int i =0; i <arr.length; i++) {
		sum +=
	
	return sum;
}
*/

