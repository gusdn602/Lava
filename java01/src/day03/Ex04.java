package day03;
import java.util.*;
/*
 	���� 3]
 		�μ� ��ȣ�� �Է��ϸ� 
 		�μ��̸��� ������ִ� ���α׷��� �ۼ��ϼ���.
 		
 		10 - �ѹ���
 		20 - ȸ���
 		30 - ������
 		40 - �����
 		������ - ������ȸ��...
 */
public class Ex04 {

	public Ex04() {
		ex04();
	}
public void ex04() {
	Scanner sc = new Scanner(System.in);
	System.out.println("�ڵ带 �Է��ϼ���");
	int code = sc.nextInt();
	
	if(code == 10) {
		System.out.println("�ѹ����Դϴ�.");
	} else if(code == 20){
		System.out.println("ȸ����Դϴ�.");
	} else if(code == 30) {
		System.out.println("�������Դϴ�.");
	} else if(code == 40) {
		System.out.println("������ȸ��");
	}
}
	public static void main(String[] args) {
		new Ex04();

	}

}
