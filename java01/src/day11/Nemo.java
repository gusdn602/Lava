package day11;

public class Nemo extends Dohyung{
	int width, height, area1;
	public Nemo() {
		
	}
	
	public Nemo(int width, int height) {
		this.width = width;
		this.height = height;
	}
	
	//���� �����ִ� �Լ�
	public void setArea() {
		area1 = width * height;
	}
}
