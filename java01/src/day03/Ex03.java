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
		int home = 1;
		
		int fec = 2;
		
		int edu = 3;
		
		int store = 4;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("�ڵ带 �Է��Ͻÿ�");
		int code = sc.nextInt();
		if (!(code >= 1 && code <= 4)) {
			System.out.println("�������� �ʴ� �ڵ��Դϴ�.");
			return;
		}
		System.out.println("��뷮�� �Է��Ͻÿ�");
		int  can = sc.nextInt();
		if (!(code >= 1 && code <= 4)) {
			System.out.println("�������� �ʴ� �ڵ��Դϴ�.");
			return;
		}
			
	
		
		if(code == 1) {
			System.out.println("�̹��� �������� " + (3800 + can * 245) + " �Դϴ�.");
		} else if(code == 2 ){
		 	System.out.println("�̹��� �������� " + (2400 + can * 157) + " �Դϴ�.");
		} else if(code == 3){
			System.out.println("�̹��� ��������" + (2900 + can * 169) + "�Դϴ�.");	
		} else if(code == 4){
			 System.out.println("�̹��� ��������" + (3200 + can *174) + "�Դϴ�.");
		} 
	}

	

	public static void main(String[] args) {
		new Ex03();

	}

}
