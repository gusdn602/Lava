package day16;

import java.util.*;

import javax.swing.JOptionPane;

import java.text.*;
public class Test02 {

	public Test02() {
		//Calendar Ŭ������ ���� �ð��� ����� ������ �ݵ���
		Calendar cal = Calendar.getInstance();
		//Calender �����ʹ� Date Ÿ������ ��ȯ ��ų�� getTime()�� ����ؼ� ��ȯ��Ų��.
				Date date = cal.getTime();
		//��¹��ڿ� ��ȯ �ް�
		String sTimme = getStr(date);
		
		//JOptionPane���� ����ϰ�
		JOptionPane.showMessageDialog(null, sTimme);
	}

	public static void main(String[] args) {
		new Test02();

	}
	
	//Date Ÿ���� �����͸� �Է��ϸ� ���Ŀ� �µ��� ���ڿ��� ���� ��ȯ���ִ� �Լ�
	public String getStr(Date date) {
		SimpleDateFormat from = new SimpleDateFormat("yyyy�� MM�� dd�� E���� HH�� mm�� ss��");
		String result = from.format(date); 
		return result;
	}

}
