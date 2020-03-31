package exam;
/*
President Trump said Sunday that the federal government’s guidelines for social distancing would last until April 30, backing down from his previous comments that he hoped the country could go back to work by Easter.

He had clashed with public health experts around the country when he suggested that the guidelines ? which urge people to stay at home and not to gather in groups of more than 10 ? might be relaxed by April 12. His announcement on Sunday indicated that he had backed down from that suggestion.
 	
 	단어 단위로 문자열을 잘라서 단어 길이가 제일 긴 단어의 글자 수와 단어를 출력하세요.
 	
 	단, ,와  .은 그리고 ? 는 단어에서 제외한다.
 */
import java.util.*;
import javax.swing.*;
public class practice01 {

	public practice01() {
		String str = "President Trump said Sunday that the federal government’s guidelines for social distancing would last until April 30, backing down from his previous comments that he hoped the country could go back to work by Easter." +  				  
				"He had clashed with public health experts around the country when he suggested that the guidelines ? which urge people to stay at home and not to gather in groups of more than 10 ? might be relaxed by April 12. His announcement on Sunday indicated that he had backed down from that suggestion.";
		
		String tmp = str.replaceAll(",","").replace("\\.", "").replace("\\?", "");
		
		StringTokenizer to = new StringTokenizer(tmp);
		
		ArrayList tmpp = new ArrayList();
		
		int len = 0;
		String word = "";
		while(to.hasMoreElements()) {
			tmpp.add(to.nextToken());
			
			for(int i = 0; i<tmpp.size(); i++) {
				String dno = (String)tmpp.get(i);
				int gilee = dno.length();
				if(gilee > len) {
					len = gilee;
					word = dno;
					break;
					
				}
			}
		}
		JOptionPane.showMessageDialog(null, "제일 긴 단어의 길이 : " + len + "\n제일 긴 단어 : " + word);
	
	}
	

	public static void main(String[] args) {
		new practice01();

	}

}
