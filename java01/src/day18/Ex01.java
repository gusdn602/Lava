package day18;

import java.io.*;
import java.util.*;
import javax.swing.*;
public class Ex01 {
/*
 	���� 1 ]
 		1. Ex01.txt�� ����� �����͸� Properties�� ��� 
 		2. Ű ���� ��� ������
 		3. �����͸� �����ϰ�
 		4. ������ �����ּ���.
 		5. �޼���â�� ����� ������ ������ּ���
 */
	public Ex01() {
		Properties pr = new Properties(); 
		
		FileInputStream ou = null;
		
		try {
			ou = new FileInputStream("src/day18/Ex01.txt");
			pr.load(ou);
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		
	}

	public static void main(String[] args) {
		new Ex01();

	}

}
