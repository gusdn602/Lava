package home;

import java.util.*;
import javax.swing.*;
public class Program {
	double result;
	
	public Program() {
		//minus();
		gop();
	}
	
	// ���ϱ� ���
	public double sum(int no1, int no2) {
		Plus plus = new Plus();
		result = plus.getPlusResult(no1, no2);
		return result;
	}
	
	// ���� ���
	public double minus() {
		Minus getminus = new Minus();
		Scanner sc = new Scanner(System.in);
		System.out.println("ù��° ���� �Է��ϼ���");
		getminus.no1 = sc.nextDouble();
		System.out.println("�ι�° ���� �Է��ϼ���");
		getminus.no2 = sc.nextDouble();
		result = getminus.minus(getminus.no1, getminus.no2); 
		System.out.println(getminus.no1 + "-" + getminus.no2 + "=" + result + "�Դϴ�.");
		return result;
	}
	// ���ϱ� ���
	public double gop() {
		Gop getgop = new Gop();
		String noo1 = JOptionPane.showInputDialog("ù��° ���� �Է��ϼ���");
		getgop.no1 = Integer.parseInt(noo1);
		String noo2 = JOptionPane.showInputDialog("�ι�° ���� �Է��ϼ���");
		getgop.no2 = Integer.parseInt(noo2);
		result = getgop.getgop(getgop.no1,getgop.no2);
		JOptionPane.showMessageDialog(null, result);
		return result;
	}
	// ������ ���
	public double nanugi(double no1, double no2) {
		Nanugi getnanum = new Nanugi();
		result = getnanum.nanura(no1, no2);
		return result;
	}
	

	
	
	public static void main(String[] args) {
		Program pro = new Program();
		
	}
}
