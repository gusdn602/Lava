package day19;

/*
 	���� 6 ]
 		doc ������ ������ ����� �˾Ƴ���.
 */
import java.util.*;
import java.io.*;
import javax.swing.*;
public class Test06 {

	public Test06() {
		// 1. ����� �˾Ƴ��� ���� ������ ���Ϸ� �����.
		File dir = new File("doc");
		/*
		String[] list = dir.list();
		for(int i = 0; i<list.length; i++) {
			String fname = list[i];
			System.out.println(fname);
		}
		*/
		/*
		File[] flist = dir.listFiles();
		for(int i= 0; i<flist.length; i++) {
			File fileinfo = flist[i];
			String filename = fileinfo.getName();	//���� �̸� ������
			long len = fileinfo.length(); //���� ũ�� ������
			String folder = fileinfo.getParent(); //���� ������
			
			//����ϱ�
			System.out.print("�����̸� : " + filename + " | ���� :" + folder + " | ������ : " + len + "\n");;
		}
		*/
		
		/*
		 	Ư�� ������ �ִ� ���� �߿��� Ȯ���ڰ� txt�� ���ϸ� ��� ����غ���.
		 	
		 	�̷� ��� ���͸� ���ϸ�� ������ �� �Է������ �ϴµ�...
		 	�� ���ʹ� ������� ������ ���� ���ݾ� �޶��� ���̴�.
		 	
		 	���� ���ʹ� �������̽��� ������ ���ְ� �ִ�.
		 	
		 	�츮�� �� �������̽��� �����ؼ� �ʿ��� ����� ����� �ȴ�.
		 	
		 */
		String[] filelist = dir.list(new FilenameFilter() {
			
			public boolean accept(File dir, String name) {
				boolean bool = false;
				/*
				 	�Ű� ������ ��Ȱ
				 		File 	dir : ���� ������ ������ �˷��ش�.
				 		String name : ���� ������ �̸��� �˷��ش�.
				 		
				 	�� �Լ��� �ڵ� ȣ��Ǵ� �Լ��̴�.
				 	�����  ���ϴ� ������ �ϳ��� �߰��� ������ �� �Լ��� ȣ��ȴ�.
				 	
				 	���� 
				 	�� �Լ��� ��ȯ���� true �̸� ��Ͽ� ���Խ�Ű��
				 	��ȯ����  false�̸� ��Ͽ��� ���ܸ� ��Ų��.
				 
				 */
				/*
				if(name.endWith("txt")) {
					
				} else {
					bool = false;
				}
				*/
				return name.endsWith("txt");
			}
		});
		//fileList�� ����Ѵ�.
		int cnt = 0;
		for(String fName : filelist) {
			cnt++;
			System.out.println(fName);
		}
		JOptionPane.showMessageDialog(null, "txt ����  �˻� ��� : " +  cnt);
		
	}

	public static void main(String[] args) {
		new Test06();

	}

}
