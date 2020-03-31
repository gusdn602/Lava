package day17;
import java.util.*;
public class Sagak_pre {
	
	private int wi,he;				//접근 지정자를 private로 설정 후 정수 타입으로 wi와 he를 변수 선언한다.
	private double area;			//접근 지정자 private로 실수타입으로 area변수를 선언 한다.
	
	public Sagak_pre() {		//생성자 함수를 위한 함수 생성
		
	}
	
	public Sagak_pre(int wi, int he) {		//정수 타입으로 wi와 he를 Sagak_pre함수에 매개변수 리스트를 선언한다.
		this.wi = wi;						//전역변수 wi를 Sagak_pre함수의 매개변수 리스트로 집어 넣는다. 
		this.he = he;						//전연변수 he를 Sagak_pre함수의 매개변수 리스트로 집어 넣는다.
	}
	
	@Override
	public int compareTo

	public int getWi() {				//getter & setter함수로 private로 지정되어 있는 클래스를 다른 클래스에도 사용할 수 있게 만든다.
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
