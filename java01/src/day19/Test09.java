package day19;

/*
 	��ҿ��� ���޷� ���� �����غ���.
 */
import java.io.*;
import javax.swing.*;
public class Test09 {

	public Test09() {
		//��Ʈ���� �غ��Ѵ�.
		PrintStream ps = null;
		try {
			//��Ʈ�� �ʱ�ȭ �ϰ�
			ps = new PrintStream("src/day19/etc/poem.txt");
			//����  ] �� ��Ʈ���� ������Ʈ���̴�. ������ ���� ��ġ�� ������ �ȴ�.
			//		��ġ �⺻��Ʈ�� ���� �۵��ϴ� ��ó�� �������� ���������� Ÿ�ٽ�Ʈ���� ����
			//		�� Ÿ�ٽ�Ʈ���� �����ؼ� ����ϴ� ���� ��Ʈ���̴�.
			
			//�ø� �Ẹ��.
			ps.println("*** ���޷� ��***");
			ps.println("                �� 	��	�� ");
			ps.println("�����Ⱑ ���ܿ� ���Ƕ����� ");
			ps.println("������ ���� ���� �帮������.");
			ps.println();
			ps.println("������ ��� ���޷� ��");
			ps.println("�Ƹ����� ���Ǳ濡 �Ѹ�������.");
			ps.println("���ô� ���� ���� �� ���� ");
			ps.println("����� ������ ���ÿɼ�");
			ps.println();
			ps.println("�����Ⱑ ���ܿ� ���Ƕ�����");
			ps.println("�׾ �ƴϴ��� �긮������.");
			
			ps.flush();
				//���������� Buffer�� ����� ������ �����Ƿ�
				// �ݵ�� ������ ������ �ݵ�� ���۸� ����� �Ѵ�.
			JOptionPane.showMessageDialog(null, "###���� �Ϸ�###");
		}catch(Exception e) {
			JOptionPane.showMessageDialog(null, e.toString());
		}finally {
			try {
				ps.close();
				//close()�Լ��� ���������� flush()����� �����ϰ� �ִ�.
				//���� close() ȣ��Ǹ� �ڵ������� flush()�� ȣ���� �ȴ�.
				
			} catch(Exception e) {}
		}
	}

	public static void main(String[] args) {
		new Test09();

	}

}