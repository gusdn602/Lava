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
		
		//������ �������.
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
		// �� ��� TreeSet�� ������ �� �ִ� �����͸� �Է��ؾ� ������ �Ǵµ�
		//NemoŬ������ ������ �� ����  �����̹Ƿ� �Է��� �ϸ� ������ ����.
		
		
}

	public static void main(String[] args) {
		new Nemotest();

	}

}
