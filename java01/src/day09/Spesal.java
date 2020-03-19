/*
 Using the Hello World guide, you¡¯ll create a repository, 
 start a branch, write comments, and open a pull request.
 
 	1. repository
 	
 	2. you¡¯ll create a repository, start a branch, write comments, and open a pull request.
 	
 	
 	
 	7. create a repository | start a branch | write comments | open a pull request
 	
 	[ create a repository, start a branch, write comments, open a pull request ]
 
 
 */

package day09;
import javax.swing.*;
import java.util.*;
public class Spesal {

	public static void main(String[] args) {
		String sp = "Using the Hello World guide, you¡¯ll create a repository, start a branch, write comments, and open a pull request.";
		//start a branch, write comments, and open a pull request.
		int tmp = 0;
		String tmp2 = "0";	 
				tmp2 = sp.substring(sp.indexOf("repository"),sp.indexOf("st"));
		System.out.print(tmp2);	
		System.out.println();	
		
		
		String tmp3 = "0";
		int idx = 0;
			idx = sp.indexOf(",");
			//tmp3 = sp.substring(0,idx);
			//tmp3 = sp.substring(idx+2);
			//tmp3 = sp.substring(sp.indexOf("c")+ sp.indexOf(idx));
			//tmp3 = sp.substring((idx+2)+(idx+1),(idx+2)+(idx+1)+14);
			//tmp3 = sp.substring((idx+2)+(idx+1)+16,((idx+2)+(idx+1)+16)+14);
			//tmp3 = sp.substring(((idx+2)+idx+1)+idx+9);
			System.out.print(tmp3);	
			
			System.out.println();
			
		String tmp5 = "0";
		int tmp55 = 0;
		int tmp555 = 0;
		int tmp5555 = 0;
		int idx2 = 0;
			tmp5 = sp.substring(sp.indexOf("create"),sp.indexOf("."));
			tmp55 = sp.indexOf("create");
			tmp555 = sp.indexOf(".");
			tmp5555 = tmp55+tmp555;
			String[] plan = new String[tmp5555];
			for(int i =0; i<plan.length; i++) {
				if(plan[i].equals(sp.indexOf("you¡¯ll"+1))) {
					plan[i] = sp.substring(idx+2);
				}
				
			}
			System.out.print(Arrays.toString(plan));
	}
}