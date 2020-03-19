package day06;

public class Sovl10 {

	public Sovl10() {
		solv1();
	}

	public static void main(String[] args) {
		int no = 1;
		int i = 0;
		while(i <5) {
			int j = 0;
			System.out.printf("%3d", no++);
			j++;
		}
		System.out.println();
		i++;
	}

	
	public void solv1() {
		for(int i = 0; i <5; i++) {
			//각 행의 시작숫자 만들기
			int no = 1;
			for(int j = 0; j <=i; j++) no += j;
			
			//각 행의 각셀의 숫자 출력하기
			for(int j = 0; j <=i; j++) no += j;{
				System.out.printf("%3d", no + j);
			}
			System.out.println();
		}
	}

}
