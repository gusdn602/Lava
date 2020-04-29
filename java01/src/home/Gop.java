package home;

import java.util.*;
public class Gop {
	double no1;
	double no2;
	double gop;
	
	public Gop() {}
	
	public double getgop(double no1, double no2) {
		this.no1 = no1;
		this.no2 = no2;
		this.gop = no1 * no2;
		return gop;
	}
	public static void main(String[] args) {
		Gop gop = new Gop();

	}

}
