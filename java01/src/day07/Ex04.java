package day07;
/*
 문제 3 ]	
		회원의 이름, 전화번호, 이메일을 저장할 배열을 만들고 - 문자열 배열 3개
		데이터를 입력해 놓고
		
		이름을 입력하면
		그 사람의 데이터를 모두 저장할 배열을 만들어서
		데이터를 넣고 출력하세요.
 */
import java.util.*;
import javax.swing.*;
public class Ex04 {

	public static void main(String[] args) {
		String[] name = {"회원1", "회원2", "회원3", "회원4", "회원5"};
		String[] tel = {"010-1111-2222", "010-2222-3333", "010-3333-4444", "010-4444-5555", "010-5555-6666"};
		String[] email = {"hea1@naver.com", "hea2@naver.com", "hea3@naver.com", "hea4@naver.com", "hea5@naver.com"};
		String str = JOptionPane.showInputDialog("이름을 입력하세요");
		
		int idx = -1;
		for(int i = 0; i<name.length; i++) {
			if(name[i].equals(str)) {
				idx = i;
				break;
			}
			
		}
		JOptionPane.showMessageDialog(null, "\n" + name[idx] + "\n" + tel[idx] + "\n" + email[idx]);
		
	}
	

}
