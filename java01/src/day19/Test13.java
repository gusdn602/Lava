package day19;
/*
 	day19/etc/poem.txt
 	������ �о��.
 	
 	inputStream ���� �а�
 	bufferedReader�� ��������.
 	
 	�̷��� ũ�Ⱑ �ٸ� ��Ʈ���� �������ִ� ���� ��Ʈ���� 
 	InputStreamReader/OutputstreamWriter
 	�� �ִ�.
 */
import java.io.*;
import javax.swing.*;
public class Test13 {

	public Test13() {
		//Ÿ�ٽ�Ʈ���غ��ϰ� -1
		FileInputStream fin = null;
		//������Ʈ�� �غ��ϰ� -1
		InputStreamReader ir = null;
		//������Ʈ�� �غ��ϰ� -1
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
