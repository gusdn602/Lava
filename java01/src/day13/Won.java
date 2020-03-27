package day13;

public class Won extends Figure {
	private int ban;
	@Override
	public double dohall(int... a) {
		ban = a[0];
		return 2*3.14*ban;
	}

}
