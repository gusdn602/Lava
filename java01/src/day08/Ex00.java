package day08;

import java.util.Arrays;

/*
 ���� 0] 
	�������� ����ϴµ� 
	�ܰ� ���� �迭�� ���� ó���ϰ� ����ϼ���.
	------------------------------------------
	|��				|		��				|
	------------------------------------------
	
	int[] dan = {2,3,....9};
	int[] gop = {1,2,3,....9};
	--�ʱ�ȭ�� �ݺ�������
	
	int[][] gugudan = {dan, gop};
	
	������´� 
			2 x 1 = 2
			...
			2 x 9 = 18
			----------
			3 x 1 = 3
			....	
 */
public class Ex00 {

	public static void main(String[] args) {
		int[] dan = {2,3,4,5,6,7,8,9};
		int[] gop = {2,3,4,5,6,7,8,9};
		int[][] gugudan = {dan, gop};
		for(int i = 0; i<dan.length; i++) {
			dan[i] = dan[i]+2;
		for(int j = 0; j<gop.length; j++) {
			gop[j] = gop[j]+1;
			
			
		}
	}
		

	}
	

}
