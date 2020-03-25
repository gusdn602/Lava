package day11;
/*
 	문제 2]
 		이 클래스는 학생 한명의
 		이름, java, oralce, html, javascript, jsp, spring의 점수를 기억할  클래스 이다.
 		이 클래스가 객체가 될때 데이터를 입력 받아서 각 변수에 기억이 되게 클래스를 정의 하세요.
 		
 		단, 데이터가 입력이 안될 경우
 			이름은 "박광호" 로 하고
 			성적은 랜덤하게 기억되게 하세요. 
 */
public class Score {
	String name;
	int java, oracle, javascript, jsp, spring, html;
	public Score() {
		this("박광호");
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
