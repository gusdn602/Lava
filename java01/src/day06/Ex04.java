package day06;

/*
 	���� 4]
	
	������ 5���� ����� �迭������� 							- �����迭1�� 
	�����ϰ� 2 ~ 30�������� 5�� �������� ���� �Է��ϰ�			- Math.random()
	������ �������� ���� ���� ���̸� ����ؼ� ������ �迭�� �����		- �Ǽ��迭 1�� 
	�� ���� �ѷ��� ����ؼ� ������ �迭�� ����				- �Ǽ��迭 1��
	
	����� ����ϴ� ���α׷��� �ۼ��ϼ���. 					- �ݺ������� ������ ���
	
	��, ������´�
		
		��]
			������ : 10, ���� �ѷ� : 62.8, ���� ���� : 314
		
		�����·� ����ϼ���.
 */
import java.util.*;
public class Ex04 {

	public static void main(String[] args) {
		int ban[] = new int[5];	
		double won[] = new double[5];
		double wond[] = new double[5];
		 
		for(int i = 0; i<5; i++) {
			int b = (int)(Math.random() * (30 - 2 +1)) +2;
			ban[i] = b ;
			won[i] = 2.*3.14*ban[i];
			wond[i] = 3.14*ban[i]*ban[i];
		}
		System.out.println("������ :" + Arrays.toString(ban));
		System.out.println("���� �ѷ� :" + Arrays.toString(won));
		System.out.println("���� ���� :" + Arrays.toString(wond));
	}

}
