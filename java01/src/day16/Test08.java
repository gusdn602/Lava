package day16;

import java.util.*;
public class Test08 {

	public Test08() {
		//Vector �����
		Vector vec = new Vector();
		//������ ä���
		vec.add(new String("abcd"));
		vec.add(10);		// <== int  -----Boxing ---> Integer -------> Object
		vec.add(3.14);		//double --- Boxting ---> Double ----> Object
		vec.add(new int[] {1,2,3});
		
		//������ ������
		//*** �÷��� �ȿ��� ��� �����͸� ���ÿ� ������ �� �ִ�. �迭�� �Ѱ��� Ÿ�Ը� ������ �� �ִ�.
		 for(int i = 0; i<vec.size(); i++) {
			 Object o = vec.get(i);
			 if(o instanceof String) {
				 System.out.println((String) o);
			 } else if(o instanceof Integer) {
				 System.out.println((int) o);
			 } else if(o instanceof Double) {
				 System.out.println((double) o);
			 } else if(o instanceof int[]) {
				 System.out.println(Arrays.toString((int[]) o));
			 }
			 System.out.print("�׳� ��� :");
			 System.out.println(o);
		 }
	}

	public static void main(String[] args) {
		new Test08();

	}

}
