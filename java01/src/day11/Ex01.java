package day11;

public class Ex01 {
/*
 * ���� 3] 
 * 		���� 1, 2 ������ ���� Ŭ������ ��ü�� ����
 * 		�� �������Լ��� �ùٸ��� �۵��ϴ��� �����ϼ���.
 */
	public Ex01() {
		//�� 10���� ���� ��������.
		Circle[] won = new Circle[10];
		for(int i = 0; i <won.length; i++) {
			if(i > 5) {
				won[i] = new Circle((int)(Math.random()*16+5));
			} else {
				won[i] = new Circle(10);
			}
			
		}
		//�� ����ϱ�
		for(int i = 0; i<won.length; i++) {
			won[i].toPrint();
		}
		//���� Ŭ���� �����
		Score[] score = new Score[3];
		score[0] = new Score();
		score[1] = new Score("������");
		score[2] = new Score("�ؼ���", 100, 100 ,100, 100, 95, 80);
		
		//����ϱ�
		for(int i= 0; i<score.length; i++) {
			
		}
	}
	public static void main(String[] args) {
		new Ex01();

	}

}
