package day03;
/*
 	문제 1]
 		게시판에 글을 한페이지에 15개 글을 표시할 수 있다.
 		게시물의 갯수를 랜덤하게 (0~100) 발생한 후
 		필요한 페이지 수르 계산해서 출력해 주는 프로그램을 작성하세요
 		단 게시물 수가 0인 경우는 1페이지가 필요로 한것으로 한다.
 */
public class Ex02 {

	public Ex02() {
		page();
	}
public void page() {
	 int num = (int)(Math.random()* (100 -1 + 1)) +0;
	 int page = 1;
	 
	 /*
	 	 15개 - 1페이지
	 	 16개 - 2페이지
	 	 
	  */
	  
	 if(num % 15 == 0) {
		 if(num == 0) {
			 System.out.println("필요한 페이지수 :" + num % 15);

		 } else {
			 System.out.println("필요한 페이지수 :" + num % 15);
			 
				 
		 }
	 } else {
		 if(num % 15 !=0) {
			 System.out.println("필요한 페이지수 :" + num % 15);
		 }
	 }
}
	public static void main(String[] args) {
		new Ex02();

	}

}
