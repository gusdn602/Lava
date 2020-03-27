package day07;
import java.util.Arrays;

import javax.swing.*;
public class Solv01 {

	public static void main(String[] args) {
		String str = JOptionPane.showInputDialog("문자열 아무거나 넣어주세요");
		char[] ch = new char[str.length()]; //문자열의 길이만큼 문자배열을 만들어 준다.
		// 문자열 뒤집는 문자배열
		char[] ch1 = new char[str.length()];
		
		//문자열의 길이만큼 반복해서 
		//문자를 꺼내고
		//꺼낸 문자를 위의 문자배열에 차곡차곡 넣어둔다.
		for(int i = 0; i< str.length(); i++) {
			ch[i] = str.charAt(i);
			ch[i] = str.charAt(str.length() - 1 -i);
		}
		System.out.println("문자열 :" + str);
		System.out.println("ch :" + Arrays.toString(ch));
		System.out.println("ch1 :" + Arrays.toString(ch1));
		System.out.println("문자열 :" + str + "\nch :" + 
		Arrays.toString(ch)+ "/nch1" + Arrays.toString(ch1));
		
		JOptionPane.showMessageDialog(null, "현우씨 쵝오!!!");
	}

}
