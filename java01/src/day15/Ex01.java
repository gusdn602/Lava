package day15;
/*
	���� 1 ]
		�̸����� �Է¹޾Ƽ�
		�Է¹��� ���ڿ��� �̸��� ���Ŀ� �´��� �ƴ��� �˻��ϼ���.
		�̸��� ������ 
			���ĺ� ���ڷ� 8�� �̻����� �ϰ� @ �������ּ�
		�� ó���ϼ���. 
		���� ] 
			�ѱ� ó�� : [��-�R] - �ѱ��� ���̵� ����������.
			
 */
import java.util.*;
import javax.swing.*;
import java.util.regex.*;
public class Ex01 {

	public static void main(String[] args) {
		String mail = JOptionPane.showInputDialog("�̸����� �Է��ϼ���");
		Pattern p = p.compile(".*[a-zA-z]\d{8}@.*[a-zA-z]{8}.*[a-zA-z]{5}");
		Matcher mat = p.matcher(mail);
		if(mat.matches()) {
			JOptionPane.showMessageDialog(null, "�ùٸ� �̸����Դϴ�.");
		} else {
			JOptionPane.showMessageDialog(null, "�߸��� �̸����Դϴ�.");
		}
	}

}
