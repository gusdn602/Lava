package day14;
/*
 if - else if ������ �̿��ؼ� 
	
	���̸� �Է��ϸ� �ʴ�, �̽ʴ�, ...
	�Ǻ����ִ� ���α׷��� �ۼ��ϼ���.
 */
import javax.swing.*;
import java.util.*;
public class Ex02 {

	public Ex02() {
		
	}
	

	public static void main(String[] args) {
		  String tmp = JOptionPane.showInputDialog("���̸� �Է��ϼ���");
		  int tmp2 = 0;
		  String msg = "";
		  
		  try {
			  tmp2 = Integer.parseInt(tmp);
		  } catch(Exception e) {
			  msg = "���� ������ �ƴմϴ�";
		  } if(tmp2 <=9) {
			msg = "����Դϴ�.";  
		  }
		  	else if(tmp2>= 10 && tmp2<20) {
			  JOptionPane.showMessageDialog(null, "10���Դϴ�");
		  } else if(tmp2>= 20 && tmp2<30) {
			  JOptionPane.showMessageDialog(null, "20���Դϴ�");
		  } else if(tmp2>= 30 && tmp2<40) {
			  JOptionPane.showMessageDialog(null, "30���Դϴ�");
		  } else if(tmp2>= 40 && tmp2<50) {
			  JOptionPane.showMessageDialog(null, "40���Դϴ�");
		  } else if(tmp2>= 50 && tmp2<60) {
			  JOptionPane.showMessageDialog(null, "50���Դϴ�");
		  } else if(tmp2>= 60 && tmp2<70) {
			  JOptionPane.showMessageDialog(null, "60���Դϴ�");
		  } else if(tmp2>= 70 && tmp2<80) {
			  JOptionPane.showMessageDialog(null, "70���Դϴ�");
		  } else if(tmp2>= 80 && tmp2<90) {
			  JOptionPane.showMessageDialog(null, "90���Դϴ�");
		  } else {
			  JOptionPane.showMessageDialog(null, "���̰� �ʹ� ��ų� �ʹ� �����ϴ�.");
		  }
	} 
}



