package day18;

import java.io.*;
import java.util.*;
public class Test01 {
/*
 	Sample.txt ������ �о Map���� �����ϱ�
 */
	public Test01() {
		//Properties ���� �����
		Properties prop = new Properties();
		//�ܺ� ���ϰ� ������ �����̴�.
		//�� �۾��� ���Ŀ� �� ������ Io���� ��Ȯ�� ��������.
		FileInputStream fin = null; //������ ���� ���� ���ܰ� �߻��� ���̱� ������ �ϴ� null�� �ʱ�ȭ ���ְ�
									// try ������ ������ �����͸� �����Ѵ�.
		try {
			fin = new FileInputStream("src/day18/Sample_ko.txt");
			//��δ� ���� ��θ� ����ؼ� �츮�� ���� �۾��ϴ� ������ (d:\class\Java\git\Java01\src\day18\Sample.txt)�� �����ص� ����
			//��Ŭ���� �ȿ� �����͸� ����� �̰��� ��Ŭ���� �ڽ��� ��θ� ���Ӱ� �����ؼ� ó���ϹǷ� 
			//���� ���ó�� ������Ʈ ������ ��θ� ã���ָ� �ȴ�.
			
			//���� �� ������ ������ Properties�� �е��� �Ѵ�.
			prop.load(fin);
			//load �Լ��� ���� �Ǵ� ���� �̹� ������ ������ �о  Map���� ó�� �س��Ҵ�.
		}catch(Exception e) {
			e.printStackTrace();
			
		}
		
		//�������ʹ� ��ġ HashMap�� �����Ͱ� ����� ��ó�� ����ϸ� �ȴ�.
		//Properties������ ���� ������  = �� �������� ������ Ű���̰� �������� �����Ͱ� �ȴ�.
		//		id = increpas-cl2 ��� �Է��ϸ� map.put("id", "increpas-cl2")�ϰ� �Է��� �Ͱ� ���� ����̴�.
		String name = (String)prop.get("name");
		String age = (String)prop.get("age");
		System.out.println("������ ¦�� �̸� : " + name);
		System.out.println("������ ¦�� ���� : " + age);
		System.out.println("������ ¦�� ����ó : " + prop.get("tel"));
		System.out.println("������ ¦�� �ּ� : " + prop.get("addr"));
	}

	public static void main(String[] args) {
		new Test01();

	}

}
