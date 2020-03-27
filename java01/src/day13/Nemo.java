package day13;

public class Nemo extends Figure {
	private int mit;
	private int nop;
	@Override
	public double dohall(int... a) {
		mit = a[0];
		nop = a[1];
		return mit*nop;
		
	}

}
