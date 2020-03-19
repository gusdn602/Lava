package day09;
/*
 7. create a repository | start a branch | write comments | open a pull request
 	
 	[ create a repository, start a branch, write comments, open a pull request ]
 */
import java.util.*;
import javax.swing.*;
public class Specl02 {

	public static void main(String[] args) {
		String num7 = "create a repository ,start a branch ,write comments ,open a pull request";
		int idx = num7.indexOf(",");
		String tmp = "0";
		
		//tmp = num7.substring(0,idx);
		tmp = num7.substring(idx+1,(idx+2)+idx-6);
		//tmp = num7.substring(idx+idx-3);
		System.out.print(tmp);
	}

}
