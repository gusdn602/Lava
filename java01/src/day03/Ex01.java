package day03;

public class Ex01 {
/*
 	1 ~ 100������ ���� ������ �����ϰ� ���� 
 	�� ���� ū ������ ���ʷ� ��µǰ� �ϼ���.
 	��, ������ 4���� �ѱ��� ������. 
 */
	public Ex01() {
		ex01();
	}
	public void ex01() {
		//�� ���� �����ϰ� ����
		int max = (int)(Math.random()* (100 -1 + 1)) +10;
		int mid = (int)(Math.random()* (100 -1 + 1)) +10;
		int min = (int)(Math.random()* (100 -1 + 1)) +10;
		//�ӽ� ������ �����.
		int tmp = 0;
		
		//���ؼ� ó���Ѵ�.
		if(max >= mid) {
			// max > mid
			if(mid >= min) {
				//���Ͼ���
			} else {
				if(max >= min) { //max > min > mid
					tmp = mid;
					mid = min;
					min = tmp;
				} else { //min > max > mid
					//���� ū�� ����			
					tmp = max;
					max = min;
					min = tmp;
															
					//�߰��� ����
					tmp = min;
					mid = min;
					min = tmp;
				}
			}
	}	else {
		tmp = max;
		max = mid;
		mid = tmp;
		
		if(mid >= min) {
			// ���Ͼ���
		} else {
			tmp = mid;
			mid = min;
			min = tmp;
		}
	}
	//����Ѵ�.
		System.out.println("max :" + max);
		System.out.println("mid :" + mid);
		System.out.println("min :" + min);
	}
	public static void main(String[] args) {
		new Ex01();

	}

}
