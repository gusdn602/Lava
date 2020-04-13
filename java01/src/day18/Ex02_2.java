package day18;
import java.util.*;
public class Ex02_2 extends Ex02 {
	private String name;
	private int num, ban, kor, eng, math;
	private double sum, avg;
	public Ex02_2() {
		setSum();
		setAvg();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public int getBan() {
		return ban;
	}

	public void setBan(int ban) {
		this.ban = ban;
	}

	public int getKor() {
		return kor;
	}

	public void setKor(int kor) {
		this.kor = kor;
	}

	public int getEng() {
		return eng;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}

	public int getMath() {
		return math;
	}

	public void setMath(int math) {
		this.math = math;
	}

	public double getSum() {
		return sum;
	}

	public void setSum(double sum) {
		this.sum = sum;
	}

	public double getAvg() {
		return avg;
	}

	public void setAvg(double avg) {
		this.avg = avg;
	}
	
	public void setAvg() {
		this.avg =  kor + eng + math/100;
	}
	
	public void setSum() {
		this.sum = kor + eng + math;
	}

	public static void main(String[] args) {
		new Ex02_2(); 

	}

}
