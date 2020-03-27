package day15;

import java.util.*;
public class Test03 {

	public static void main(String[] args) {
		Random rand1 = new Random();
		
		for(int i = 0; i<10; i++) {
			int rnd = rand1.nextInt(100);		//0 ~ 100사이의 난수를 발생시켜라
			boolean bRnd = rand1.nextBoolean();
			System.out.println("rnd : " + rnd + ", brnd :" + bRnd);
		}
		
		Random r1 = new Random(10);
		for(int i = 0; i<10; i++) {
			int rnd = rand1.nextInt(100);		//0 ~ 100사이의 난수를 발생시켜라
			boolean bRnd = rand1.nextBoolean();
			System.out.println("rnd : " + rnd + ", brnd :" + bRnd);

		}

	}
}
