package day03;
/*
 	���� 1]
 		�Խ��ǿ� ���� ���������� 15�� ���� ǥ���� �� �ִ�.
 		�Խù��� ������ �����ϰ� (0~100) �߻��� ��
 		�ʿ��� ������ ���� ����ؼ� ����� �ִ� ���α׷��� �ۼ��ϼ���
 		�� �Խù� ���� 0�� ���� 1�������� �ʿ�� �Ѱ����� �Ѵ�.
 */
public class Ex02 {

	public Ex02() {
		page();
	}
public void page() {
	 int num = (int)(Math.random()* (100 -1 + 1)) +0;
	 int page = 1;
	 
	 /*
	 	 15�� - 1������
	 	 16�� - 2������
	 	 
	  */
	  
	 if(num % 15 == 0) {
		 if(num == 0) {
			 System.out.println("�ʿ��� �������� :" + num % 15);

		 } else {
			 System.out.println("�ʿ��� �������� :" + num % 15);
			 
				 
		 }
	 } else {
		 if(num % 15 !=0) {
			 System.out.println("�ʿ��� �������� :" + num % 15);
		 }
	 }
}
	public static void main(String[] args) {
		new Ex02();

	}

}
