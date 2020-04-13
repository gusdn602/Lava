package day19;

/*
 	���� 4 ]
 		������ �����غ���
 */
import java.io.*;
import java.util.Arrays;

import javax.swing.*;
public class Test04 {

	public Test04() {
		//���� 
		//���� ����� ������ ������ ���� �� 
		//���� ������ �ٸ� ���Ͽ� �������� �۾��̴�.
		//���� ���������� ���� Ÿ�ٽ�Ʈ���� �غ��ϰ�
		//���� �� ���� ������ ���ڿ��� �����صΰ� byte[]�� ����� ���Ͽ� ���� �� ���̴�.
		//���� �� ������ Ÿ�ٽ�Ʈ���� ���� �� ���̴�.
		
		//�⺻��Ʈ�� �ΰ��� �غ��Ѵ�.
		FileInputStream fin = null; //����
		FileOutputStream fout = null; //���纻
		
		try {
			/*
			//2. �⺻ ��Ʈ�� �ΰ��� ����
			//�� ������ �о �״�� �ٸ� ���� ���� �ȴ�.
			// �� �� �о�� ���� �𸣹Ƿ�
			*/
			
			fin = new FileInputStream("src/day19/etc/Ssmple.txt");
			fout = new FileOutputStream("src/day19/etc/inrepas.whw");
			byte[] buff = new byte[1024];
			while(true) {
				Arrays.fill(buff, (byte)0);
				int len = fin.read(buff);
				if(len == -1) {
					break;
				}
				fout.write(buff, 0 , len);
			}
			
			JOptionPane.showMessageDialog(null, "***���� ���� �Ϸ�***");
		}catch(Exception e) {
			JOptionPane.showMessageDialog(null, e.toString());
		} finally {
			try {
				fout.close();
				fin.close();
			} catch(Exception e) {}
		}
	}

	public static void main(String[] args) {
		new Test04();

	}

}
