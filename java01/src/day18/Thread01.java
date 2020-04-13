package day18;

public class Thread01 extends Thread_Test {

	public Thread01() {
		Thread01 t1 = new Thread01();
		Thread01 t2 = new Thread01();
		Thread01 t3 = new Thread01();
		Thread01 t4 = new Thread01();
		
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		
		
	}
	public static void main(String[]) args){
		new Thread_Test();
	}

}
