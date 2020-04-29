package home;

import java.util.*;
import javax.swing.*;
public class Program {
	double result;
	
	public Program() {
		//minus();
		gop();
	}
	
	// 더하기 기능
	public double sum(int no1, int no2) {
		Plus plus = new Plus();
		result = plus.getPlusResult(no1, no2);
		return result;
	}
	
	// 빼기 기능
	public double minus() {
		Minus getminus = new Minus();
		Scanner sc = new Scanner(System.in);
		System.out.println("첫번째 수를 입력하세요");
		getminus.no1 = sc.nextDouble();
		System.out.println("두번째 수를 입력하세요");
		getminus.no2 = sc.nextDouble();
		result = getminus.minus(getminus.no1, getminus.no2); 
		System.out.println(getminus.no1 + "-" + getminus.no2 + "=" + result + "입니다.");
		return result;
	}
	// 곱하기 기능
	public double gop() {
		Gop getgop = new Gop();
		String noo1 = JOptionPane.showInputDialog("첫번째 수를 입력하세요");
		getgop.no1 = Integer.parseInt(noo1);
		String noo2 = JOptionPane.showInputDialog("두번째 수를 입력하세요");
		getgop.no2 = Integer.parseInt(noo2);
		result = getgop.getgop(getgop.no1,getgop.no2);
		JOptionPane.showMessageDialog(null, result);
		return result;
	}
	// 나누기 기능
	public double nanugi(double no1, double no2) {
		Nanugi getnanum = new Nanugi();
		result = getnanum.nanura(no1, no2);
		return result;
	}
	

	
	
	public static void main(String[] args) {
		Program pro = new Program();
		
	}
}
