package day04;
/*
 	두 사람이 등산을 하는데
 	한 사람은 이제 등산을 0.54m/s 시작하고
 	한 사람은 정상에서 1.07m/s 내려 오기 시작했다.
 	
 	산의 높이가 7564m라고 가정하고 
 	두 사람이 만나는 시간은 몇 분 몇초 후인지와 높이를 출력해주는 프로그램을 작성하세요.
 */
public class Hw04 {

	public static void main(String[] args) {
		int t = 7564; //산의 높이 저항할 변수
		for(int i = 0; ; i++) {
			//각 초당 올라가는 사람의 높이
			double h1 = 0.54 * i;
			//내려가는 사람의 높이
			double h2 = t - 1.07 * i;
			
			if(h1 > h2) {
				System.out.println("올라가는 사람의 높이 :" + h1);
				System.out.println("올라가는 사람의 높이 :" + h2);
				System.out.println("두 사람이 만난 직후 시간" + (i / 60) + "분 ," + (i % 60) + "초");
				break;
			}
		}

	}

}
