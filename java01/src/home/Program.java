package home;

public class Program {
	int result;
	
	public Program() {}
	// 더하기 기능
	public int sum(int no1, int no2) {
		Plus plus = new Plus();
		int result = plus.getPlusResult(no1, no2);
		return result;
	}
	
	// 빼기 기능
	 
	// 곱하기 기능
	
	// 나누기 기능
	
	

	
	
	public static void main(String[] args) {
		Program pro = new Program();
		
	}
}
