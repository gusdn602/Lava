package day17;

import java.util.*;
public class Saggak02 {
	
	public Saggak02() {
		ArrayList<Saggak> list = new ArrayList<Saggak>(); //ArrayList를  list에 Saggak타입으로 생성
		for(int i = 0; i<10; i++) {							//<Saggak>쓰는 이유 : 안쓰면 무슨타입이든 Object로 반환하기떄문에 사용하려면 일일이 강제 형변환 해야댐
															//그래서 이걸 방지하기위해 Saggak타입으로 변경함
			int no1 = (int)(Math.random() * 20 - 1 + 1); //no1과 no2를 1 ~ 20까지 랜덤하게 숫자 생성 
			int no2 = (int)(Math.random() * 20-1+1);
			list.add(new Saggak(no1,no2));				//Saggak리스트에 no1과 no2를 추가한다.
			
		}
		for(int i = 0; i<list.size(); i++) {		//i를 0부터 list의 크기만큼(vo클래스만큼) 증가한다.
			System.out.print(list.get(i).getArea() + " | ");	//list에서 i번째만큼 getArea(wi * he가 계산된 값)을 출력한다.
		}
		System.out.println();
		
		Collections.sort(list,new Sagggk());		//ArrayList가 컬렉션이므로 Collections르 써야한다. 
													//Sagggk클래스의 compare가 sort안에 들어간다.
													//sort는 컬렉션 함수 중 오름차순을 담당하기 때문에 sort를 사용
		for(int i = 0; i<list.size(); i++) {
			System.out.print(list.get(i).getArea() + " | "); //list에서 i번째만큼 getArea(wi * he가 계산된 값)을 출력한다.
		}
	}
	public static void main(String[] args) {
		new Saggak02();

	}

}
