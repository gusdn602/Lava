package day17;

import java.util.*;
public class Hwsorce implements Comparator{
	//�̹� ���ı����� �ִ� Ŭ������ ������ ���ı������� ������ �ϰ��� �� ��
	//Comparator �������̽��� �����ؼ� ���ı������� ����� Ŭ������ ������ָ� �ȴ�.
	//Comparator�� compare()��  �߻��Լ��� �������ְ�
	//������ �ϰ� �Ǹ� �� �Լ��� �ݵ�� �������̵� �ؾ� �Ѵ�.
	//������ �� sort()�� ȣ���� �Ǹ� �� �Լ��� ���ı������� ����� Ŭ������ compare()�� 
	//�ڵ� ȣ���ؼ� ������ �ϰ� �ȴ�.
	@Override
	public int compare(Object o1, Object o2) {
		//�츮�� Sagak Ŭ������ width�� �������� �ٽ� �����ϰ��� �Ѵ�.
		//���� �Ű������� �Էµ� ObjectŸ���� �����͸� Sagak Ŭ������ ���� ����ȯ ����߰ڴ�.
		Sagak s1 = (Sagak) o1;
		Sagak s2 = (Sagak) o2;
		int result = (int)s1.getWidth()- s2.getWidth();
		//�̶� ����� ����̸� �ڸ��� �ٲٰ�
		// 0 �̸� �ٲ��� �ʰ�
		//�����̸� �ڸ��� �ٲٰ�
			return 0;
	}
}
	