package day07;
/*
	문제 8 ]
	회원의 이름, 전화번호, 이메일을 저장할 배열을 만들고 - 문자열 배열 3개
	데이터를 입력해서
	
	회원의 이름을 입력하면
	회원의 이름과 전화번호, 이메일을 출력하는 프로그램을 작성하시오.
*/
import javax.swing.*;
public class Solv08 {

	public static void main(String args[]) {
		String[] name = {"김소영","최두용","정우승","유태희","김종형","임서진"};
		String[] tel = {"010-1111-1111","010-2222-2222","010-3333-3333",
						"010-5555-5555","010-8888-8888","010-9999-9999"};
		String[] mail = new String[] {"pengsoon@increpas.com","dDragon@increaps.com",
										"victory@increaps.com","nobody@increaps.com",
										"bell@increaps.com","leam@increaps.com"};
		
		// 만약 임서진 이라는 이름을 입력한다면
		// 임서진이 가지는 인덱스를 알아내기 위해
		// name 배열에 각 방에 저장된 데이터를 모두 꺼내서
		// 임서진이라는 문자열과 비교해서
		// 맞는 경우 name의 인덱스를 기억시켜 놓으면 될것이다.
		// 이때 인덱스를 기억할 변수는
		// 반복문의 블럭내부에만들경우 빠져 나가게 되면
		// 사용할 수 없게 되므로 
		// 따라서 엔딕스를 기억할 변수는 반복문의 블럭 밖에다 만들얻ㄴ다.
		
		// 먼저 문자열 입력받고
		String str = JOptionPane.showInputDialog("이름을 입력하세요");
		
		//인덱스 기억할 변수
		int idx = -1;
		
		 for(int i = 0; i<name.length; i++) {
			 //name 배열에서 str과 같은 문자열이 있는지 검사한다.
			 //이때 주의 사항은 문자열의 데이터 비교는 동등비교연산자를 쓰는 것이 아니고
			 //반드시 		문자열1.equals(문자열2) 로 비교를 해야한다.
			 
			 //같은 문자열이면 해당 이름의 인덱스를 기억시켜야 할 것이다.
			 if(name[i].equals(str)) {
				 idx = i;
				 //찾는 사람의 인덱스를 찾았기 때문에 
				 //더이상 인덱스를 검색할 의미가 없기 때문에
				 //이 반복문은 종료하자.
				 break;
			 }
		 }
		 String msg = "없는 팀원입니다.";
		 //이제 인덱스를 알아냈으니 해당 인덱스에 해당하는 정보를 출력해주자.
		
		 
		 //그런데 3팀이 아닌  광호씨가 이름이 입력되는 경우는 해당 인덱스를 찾지 못할 것이고
		 //이때 역시 반복문이 모두 실행이 될 것이다.
		 //이 경우는 idx변수의 값이 교체가 되지 않고 -1로 유지가 될것이기때문에
		 //idx의 값이 -1인 경우는 해당 사람을 찾지 못했다는 의미가 될 것이다.
		 
		 //조건문으로 idx값에 따라서 출력하자
		 if(idx != -1) {
			 //이 경우는 입력한 사람의 인덱스를 찾은 경우
			 msg = "name \t:" + name[idx] + 
					 	"\ntel \t :" + tel[idx] +
					 	"\nmail \t :" + mail[idx]; 
		 } else {
			 //입력한 인덱스를 못찾인 경우
			 //==> 없는 팀원의 경우
			 // 따로 처리해줘야 할 작업이 없다.
		 }
		 JOptionPane.showMessageDialog(null, msg);
	}
	
}
