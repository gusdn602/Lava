package day15;

import javax.swing.*;
import java.util.*;
import java.util.regex.*;

public class Test05 {
	public Test05() {
		//��ȭ��ȣ�� �Է¹޾Ƽ� �Է��� ��ȣ�� �´� �������� �˻��غ�����.
		String val= JOptionPane.showInputDialog("��ȭ��ȣ�� �Է����ּ���"); 
		//1. Pattern Ŭ������ �̿��ؼ� �˻��ϰ� ���� ���Խ� ������ �����.
		//		�׷��� Pattern Ŭ������ ������ �Լ��� ȣ���� �� ������ ���߾� ���� Ŭ�����̹Ƿ�
		//		�� Ŭ������ ��ü�� ������� �Լ��� �Ӽ��� static�̸鼭 ��ȯ���� Pattern�� �Լ��� ã�Ƽ� ����ϸ� �� ���̴�.
		//		API������ �������� �׷��Լ��� compile(String regex) �̹Ƿ� �� �Լ��� ����ϸ� �ǰڴ�.
		Pattern pattern = Pattern.compile("^0[0-9]{2}-[0-9]{3,4}-[0-9]{4}$");
		/*
		 	2. �� Ŭ�������� ���Խ� ������ �˻��� �޶�� ��û.
		 		������ �˻��ϴ� �Լ��� matcher()
		 		�� �Լ��� �˻� ����� matcher ��� Ŭ���� Ÿ������ ��ȯ�� ���ش�.
		 		���� ����� ���� ��� ������ Matcher Ŭ�������� ó���� �ؾ� �� ���̴�.
		 		
		 		����� �˾Ƴ��� ���
		 			
		 			mathes()
		 */
		Matcher match = pattern.matcher(val);
			
			//���� �˻� �����  match�� ������ �Ǿ� ������ ������ ����ϸ� �ȴ�.
		if(match.matches()) {
			JOptionPane.showMessageDialog(null, "�ùٸ� ��ȭ��ȣ �Դϴ�.");
		} else {
			JOptionPane.showMessageDialog(null, "�߸���  ��ȭ��ȣ �Դϴ�.");
		}
		
	}
	public static void main(String[] args) {
		new Test05();

	}

}