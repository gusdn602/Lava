package day17;

import java.util.*;
public class Sagggk implements Comparator{  //�ش� Ŭ������ implement�� ��Ų��. ���� �غ�

	public int compare(Object o1, Object o2) {	//Comparator�� compare�� 1+1�̴�. compare�� ������ objectŸ���̴�.
		Saggak s1 = (Saggak) o1;			//SaggakŸ���� s1�� ����� ������Ʈ�� ���Ե��ִ� o1�� SaggakŸ������ �ٲ��༭ s1�� �־��ش�.
		Saggak s2 = (Saggak) o2;			//SaggakŸ���� s2�� �����  ������Ʈ�� ���Ե��ִ� o2��  SaggakŸ������ �ٲ��༭ s2�� �־��ش�.
		
		int re = (int)(s1.getArea() - s2.getArea()); //����Ÿ���� re�� �����ϰ�  s1�� Area(SaggakŬ������ wi*he�� ��) - s2�� Area�� �� ���� re�� �־��ش�. 
													
		return re; 				//re�� ���Ͻ�Ų��.
	}

}
