package day03;
import java.util.*;
/*
 	���� 2]
 		���� ����� ����ϴ� ���α׷��� �ۼ��ϼ���.
 					�ڵ�		�⺻���	�����
 		������		(1)		3800	245	
 		�����		(2)		2400	157
 		������		(3)		2900	169
 		�����		(4)		3200	174
 		
 		����� = �⺻��� + ��뷮 * �����
 		
 		������ڵ�� ��뷮�� �Է¹޾Ƽ�
 		���� ����� ������ִ� ���α׷��� �ۼ��ϼ���.
 */
public class Ex03 {

	public Ex03() {
		ex03();
	}
	
	public void ex03() {
		Scanner sc = new Scanner(System.in);
		System.out.println("�ڵ带 �Է��Ͻÿ�");
		int code = sc.nextInt();
		System.out.println("��뷮�� �Է��Ͻÿ�");
		int  can = sc.nextInt();
		
		int home = 1;
		int home1 = 3800;
		int home2 = 245;
		
		int fec = 2;
		int fec1 = 2400;
		int fec2 = 157;
		
		int edu = 3;
		int edu1 = 2900;
		int edu2 = 169;
		
		int store = 4;
		int store1 = 3200;
		int store2 = 174;
	
	
	
	
	
		if(code == 1) {
			System.out.println("�̹��� �������� " + (home1 + can * home2) + " �Դϴ�.");
		} else if(code == 2 ){
		 	System.out.println("�̹��� �������� " + (fec1 + can * fec2) + " �Դϴ�.");
		} else if(code == 3){
			System.out.println("�̹��� ��������" + (edu1 + can * edu2) + "�Դϴ�.");	
		} else if(code == 4){
			 System.out.println("�̹��� ��������" + (store1 + can *store2) + "�Դϴ�.");
		} 
	}

	

	public static void main(String[] args) {
		new Ex03();

	}

}
