package Bochung;

import java.util.Arrays;

public class Be10 {

	public static void main(String[] args) {
		int[][] be = new int[5][5];
		
		int no1 = 1;
		int no2 = 101;
		for(int i = 0; i<be.length; i++) {
			for(int j = 0; j<be[i].length; j++) {
				int val = 0 ;
				if(i%2 == 0) {
					val = no1++;
				} else {
					val = no2++;
				}
				be[i][j] = val;
			}
		}
		
		/*
		for(int[] num : be) {
			System.out.println(Arrays.toString(num));
		}
		*/
		int[][] b2 = new int[5][5];
		for(int i = 0; i<b2.length; i++) {
			for(int j = 0; j<b2[i].length; j++) {

				b2[i][j] = be[j][i];
				
			}
		}
		for(int[] num : b2) {
			System.out.println(Arrays.toString(num));
		}
		
	}

}
