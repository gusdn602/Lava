package day17;
import java.util.*;
public class Sagak_pre {
	
	private int wi,he;				//���� �����ڸ� private�� ���� �� ���� Ÿ������ wi�� he�� ���� �����Ѵ�.
	private double area;			//���� ������ private�� �Ǽ�Ÿ������ area������ ���� �Ѵ�.
	
	public Sagak_pre() {		//������ �Լ��� ���� �Լ� ����
		
	}
	
	public Sagak_pre(int wi, int he) {		//���� Ÿ������ wi�� he�� Sagak_pre�Լ��� �Ű����� ����Ʈ�� �����Ѵ�.
		this.wi = wi;						//�������� wi�� Sagak_pre�Լ��� �Ű����� ����Ʈ�� ���� �ִ´�. 
		this.he = he;						//�������� he�� Sagak_pre�Լ��� �Ű����� ����Ʈ�� ���� �ִ´�.
	}
	
	@Override
	public int compareTo

	public int getWi() {				//getter & setter�Լ��� private�� �����Ǿ� �ִ� Ŭ������ �ٸ� Ŭ�������� ����� �� �ְ� �����.
		return wi;
	}

	public void setWi(int wi) {
		this.wi = wi;
	}

	public int getHe() {
		return he;
	}

	public void setHe(int he) {
		this.he = he;
	}

	public double getArea() {
		return area;
	}

	public void setArea(double area) {
		this.area = area;
	}

	

}
