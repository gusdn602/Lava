package day17;

public class Samgak {
	private int wi,he;
	private double area;
	//기본 생성자 함수
	public Samgak() {}
	
	//생성자 함수 오버로딩
	public Samgak(int wi, int he) {
		this.wi = wi;		//private의 wi를 Samgak함수 안의 wi로 정의
		this.he = he;		//private의 he를 Samgak함수 안의 he로 정의
		setArea();			//setArea()를 호출
	}
	
	public int getWi() {
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
	public void setArea() {		//setArea의 함수안에 wi * he를  전역변수로 선언한  double타입의 area에 결과값을 넣음
		this.area = wi * he;
	}
}
