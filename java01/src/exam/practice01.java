package exam;
/*
President Trump said Sunday that the federal government��s guidelines for social distancing would last until April 30, backing down from his previous comments that he hoped the country could go back to work by Easter.

He had clashed with public health experts around the country when he suggested that the guidelines ? which urge people to stay at home and not to gather in groups of more than 10 ? might be relaxed by April 12. His announcement on Sunday indicated that he had backed down from that suggestion.
 	
 	�ܾ� ������ ���ڿ��� �߶� �ܾ� ���̰� ���� �� �ܾ��� ���� ���� �ܾ ����ϼ���.
 	
 	��, ,��  .�� �׸��� ? �� �ܾ�� �����Ѵ�.
 */
import java.util.*;
import javax.swing.*;
public class practice01 {

	public practice01() {
		String str = "President Trump said Sunday that the federal government��s guidelines for social distancing would last until April 30, backing down from his previous comments that he hoped the country could go back to work by Easter." +  				  
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
		JOptionPane.showMessageDialog(null, "���� �� �ܾ��� ���� : " + len + "\n���� �� �ܾ� : " + word);
	
	}
	

	public static void main(String[] args) {
		new practice01();

	}

}
