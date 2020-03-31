package day16;

import java.util.*;

import javax.swing.JOptionPane;

import java.text.*;
public class Test02 {

	public Test02() {
		//Calendar 클래스로 현재 시간을 기억한 변수를 반들어보자
		Calendar cal = Calendar.getInstance();
		//Calender 데이터는 Date 타입으로 변환 시킬때 getTime()을 사용해서 변환시킨다.
				Date date = cal.getTime();
		//출력문자열 반환 받고
		String sTimme = getStr(date);
		
		//JOptionPane으로 출력하고
		JOptionPane.showMessageDialog(null, sTimme);
	}

	public static void main(String[] args) {
		new Test02();

	}
	
	//Date 타입의 데이터를 입력하면 형식에 맞도록 문자열로 만들어서 반환해주는 함수
	public String getStr(Date date) {
		SimpleDateFormat from = new SimpleDateFormat("yyyy년 MM월 dd일 E요일 HH시 mm분 ss초");
		String result = from.format(date); 
		return result;
	}

}
