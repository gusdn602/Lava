package day12;
/*
 	문제 1 ]
 		학생의 java, db, html, javascript, spring, sum, avg
 		점수를 관리할 배열을 만들고 
 		총점과 평균을 구해서 출력하세요.
 		
 		단, 과목별 총점과 평균도 같이 배열에서 관리하세요.
 		
 		java, db, html, javascript, spring, sum, avg
 		----------------------------------------------
 		100   95  100 		100 	  90 	xxx	xxx.xx
 		......
 		
 과목 총점	450	  480  
 과목 평균	90.00	96.00	xx.xx
 
 	의 형태로 만들어서 배열에 데이터를 채우고 출력하세요.
 	
 	배열은 
 		double[][] score = new double[7][7];
 		
 */
public class Ex01 {

	public static void main(String[] args) {
		double[][] score = new double[7][7];
		
		for(int i = 0; i<score.length; i++) {
			for(int j = 0; j<score.length; j++) {
				score[i][j] = (int)(Math.random()*(100-1+1)+1);
			}
		}

	}

}
