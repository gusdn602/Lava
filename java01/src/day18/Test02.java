package day18;

import java.io.*;
import java.util.*;
public class Test02 {

	public Test02() {
		Properties prop = new Properties();
		
		//���� ���� �غ� �ϰ�
		FileInputStream fin = null;
		
		//���� �а�
		try {
			fin = new FileInputStream("src/day18/Sample2.properties");
			
			//prop�� ���ϳ��� �ε��ϰ�
			prop.load(fin);
		}catch(Exception e) {
			e.printStackTrace();
		}
		System.out.println("���� �̿� ��	��: " + prop.getProperty("name"));
		System.out.println("���� �̿� ��	��: " + prop.getProperty("age"));
		System.out.println("���� �̿� ��ȭ��ȣ: " + prop.getProperty("tel"));
		System.out.println("���� �̿� ��	��: " + prop.getProperty("addr"));
	}

	public static void main(String[] args) {
		new Test02();

	}

}
