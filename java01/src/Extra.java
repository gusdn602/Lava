/*
 	extra ] 
 		1, 1, ...
 		로 시작하는 피보나치 수열을 10개출력하세요.
 		
 		참고]
 			피보나치 수열 
 				앞의 두 수를 더한 값들의 집합...
 				
 				1, 1, 2, 3, 5, ...
 */
public class Extra {

	public static void main(String[] args) {
		int j = 1;
		int k = 1;
		System.out.print(j + " ," + k + ", ");
		for(int i  = 0; i<8; i++) {
			int result = j + k;
			j = k;
			k = result;
			System.out.print(k + ", " );
		}
	}

}
