package day09;
/*
 ���� 1]
	�������� �����ϰ� �߻��ؼ�		--�Լ��� ... 
	�� �������� �Է��ϸ� ���� ���̸� �����ִ� �Լ��� 
	���� �ѷ��� �����ִ� �Լ��� �����ϰ� 
	�����ؼ� ����ϼ���.
 */
import java.util.*;
import javax.swing.*;

public class Ex01 {
	int ban = (int)(Math.random() * (100 - 1 +1)+1);
	
	public Ex01() {
		dool();
		nall();
		print();
	}
	
	public double dool() {
		return 2*3.14*ban; 
	}
	
	public double nall() {
		return 	3.14 * ban * ban; 
	}
	
	public void print() {
		System.out.println("������ :" + ban + "\n���� ���̴� : " + nall() + "\n���� �ѷ���" + dool());
	}
	
	public static void main(String[] args) {
		new Ex01();

	}

}
