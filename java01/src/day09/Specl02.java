package day09;
/*
 7. create a repository | start a branch | write comments | open a pull request
 	
 	[ create a repository, start a branch, write comments, open a pull request ]
 */
import java.util.*;
import javax.swing.*;
public class Specl02 {

	public static void main(String[] args) {
		/*
		String num7 = "create a repository, start a branch, write comments, open a pull request";
		int idx = num7.indexOf(",");
		String tmp = "0";
		String[] bee = new String[3];
		StringTokenizer(idx);
			
		
				
					tmp = num7.substring(0,idx);
				
			
					tmp = num7.substring(idx+2,(idx+2)+idx-5);
				
				
				
					tmp = num7.substring(idx+idx-1, idx+idx+idx-6);
				
				
				
					tmp = num7.substring(idx+idx+idx-4);
					System.out.println(bee);
					*/
		
		String str = "States seeking masks, drugs, ventilators and other items from the stockpile are encountering a system beset by years of underfunding, changing lines of authority, confusion over the allocation of supplies and a lack of transparency from the administration, said state and federal officials and public health experts. By Amy Goldstein, Lena H. Sun and Beth Reinhard";
		String tmp = str;
		int tmpp = 0;
		// , �� ��� �������� ī��Ʈ �Ѵ�.
		int cnt = 0;
	
		for(int i = 0 ; i < tmp.length() ; i++ ) {
			// ���ڸ� ���ھ� ������ ���� ��ǥ�� ������ ī��Ʈ�� �÷��ش�.
			if(tmp.charAt(i) == ',') {
				cnt += 1;
			}
		}
		
		// ���� ��ǥ�� ��� ������ �Ǿ����� �˾Ƴ�����
		// �迭�� �����
		String[] arr = new String[cnt + 1];
		// �ݺ��ؼ� �迭�� ��ǥ ���� �߶� �־��ְ� ��ǥ ������ tmp�� ��ü������.
		
		for(int i = 0 ; i < cnt; i++) {
			// ��ǥ�� ��ġ �˾Ƴ���
			int idx = tmp.indexOf(",");
			// ��ǥ �������� ���ڿ� �߶� �迭�� ���
			arr[i] = tmp.substring(0, idx);
			// tmp �� ���� ���ڿ��� ��ü�ϰ�
			tmp = tmp.substring(idx + 2);
			
		}
		// ������ ���ڿ� ä���ְ�
		
		arr[cnt] = tmp;
		
	System.out.println(tmpp);
		System.out.println("�ڸ��迭 : " + Arrays.deepToString(arr));
		System.out.println(arr.length);
	for(int i = 0; i<tmp.length(); i++) {
		if(arr[i]) {
			
		}
	}
		
		
		for(String msg : arr) {
			
			System.out.println(msg);
		}
		
	}
	
}

	
		
		
	


