package day06;

import java.util.Arrays;

/*
 ���� 3]
	int[] coin = {10000, 5000, 1000, 500, 100, 50, 10, 1};
	�̶�� �迭�� �غ��ϰ�
	
	79456���� �غ�� ȭ������� ����� �� ������ ȭ������� ��� �ʿ�����
	������ ������ �迭�� ����� ����ϴ� ���α׷��� �ۼ��ϼ���.
 */
public class Ex03 {

	public static void main(String[] args) {
		int[] coin = {10000, 5000, 1000, 500, 100, 50, 10, 1};
		int[] coin2 = new int[8];
		int total = 79456;
		int tmp = total;
		for(int i = 0; i<8; i++) {
			coin2[i] = tmp/coin[i];
			tmp = tmp%coin[i];
		}
		System.out.print(Arrays.toString(coin2));
		
	}

}
