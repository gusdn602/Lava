package home;

import java.util.*;
public class Minus {
	int minus;
	double no1;
	double no2;
	
	public Minus() {}
	
	public int minus(int no1, int no2) {
		this.no1 = no1;
		this.no2 = no2;
		minus = no1 - no2;
		return minus;
	}
	
	public double minus(double no1, double no2) {
		this.no1 = no1;
		this.no2 = no2;
		double minus = no1 - no2;
		return minus;
	}

	public static void main(String[] args) {
		Minus minus = new Minus();

	}

}
