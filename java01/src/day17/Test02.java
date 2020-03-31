package day17;

import java.util.*;
public class Test02 {

	public Test02() {
		/*
		Samgak sam = new Samgak();
		*/
		
		ArrayList<Samgak> list = new ArrayList<Samgak>();
		for(int i =0; i<10; i++) {
			int no1 = (int)(Math.random() * 16 +5); // 20 - 5 + 1 ==> 16 + 5
			int no2 = (int)(Math.random() * 16 +5);
			list.add(new Samgak(no1, no2));
		}
		//리스트의 내용 중 면적을 한개씩 꺼내서 보고
		for(int i = 0; i<list.size(); i++) {
			System.out.print(list.get(i).getArea() + "|");
		}
		System.out.println();
		//정렬을 해보자.
		//지금 리스트에 입력되어있는 객체는
		//서로 크기를 비교할 수없는 상태이므로
		//비교자를 만들어서 입력해주고 비교해보자.
		Collections.sort(list, new Hwsort01());
		for(int i = 0; i<list.size(); i++) {
			System.out.print(list.get(i).getArea() + "|");
		}
		System.out.println();
		//이번에는 높이를 기준으로 내림차순 정렬
		Collections.sort(list, new Comparator() {
		public int compare(Object o1, Object o2) {
			return((Samgak) o2).getHe() - ((Samgak)o1).getHe();
		}
		});
		for(int i = 0; i<list.size(); i++) {
			System.out.print(list.get(i).getArea() + "|");
		}
	}

	public static void main(String[] args) {
		new Test02();
	}

}
