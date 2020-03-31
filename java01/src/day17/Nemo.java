package day17;

public class Nemo {
	private int wi, he, area;
	public Nemo() {}
	public Nemo(int wi, int he) {
		this.wi = wi;
		this.he = he;
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
	public int getArea() {
		return area;
	}
	public void setArea(int area) {
		this.area = area;
	}
	//면적 계산해 주는 함수
	public void setArea() {
		this.area = wi * he;
	}

}
