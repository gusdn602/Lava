package day17;

import java.util.*;
public class Nemotest {

	public Nemotest() {
		TreeSet<Nemo> set = new TreeSet(new Nemo_Comp());
		Random rnd = new Random();
		
		for(;;) {
			int wi = rnd.nextInt(16)+1;
			int he = rnd.nextInt(16)+1;
			
			set.add(new Nemo(wi,he));
			
			if(set.size() == 10) break;
		}
		
		//꺼내서 출력하자.
		Iterator<Nemo> itor = set.iterator();
		while(itor.hasNext()) {
			System.out.print(itor.next().getArea() + " | ");
		}
		System.out.println();
		
		/*
		TreeSet set1 = new TreeSet();
		Random rnd = new Random();
		
		for(int i= 0; i<5; i++) {
		int wi = rnd.nextInt(16)+5;
		int he = rnd.nextInt(16)+5;
		
		set1.add(new Nemo(wi,he));
		
	}
		// Set to ArrayList
		ArrayList list = new ArrayList();
		for(int i = 0; i<list.size(); i++) {
			System.out.print(((Nemo)list.get(i)).getArea() + "|");
		}
		System.out.println();
		*/
		// 이 경우 TreeSet은 정렬할 수 있는 데이터를 입력해야 저장이 되는데
		//Nemo클래스는 정렬할 수 없는  상태이므로 입력을 하면 에러가 난다.
		
		
}

	public static void main(String[] args) {
		new Nemotest();

	}

}
