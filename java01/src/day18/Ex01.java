package day18;

import java.io.*;
import java.util.*;
import javax.swing.*;
public class Ex01 {
/*
 	문제 1 ]
 		1. Ex01.txt에 저장된 데이터를 Properties에 담고 
 		2. 키 값을 모두 꺼내서
 		3. 데이터를 추출하고
 		4. 총점을 구해주세요.
 		5. 메세지창을 띄워서 총점을 출력해주세요
 */
	public Ex01() {
		Properties pr = new Properties(); 
		
		FileInputStream ou = null;
		
		try {
			ou = new FileInputStream("src/day18/Ex01.txt");
			pr.load(ou);
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		
	}

	public static void main(String[] args) {
		new Ex01();

	}

}
