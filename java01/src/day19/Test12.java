package day19;

/*
 	Test11.java ������ �о��.
 */
import java.io.*;
import javax.swing.*;
public class Test12 {

	public Test12() {
		//Ÿ�� ��Ʈ���غ��ϰ�
		FileReader fr = null;
		//���� ��Ʈ�� �غ��ϰ�
		BufferedReader br = null;
		
		try {
			//��Ʈ�� �ʱ�ȭ �ϰ�
			fr = new FileReader("src/day19/Test11.java");
			br = new BufferedReader(fr);
			//����� �о�� ���� �𸣹Ƿ� �ݺ�ó��
			String msg = "";
			while(true ) {
			String str = br.readLine();
			if(str == null) {
				break;
			}
			
			msg += str + "\n";
		}
			//���� ���� ����ϰ�...
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
