package day19;

/*
 	Test11.java 파일을 읽어보자.
 */
import java.io.*;
import javax.swing.*;
public class Test12 {

	public Test12() {
		//타겟 스트림준비하고
		FileReader fr = null;
		//필터 스트림 준비하고
		BufferedReader br = null;
		
		try {
			//스트림 초기화 하고
			fr = new FileReader("src/day19/Test11.java");
			br = new BufferedReader(fr);
			//몇번을 읽어야 할지 모르므로 반복처리
			String msg = "";
			while(true ) {
			String str = br.readLine();
			if(str == null) {
				break;
			}
			
			msg += str + "\n";
		}
			//읽은 내용 출력하고...
			JOptionPane.showMessageDialog(null, msg);
		}catch(Exception e) {
			JOptionPane.showMessageDialog(null, e);
		}finally {
			try {
				br.close();
				fr.close();
			}catch(Exception e) {}
		}
	}
	

	public static void main(String[] args) {
		new Test12();

	}

}
