package home;

public class Plus {
	int sum;
	
	public Plus() {}
	
	public int getPlusResult(int no1, int no2) {
		sum = no1 + no2;
		return sum;
	}
	
	// �� �޼ҵ�� �Ǽ�Ÿ���� ���� �� ���� ���Ͽ� �Ǽ� Ÿ������ ��ȯ���ش�.
	public double getPlusResult(double no1, double no2) {
		double sum = no1 + no2;
		return sum;
	}


	
	public static void main(String[] args) {
		 Plus obj = new Plus();
		 int sum = obj.getPlusResult(5, 7);
		 System.out.println(sum);

	}
}
