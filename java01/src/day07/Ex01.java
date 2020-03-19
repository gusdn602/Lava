package day07;
import java.util.Arrays;

/*
반장님 문제 ] 
	45 ~ 1 까지 저장할 배열을 만들고
	배열에서 로또 번호를 꺼내서 로또 한게임을 만들고 출력하세요.
	
 */
import javax.swing.*;
public class Ex01 {

	public static void main(String[] args) {
		int[] lotto = new int[6];
		loop:
		for(int i = 0; i<lotto.length; i++) {
			int no = (int)(Math.random()*(45 - 1 +1)+1);
			for(int j = 0; j < i; j++) {
				if(lotto[j] == no) {
					i++;
					continue loop;
				}
			}
			lotto[i] = no;
			
		}
		JOptionPane.showMessageDialog(null, "***당첨번호***\n" + Arrays.toString(lotto));
		
	}

}
