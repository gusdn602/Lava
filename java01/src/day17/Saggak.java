package day17;

public class Saggak {
	private int wi, he; //wi, he를 정수형으로 생성
	private double area; //area를 실수타입으로 생성
	
	public Saggak() { //생성자 함수 생성 없으면 상속받는 다른 class에서 생성자 함수 사용 불가
		
	}
	public Saggak(int wi, int he) {
		this.wi = wi;	//전역변수의 wi를 Saggak함수의 wi에 대입 
		this.he = he;	//전역변수의 he를 Saggak함수의 he에 대입
		setArea();
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
	public void setArea() { // area를 오버로딩함,  wi와 he를 곱한 값을 전역변수의 area에 담는다
		this.area = wi * he;
	}
	
	

}
