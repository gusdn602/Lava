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
	
	
	

	public static void main(String[] args) {
		new Ex01();
	}

}
