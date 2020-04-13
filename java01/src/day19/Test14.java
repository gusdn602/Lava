package day19;

import java.io.*;
import javax.swing.*;
public class Test14 {

	public Test14() {
		//타겟스트림 준비하고 
		FileOutputStream fout = null;
		ObjectOutputStream oout = null;
		
		try {
			fout = new FileOutputStream("src/day19/etc/fr01.txt");
			oout = new ObjectOutputStream(fout);
			
			// Friend를 만들고 데이터를 채워준다.
			Friends f1 = new Friends("카이도", "010-1111-1111" , "coppa@increpas.com" , 25, 600.0f,'m');
			
			//데이터 넘기고
			oout.writeObject(f1);
			JOptionPane.showMessageDialog(null, "Misson Complete");
		}catch(Exception e) {
			JOptionPane.showMessageDialog(null, e);
		}finally {
			try {
				oout.close();
				fout.close();
			} catch(Exception e) {} 
		 
		}
	}

	public static void main(String[] args) {
		new Test14();

	}

}
