package day17;

import java.util.*;
public class Test05 {
/*
 	랜덤하게 숫자를 10개로 만들어서 컬렉션에 담고 출력하자.단, 중복숫자는 제외
 */
	public Test05() {
		HashSet<Integer> set = new HashSet<Integer>();
		Random rnd = new Random();
		
		while(true) {
			//먼저 숫자를 랜덤하게 만들어 준다.
			int num = rnd.nextInt(45) + 1;
			set.add(num);
			
			//그런데 우리는 숫자 열개만 넣기로 했다.
			//Set은 중복된 데이터를 허락하지 않고
			//따라서 중복된 숫자 입력되면 입력된 크기는 변경이 안될 것이다.
			//set에 입력된 데이터의 수가 10개가 되는 순간 이 반복문은 종료가 되어야 겠다.
			
			if(set.size() == 10) {
				break;
			}
		}
		// set 출력하고 
		
		//1. ArrayList로 반환해서 출력하는 방법
		ArrayList<Integer> list = new ArrayList<Integer>(set);
		Collections.sort(list);
		for(int i= 0; i <list.size(); i++) {
			System.out.print(list.get(i) + "|");
		}
		System.out.println();
		
		//Iterator사용하는 방법
		System.out.println("-----------Iterator----------------");
		Iterator<Integer> itor = set.iterator();
		while(itor.hasNext()) {
			System.out.print(itor.next() + "|");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		new Test05();

	}

}
