package day17;

import java.util.*;
public class Saggak02 {
	
	public Saggak02() {
		ArrayList<Saggak> list = new ArrayList<Saggak>(); //ArrayList��  list�� SaggakŸ������ ����
		for(int i = 0; i<10; i++) {							//<Saggak>���� ���� : �Ⱦ��� ����Ÿ���̵� Object�� ��ȯ�ϱ⋚���� ����Ϸ��� ������ ���� ����ȯ �ؾߴ�
															//�׷��� �̰� �����ϱ����� SaggakŸ������ ������
			int no1 = (int)(Math.random() * 20 - 1 + 1); //no1�� no2�� 1 ~ 20���� �����ϰ� ���� ���� 
			int no2 = (int)(Math.random() * 20-1+1);
			list.add(new Saggak(no1,no2));				//Saggak����Ʈ�� no1�� no2�� �߰��Ѵ�.
			
		}
		for(int i = 0; i<list.size(); i++) {		//i�� 0���� list�� ũ�⸸ŭ(voŬ������ŭ) �����Ѵ�.
			System.out.print(list.get(i).getArea() + " | ");	//list���� i��°��ŭ getArea(wi * he�� ���� ��)�� ����Ѵ�.
		}
		System.out.println();
		
		Collections.sort(list,new Sagggk());		//ArrayList�� �÷����̹Ƿ� Collections�� ����Ѵ�. 
													//SagggkŬ������ compare�� sort�ȿ� ����.
													//sort�� �÷��� �Լ� �� ���������� ����ϱ� ������ sort�� ���
		for(int i = 0; i<list.size(); i++) {
			System.out.print(list.get(i).getArea() + " | "); //list���� i��°��ŭ getArea(wi * he�� ���� ��)�� ����Ѵ�.
		}
	}
	public static void main(String[] args) {
		new Saggak02();

	}

}
