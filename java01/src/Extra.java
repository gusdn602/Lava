/*
 	extra ] 
 		1, 1, ...
 		�� �����ϴ� �Ǻ���ġ ������ 10������ϼ���.
 		
 		����]
 			�Ǻ���ġ ���� 
 				���� �� ���� ���� ������ ����...
 				
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
