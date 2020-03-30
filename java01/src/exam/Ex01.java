package exam;

import javax.swing.*;

/*
 	JOptionPane으로 숫자를 입력받아서 
 	배열을 만들고 
 	배열이 기억할 수 있는 갯수만큼 숫자를 입력받아서 
 	그 숫자들의 합을 구해주는 프로그램을 작성하세요.
 	단, 합을 구하는 기능은 함수를 만들어서 처리하세요
 */
import java.util.*;
public class Ex01 {
	String input = JOptionPane.showInputDialog("숫자를 입력하세요");
	int tmp = 0;
	int cnt = 0;
	String[] bee1 = new String[in()];
	
	public Ex01() {
		in();
	}
	
	public int in() {
		tmp = Integer.parseInt(input);
		return tmp;
	}
	
	
	

	public static void main(String[] args) {
		new Ex01();
	}

}
