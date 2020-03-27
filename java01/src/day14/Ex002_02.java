package day14;



/*
문제 2 ]
삼각형 클래스를 작성하고

삼각형 클래스의 밑변과 높이를 입력해서 객체를 만들도록 작성하고

만약 밑변이 같으면 같은 삼각형이 되도록 
equals 함수, toSting()를 오버라이드하고
테스트 하세요.

입력은 JOtionPane소속의 함수로 처리하고 
출력도 같은 소속의 함수로 처리하세요.
추가로 예외 처리도 해주세요.
*/
import javax.swing.*;
public class Ex002_02 {
	private int nop;
	private int mit;
	
	
	public int setMit() {
		return mit;
	}
	public int setNop() {
		return nop;
	}
}
