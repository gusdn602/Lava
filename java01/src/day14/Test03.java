package day14;

import javax.swing.*;
public class Test03 {
	public Test03() {
		//getNum()�� ���ܸ� �����ϴ� �Լ��̹Ƿ�
		//�̷� �������� �Լ��� �ݵ�� ����ó���� ����� �Ѵ�.
		int num = 0;
		
		try {
			num = getNum();
		} catch(NumberFormatException e) {
			e.printStackTrace();
			//���� Ŭ������ ��� �� ���� �� �������� ����ϴ� ���� ��Ģ�̴�.
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	// ���ڸ� �Է� �޾Ƽ� ������ ��ȯ���ִ�  getnum() �Լ�
	public int getNum() throws NumberFormatException {
		//��ȯ�� ���� ���� ���� �� �ʱ�ȭ
		int num = 0;
		
		//���ڸ� �Է¹޾Ƽ� ���ڿ��� ���
		String no = JOptionPane.showInputDialog("���ڸ� �Է��ϼ���!!");
		
		//���ڿ��� ������ ��ȯ�ϰ�
		num = Integer.parseInt(no);
		if(num <0) {
			//���� ����  �����Ű��
			//���� ] 
			//		throwsnew ����Ŭ���� ������();
			throw new NumberFormatException();
		}
		/*
		 num������ �����͸� ���� ��� ���ܰ� �߻��� �� �ִ�.
		 ���� ��Ģ�� �� �κ��� ����ó���� �ؾ� ������
		 �̹����� �� �Լ��� ȣ���� ������ ����ó���� ���ѱ��.
		 */
		return num;
		
	}
	public static void main(String[] args) {
		new Test03();

	}

}

