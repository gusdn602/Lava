package hw_package.day02;

import javax.swing.*;
import java.util.*;

/*
	�����ϰ� ���� �ټ����� �߻����Ѽ� 
	ArrayList �� ���
	�� ArrayList �� ��ȯ���ִ� �Լ��� �ۼ��ϰ�
	�����غ�����.
	�Լ� �̸��� getList �� �ۼ��ϼ���.
 */
	/*
	 	�Լ� �ۼ� ����
	 	����������  [�Ӽ�] ��ȯ��Ÿ�� �Լ���(�Ű���������Ʈ) {
	 		����...
	 		return [������..]; <-- ��ȯ�� ���°�� ���� ����
	 	}
	 */
public class Ex01 {
	private int num = (int)(Math.random() * (100 - 1 +1)+1);
	
	
	public Ex01() {
		ArrayList<Integer> list1 = getList();
		System.out.println(((ArrayList)getList()).get(num));
		for(int no : list1) {
			System.out.print(no + " | ");
		}
	}
	
	public ArrayList getList() {
		ArrayList list = new ArrayList();
		for(int i= 0; i<100; i++) {
			list.add(i);
		}
		return list;
	}
	
	public static void main(String[] args) {
		new Ex01();
	}

}
