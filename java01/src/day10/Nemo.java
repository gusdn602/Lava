package day10;
/**
 * �� Ŭ������ �簢���� ���ο� ���� �׸��� ���̸� ����� Ŭ����
 * @author 	������
 * @since 	2020.03.20
 * @version	v,1,0
 * @see
 */
public class Nemo {
	//�� Ŭ������ ���ο� ���γ��̸� ����ϰ� �־�� �Ǵ� Ŭ�����̴�.
	//���� �����͸� ����� ������ ����� �ش�.
	
	//���� 
	int width;
	int hight; //����
	int area; // ����
	
	//�׷��� ���ο� ���θ� �Է��ϸ�
	// �� ������ �����͸� ����Ű�� ���̵� ����ؼ� �������ִ� ����� �ʿ��Ѵ�.
	// ���� �� ����� ����� �Լ��� ����� �д�.
	
	public void setVal(int garo, int sero) {
		//���� ���ο� ���θ� ����Ű��.
		width = garo;
		hight = sero;
		
		//���̴� �Ի��ؼ� �츮�� �Ӹ��� �����ϱ� �ٷ� ����Ű��
		area = garo * sero;
	}
	//��� �Լ� ����
	public void toPrint() {
		System.out.printf("���� : %3d,\n���� : %3d, \n���� :", width, hight, area);
	}
}

