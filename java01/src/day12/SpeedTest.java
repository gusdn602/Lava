package day12;

public class SpeedTest {
	
	public SpeedTest() {
		Car car = new Car();
		car.speedUp();
		System.out.println("Car speed : " + car.speed);
		
		Mini mini = new Mini();
		mini.speedUp();
		System.out.println("Car speed : " + mini.speed + "m/h");
		
		Lotze euns = new Lotze();
		euns.speedUp();
		euns.speedUp(20);
		System.out.println("euns speed :" + euns.speed);
		
		Car lotze = new Lotze();
		//System.out.println("lotze color :" + lotze.color);
		//System.out.println("lotze color :" + lotze.used);
		System.out.println("lotze speed :" + lotze.speed);
		
		//Mini ml = (Mini) lotze; //�Ǳ� ������ �̷��� ������� �ʴ� �������� �ڵ��ؾ� �Ѵ�.
		
		Lotze car2 = (Lotze) new Car();
		
		
		car2.speedUp();
		System.out.println(car2.speed);
	}
	public static void main(String[] args) {
		new SpeedTest();

	}

}