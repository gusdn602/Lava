package day14;
/*
 if - else if 구문을 이용해서 
	
	나이를 입력하면 십대, 이십대, ...
	판별해주는 프로그램을 작성하세요.
 */
import javax.swing.*;
import java.util.*;
public class Ex02 {

	public Ex02() {
		
	}
	

	public static void main(String[] args) {
		  String tmp = JOptionPane.showInputDialog("나이를 입력하세요");
		  int tmp2 = 0;
		  String msg = "";
		  
		  try {
			  tmp2 = Integer.parseInt(tmp);
		  } catch(Exception e) {
			  msg = "나이 형식이 아닙니다";
		  } if(tmp2 <=9) {
			msg = "어린이입니다.";  
		  }
		  	else if(tmp2>= 10 && tmp2<20) {
			  JOptionPane.showMessageDialog(null, "10대입니다");
		  } else if(tmp2>= 20 && tmp2<30) {
			  JOptionPane.showMessageDialog(null, "20대입니다");
		  } else if(tmp2>= 30 && tmp2<40) {
			  JOptionPane.showMessageDialog(null, "30대입니다");
		  } else if(tmp2>= 40 && tmp2<50) {
			  JOptionPane.showMessageDialog(null, "40대입니다");
		  } else if(tmp2>= 50 && tmp2<60) {
			  JOptionPane.showMessageDialog(null, "50대입니다");
		  } else if(tmp2>= 60 && tmp2<70) {
			  JOptionPane.showMessageDialog(null, "60대입니다");
		  } else if(tmp2>= 70 && tmp2<80) {
			  JOptionPane.showMessageDialog(null, "70대입니다");
		  } else if(tmp2>= 80 && tmp2<90) {
			  JOptionPane.showMessageDialog(null, "90대입니다");
		  } else {
			  JOptionPane.showMessageDialog(null, "나이가 너무 어리거나 너무 많습니다.");
		  }
	} 
}



