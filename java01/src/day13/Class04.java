package day13;

public class Class04 extends Test01 {
	private int banjirm;
	@Override
	public double calcArrea(int... a) {
		banjirm = a[0];
		return banjirm * banjirm * 3.14;
	}

}
