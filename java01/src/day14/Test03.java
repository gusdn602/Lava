package day14;

import javax.swing.*;
public class Test03 {
	public Test03() {
		//getNum()는 예외를 전이하는 함수이므로
		//이런 예외전이 함수는 반드시 예외처리를 해줘야 한다.
		int num = 0;
		
		try {
			num = getNum();
		} catch(NumberFormatException e) {
			e.printStackTrace();
			//예외 클래스를 기술 할 때는 최 하위부터 기술하는 것이 원칙이다.
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	// 숫자를 입력 받아서 정수로 반환해주는  getnum() 함수
	public int getNum() throws NumberFormatException {
		//반환값 담을 변수 선언 및 초기화
		int num = 0;
		
		//숫자를 입력받아서 문자열로 담고
		String no = JOptionPane.showInputDialog("숫자를 입력하세요!!");
		
		//문자열을 정수로 변환하고
		num = Integer.parseInt(no);
		if(num <0) {
			//강제 예외  방생시키기
			//형식 ] 
			//		throwsnew 예외클래스 생성자();
			throw new NumberFormatException();
		}
		/*
		 num변수에 데이터를 담을 경우 예외가 발생할 수 있다.
		 따라서 원칙은 윗 부분을 예외처리를 해야 하지만
		 이번에는 이 함수를 호출한 곳으로 예외처리를 떠넘긴다.
		 */
		return num;
		
	}
	public static void main(String[] args) {
		new Test03();

	}

}

