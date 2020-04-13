package hw_package.day02;

import javax.swing.*;
import java.util.*;

/*
	랜덤하게 숫자 다섯개를 발생시켜서 
	ArrayList 에 담고
	그 ArrayList 를 반환해주는 함수를 작성하고
	실행해보세요.
	함수 이름은 getList 로 작성하세요.
 */
	/*
	 	함수 작성 형식
	 	접근지정자  [속성] 반환값타입 함수명(매개변수리스트) {
	 		구문...
	 		return [데이터..]; <-- 반환값 없는경우 생략 가능
	 	}
	 */
public class Ex01 {
	private int num = (int)(Math.random() * (100 - 1 +1)+1);
	
	
	public Ex01() {
		ArrayList<Integer> list1 = getList();
		System.out.println(((ArrayList)getList()).get(num));
		for(int no : list1) {
			System.out.print(no + " | ");
		}
	}
	
	public ArrayList getList() {
		ArrayList list = new ArrayList();
		for(int i= 0; i<100; i++) {
			list.add(i);
		}
		return list;
	}
	
	public static void main(String[] args) {
		new Ex01();
	}

}
