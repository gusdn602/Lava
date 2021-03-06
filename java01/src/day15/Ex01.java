package day15;
/*
	문제 1 ]
		이메일을 입력받아서
		입력받은 문자열이 이메일 형식에 맞는지 아닌지 검사하세요.
		이메일 형식은 
			알파벳 숫자로 8자 이상으로 하고 @ 도메인주소
		로 처리하세요. 
		참고 ] 
			한글 처리 : [가-힣] - 한글은 아이디에 쓰지마세요.
			
 */
import java.util.*;
import javax.swing.*;
import java.util.regex.*;
public class Ex01 {

	public static void main(String[] args) {
		String mail = JOptionPane.showInputDialog("이메일을 입력하세여");
		Pattern p = p.compile(".*[a-zA-z]\d{8}@.*[a-zA-z]{8}.*[a-zA-z]{5}");
		Matcher mat = p.matcher(mail);
		if(mat.matches()) {
			JOptionPane.showMessageDialog(null, "올바른 이메일입니다.");
		} else {
			JOptionPane.showMessageDialog(null, "잘못된 이메일입니다.");
		}
	}

}
