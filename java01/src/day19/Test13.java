package day19;
/*
 	day19/etc/poem.txt
 	파일을 읽어보자.
 	
 	inputStream 으로 읽고
 	bufferedReader를 연결하자.
 	
 	이렇게 크기가 다른 스트림을 연결해주는 보조 스트림이 
 	InputStreamReader/OutputstreamWriter
 	가 있다.
 */
import java.io.*;
import javax.swing.*;
public class Test13 {

	public Test13() {
		//타겟스트림준비하고 -1
		FileInputStream fin = null;
		//보조스트림 준비하고 -1
		InputStreamReader ir = null;
		//보조스트림 준비하고 -1
		BufferedReader br = null;
		
		try {
			fin = new FileInputStream("src/day19/etc/poem.txt");
			ir = new InputStreamReader(fin);
			br = new BufferedReader(ir);
			StringBuffer buff = new StringBuffer();
			while(true) {
				String str = br.readLine();
				if(str == null) break;
				buff.append(str + "\n");
			}
			JOptionPane.showMessageDialog(null, buff.toString());
		}catch (Exception e) {
			JOptionPane.showMessageDialog(null, e);
		}finally {
			try {
				br.close();
				ir.close();
				fin.close();
			} catch (Exception e) {}
		}
	}

	public static void main(String[] args) {
		new Test13();

	}

}
