package day19;

/*
 	문자 단위로 파일에 데이터를 저장하는 프로그램을 작성해 보자.
 */
import java.io.*;
import javax.swing.*;
public class Test10 {

	public Test10() {
		//스트림 준비하고
		FileWriter fw = null;
		try {
			//스트림 초기화
			fw = new FileWriter("src/day19/etc/FileWriter_test.txt");
			/*
			//1. 한 글자만(2byte) 저장해보자.
			char ch = '한';
			fw.write(ch);
			*/
			/*
			//2. 여러글자 저장
			String str = "저는 항상 잘 됩니다.";
			char[] buff = str.toCharArray();
			fw.write(buff);
			*/
			
			//3. 문자열을 전송해보자.
			String str = "중학생들이 친구 담뱃불로 지지고 폭행\"…청주 경찰 수사";
			fw.write(str);
			/*
			  char단위 스트림은 텍스트 데이터만 처리하도록 되어있기 떄문에
			  기본 함수에 + 문자 처리 기능이 추가되었다.
			 */
			
			JOptionPane.showMessageDialog(null, "###파일 저장 완료###");
		}catch(Exception e) {
			JOptionPane.showMessageDialog(null, e.toString());
		}finally {
			try {
				fw.close();
			} catch(Exception e) {}
		}
	}

	public static void main(String[] args) {
		new Test10();

	}

}
