package day03;

/*
���� 3]
ȭ�� �µ� 100���� 
���� �µ� ����� �˾ƺ��� ���α׷��� �ۼ��ϼ���.

���� ] 
	�����µ� = 5 / 9 * (ȭ���µ� - 32)
*/	

/*
 	������ ���� ���
 		
 		����+, -, *, /, % ����	 ==> ����
 		���� +|-|*|/|% ����	==> ����	
 		���� +|-|*|/|% �Ǽ� 	==> �Ǽ�
 		���� -|+|*|/|% ���ڿ�	==> ����
 		���� + ���ڿ�			==> ���ڿ�
 		�Ǽ� + ���ڿ�			==> ���ڿ�
 		���� + ���ڿ� 			==> ���ڿ�
 		������ + ���ڿ�			==> ���ڿ�
 */
public class Hw03 {

	public static void main(String[] args) {
		/*
		System.out.println(2 + 3 / 3);
		System.out.println((2 + 1) * 5);
		*/
		
		//�����µ� = 5 / 9 * (ȭ���µ� - 32)
		
		//ȭ���µ� ���� �����
		double fr = 100;
		//int no = (int) 3.14f;
		
		//���� �µ� ����ϰ�
		// ���� ] ������ ������ ���� ����� ������ ���´�.
		double cl = 5 / 9. * (fr - 32);
		
		//����ϰ�
		System.out.println("ȭ���µ�" + fr + "�� �����µ� [" + (int)(cl * 10 + 5)/ 10f + "]�Դϴ�.");
	}

}