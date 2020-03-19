package day08;
/*
extra ] 
		영문 문자열을 입려받아서
		해당 알파벳이 출현하는 빈도를 저장하고
		빈도를 * 로 표현하세요.
*/
import javax.swing.*;
public class SolvExtra {

	public static void main(String[] args) {
		String str = "we are the world!";
				// ==> w|e| |a|r| |t|h| |o|l|d|!
				
		//할일 
		// 0. 문자열에 포함된 문자로 이루어진 문자열을 만든다.
		String tmp = "";
		
		loop:
		for(int i =0; i<str.length(); i++) {
			char imsi = str.charAt(i);
			//tmp에 같은 문자가 있는지 검사하고 없으면 더해준다.
			for(int j =0; j<tmp.length(); j++) { //0< "" -->?
				if(imsi == tmp.charAt(j)) { 
					continue loop;
				}
			}
			tmp = tmp + imsi;
		}
	
		//2. 포함된 문자의 배열을 만들 수 있게 되었으므로 문자 배열과카운트 배열을 만든다.
		char[] ch = tmp.toCharArray(); //포함된 문자를 저장할 배열
		//만자 배열을 문자의 아스키 코드가 작은 순으로 정렬하고
		for(int i=0; i<ch.length-1;i++) {
			for(int j = i+1; j<ch.length; j++) {
				if(ch[i] > ch[j]) {
					char c = ch[i];
					ch[i] = ch[j];
					ch[j] = c;
				}
			}
		}
		int cnt = tmp.length();
		int[] count = new int[cnt]; // 포함될 문자의 출현 빈도를 기억할 배열
		//2 문자마다 출현하는 카운트를 구해준다.
		for(int i = 0; i<ch.length; i++) {
			char c = ch[i];
			for(int j= 0; j<str.length(); j++) {
				if(c == str.charAt(j)) {
					count[i] +=1;
				}
			}
		}
		// 3. 출력한다.
		for(int i=0; i<ch.length; i++) {
			System.out.printf("%3c :" , ch[i]);
			for(int j = 0; j<count[i]; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	
		
	}
}
