package day17;

import java.util.*;
public class Sagggk implements Comparator{  //해당 클래스를 implement를 시킨다. 설계 준비

	public int compare(Object o1, Object o2) {	//Comparator는 compare과 1+1이다. compare는 무조껀 object타입이다.
		Saggak s1 = (Saggak) o1;			//Saggak타입의 s1을 만들고 오브젝트에 대입되있는 o1을 Saggak타입으로 바꿔줘서 s1에 넣어준다.
		Saggak s2 = (Saggak) o2;			//Saggak타입의 s2를 만들고  오브젝트에 대입되있는 o2를  Saggak타입으로 바꿔줘서 s2에 넣어준다.
		
		int re = (int)(s1.getArea() - s2.getArea()); //정수타입의 re를 선언하고  s1의 Area(Saggak클래스의 wi*he의 값) - s2의 Area를 뺀 값을 re에 넣어준다. 
													
		return re; 				//re에 리턴시킨다.
	}

}
