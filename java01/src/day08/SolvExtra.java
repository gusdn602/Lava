package day08;
/*
extra ] 
		���� ���ڿ��� �Է��޾Ƽ�
		�ش� ���ĺ��� �����ϴ� �󵵸� �����ϰ�
		�󵵸� * �� ǥ���ϼ���.
*/
import javax.swing.*;
public class SolvExtra {

	public static void main(String[] args) {
		String str = "we are the world!";
				// ==> w|e| |a|r| |t|h| |o|l|d|!
				
		//���� 
		// 0. ���ڿ��� ���Ե� ���ڷ� �̷���� ���ڿ��� �����.
		String tmp = "";
		
		loop:
		for(int i =0; i<str.length(); i++) {
			char imsi = str.charAt(i);
			//tmp�� ���� ���ڰ� �ִ��� �˻��ϰ� ������ �����ش�.
			for(int j =0; j<tmp.length(); j++) { //0< "" -->?
				if(imsi == tmp.charAt(j)) { 
					continue loop;
				}
			}
			tmp = tmp + imsi;
		}
	
		//2. ���Ե� ������ �迭�� ���� �� �ְ� �Ǿ����Ƿ� ���� �迭��ī��Ʈ �迭�� �����.
		char[] ch = tmp.toCharArray(); //���Ե� ���ڸ� ������ �迭
		//���� �迭�� ������ �ƽ�Ű �ڵ尡 ���� ������ �����ϰ�
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
		int[] count = new int[cnt]; // ���Ե� ������ ���� �󵵸� ����� �迭
		//2 ���ڸ��� �����ϴ� ī��Ʈ�� �����ش�.
		for(int i = 0; i<ch.length; i++) {
			char c = ch[i];
			for(int j= 0; j<str.length(); j++) {
				if(c == str.charAt(j)) {
					count[i] +=1;
				}
			}
		}
		// 3. ����Ѵ�.
		for(int i=0; i<ch.length; i++) {
			System.out.printf("%3c :" , ch[i]);
			for(int j = 0; j<count[i]; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	
		
	}
}
