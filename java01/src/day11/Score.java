package day11;
/*
 	���� 2]
 		�� Ŭ������ �л� �Ѹ���
 		�̸�, java, oralce, html, javascript, jsp, spring�� ������ �����  Ŭ���� �̴�.
 		�� Ŭ������ ��ü�� �ɶ� �����͸� �Է� �޾Ƽ� �� ������ ����� �ǰ� Ŭ������ ���� �ϼ���.
 		
 		��, �����Ͱ� �Է��� �ȵ� ���
 			�̸��� "�ڱ�ȣ" �� �ϰ�
 			������ �����ϰ� ���ǰ� �ϼ���. 
 */
public class Score {
	String name;
	int java, oracle, javascript, jsp, spring, html;
	public Score() {
		this("�ڱ�ȣ");
	}
	
	
	public Score(String name) {
		this.name = name;
		
	}
	public Score(String name, int java, int orcale, int html, int javascript, int jsp, int spring) {
		this.name = name;
		this.jumsu(name);
	}
	public void jumsu(String name) {
		 java = (int)(Math.random() * 100 - 1 +1)+1;
		 oracle = (int)(Math.random() * 100 - 1 +1)+1;
		 html = (int)(Math.random() * 100 - 1 +1)+1;
		 javascript = (int)(Math.random() * 100 - 1 +1)+1;
		 jsp = (int)(Math.random() * 100 - 1 +1)+1;
		 spring = (int)(Math.random() * 100 - 1 +1)+1;
	}
	public void toPrint() {
		System.out.printf("");
	}
	
	
}
