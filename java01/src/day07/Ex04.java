package day07;
/*
 ���� 3 ]	
		ȸ���� �̸�, ��ȭ��ȣ, �̸����� ������ �迭�� ����� - ���ڿ� �迭 3��
		�����͸� �Է��� ����
		
		�̸��� �Է��ϸ�
		�� ����� �����͸� ��� ������ �迭�� ����
		�����͸� �ְ� ����ϼ���.
 */
import java.util.*;
import javax.swing.*;
public class Ex04 {

	public static void main(String[] args) {
		String[] name = {"ȸ��1", "ȸ��2", "ȸ��3", "ȸ��4", "ȸ��5"};
		String[] tel = {"010-1111-2222", "010-2222-3333", "010-3333-4444", "010-4444-5555", "010-5555-6666"};
		String[] email = {"hea1@naver.com", "hea2@naver.com", "hea3@naver.com", "hea4@naver.com", "hea5@naver.com"};
		String str = JOptionPane.showInputDialog("�̸��� �Է��ϼ���");
		
		int idx = -1;
		for(int i = 0; i<name.length; i++) {
			if(name[i].equals(str)) {
				idx = i;
				break;
			}
			
		}
		JOptionPane.showMessageDialog(null, "\n" + name[idx] + "\n" + tel[idx] + "\n" + email[idx]);
		
	}
	

}
