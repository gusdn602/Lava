package day09;
/*
 	���� �ΰ��� �Է��ϸ�
 	�� ���ڸ� ����������ִ� �Լ����� �����
 	������ �ؼ� 
 	������ ����ϰ� 
 	������ ����ϴ� ���α׷��� �ۼ��ϼ���.
 */
public class Test02 {
	public Test02() {
		int gap = plus(3,7);
		int gap2 = minus(5,6);
		int gap3 = gop(100,100);
		int gap4 = manu(150,100);
		
		System.out.println(gap);
		System.out.println(gap2);
		System.out.println(gap3);
		System.out.println(gap4);
	}
	public int plus(int no1, int no2) {
	int sum = no1 + no2;
	return sum;
	}
	
	public int minus(int no1, int no2) {
		int minus = no1 - no2;
		return minus;
	}
	
	public int gop(int no1, int no2) {
		int gop = no1 * no2;
		return gop;
	}
	
	public int manu(int no1, int no2) {
		int nanugi = no1/no2;
		return nanugi;
	}
	
	
	
	public static void main(String[] args) {
		new Test02();
}

	}



