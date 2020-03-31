package day16;

import java.util.*;

import javax.swing.JOptionPane;

import java.text.*;
public class Test04 {

	public Test04() {
		// ChoiceFormat�� ���� �� limits, formats�� �ϳ��� ���� ���� �̚�.
		/*
		 ����� ����
		 	60#D		<=�� �ǹ�
		 	70<C 		< �� �ǹ�
		 	
		 	�̰� | �� �̿��ؼ� �����ؼ� ����ϸ� �ȴ�.
		 */
		String pettern = "0#F | 60#D | 70#C | 80<B | 90#A";
		//60#D�� �ǹ̴� 60 <=�� ���� ���ں��ٴ� ���� ���� D�� ó���Ѵ�.
		
		
		while(true) {
			String sno = JOptionPane.showInputDialog("������ �Է��ϼ���");
			if(sno.equals("q")) {
				break;
			}
			ChoiceFormat form = new ChoiceFormat(pettern);
			int score = 0;
			try {
				score = Integer.parseInt(sno);
			}catch(Exception e) {
				JOptionPane.showMessageDialog(null, "�߸��� �����Դϴ�");
			}
			
			//���� ��� ���ϰ�
			String grade = form.format(score);
			
			//��� ������ְ� 
			JOptionPane.showMessageDialog(null, "���� :" + score + "\n����" + grade);
		}
	}

	public static void main(String[] args) {
		new Test04();

	}

}
