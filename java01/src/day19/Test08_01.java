package day19;

/*
 	DataOutputStream���� ������ ģ���� ������ �о��.
 */
import java.io.*;
import javax.swing.*;
public class Test08_01 {

	public Test08_01() {
			//Ÿ�� ��Ʈ�� �غ��ϰ�
			FileInputStream fin = null;
			//���� ��Ʈ�� �غ��ϰ�
			DataInputStream bin = null;
			
			try {
				//��Ʈ�� �ʱ�ȭ ���ְ�
				fin = new FileInputStream("src/day19/etc/DataStream_test.txt");
				bin = new DataInputStream(fin);
				// ���� �� ���� ������ ������ �� �̸�, ����, ����, ����, ��ȭ, ������ ������ ������ �߱� ������
				//���� ���� �� ������� �о�� �Ѵ�.
				String name = bin.readUTF();
				int age = bin.readInt();
				float height = bin.readFloat();
				char gen = bin.readChar();
				String tel = bin.readUTF();
				String mail = bin.readUTF();
				
				//����ϰ�
				String msg = "�̸� :" + name + "\n���� : " + age  + "\n���� :" + 
							height + "cm\n���� : " + gen + "\n��ȭ : " + tel + "\n���� : " + mail;
				JOptionPane.showMessageDialog(null, msg);
			}catch(Exception e) {
				JOptionPane.showMessageDialog(null, e.toString());
			}finally {
				try {
					bin.close();
					fin.close();
				} catch(Exception e) {}
			}
	}

	public static void main(String[] args) {
		new Test08_01();

	}

}
