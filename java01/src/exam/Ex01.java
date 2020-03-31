package exam;

import javax.swing.*;

/*
 	JOptionPane으로 숫자를 입력받아서 
 	배열을 만들고 
 	배열이 기억할 수 있는 갯수만큼 숫자를 입력받아서 
 	그 숫자들의 합을 구해주는 프로그램을 작성하세요.
 	단, 합을 구하는 기능은 함수를 만들어서 처리하세요
 */
import java.util.*;
public class Ex01 {
	/*
	String input = JOptionPane.showInputDialog("숫자를 입력하세요");
	int tmp = 0;
	int cnt = 0;
	String[] bee1 = new String[in()];
	
	public Ex01() {
		in();
	}
	
	public int in() {
		tmp = Integer.parseInt(input);
		return tmp;
	}
	
	*/
	//배열을 만들려면 타입과 길이가 필요하다.
	//여기서 숫자를 입력받으라는 조건은 
	//배열의 길이로 사용할 숫자를 입력받으라는 말이므로
	//먼저 배열의 길이에 해당하는 숫자를 입력받아서 정수형으로 변환해준다.
	
	int len = 0;
	
	while(true) {
		//숫자 형태 문자열 입력 받고
		String snum = JOptionPane.showInputDialog("배열의 길이를 입력하세요!");
			try {
				len = Integer.parseInt(snum);
				//이 라인일 읽는다면 위의 숫자로 변환과정이 무사히 진행이 된 것이므로
				//이 반복문을 종료해준다.
				break;
			} catch(Exception e) {
				JOptionPane.showMessageDialog(null, "숫자가 아닌 문자를 입력했습니다.");
				continue;
			}
			
	}
	int[] num = new int [len];
	
	//배열은 만들어 졌고 이제 배열에 숫자를 채워준다.
	loop:
	for(int i = 0; i < len; i++) {
		while(true) {
			String sno = JOptionPane.showInputDialog("숫자를 입력하세요!");
			try {
				int no = Integer.parseInt(sno);
				//이 라인을 실행하는 경우는 위의 정수로 변환 과정이 정상적으로 수행이 된 경우이므로
				//배열에 채워주면 된다.
				num[i] = no;
				//이제 다음 방의 데이터를 채워준다.
				continue loop;
			}	catch(Exception e) {
				//이 경우는 배열에 채울 숫자를 못만든 경우이므로
				//숫자를 다시 만들자
				continue;
			}
		}
	}

	//이제 배열을 완성 되었으니 합을 구해주자
	 int sum = getSum(num);
	 //출력
	 JOptionPane.showInputDialog(null, num.toString() + "\n" + "sum :" + sum);
}

/*
public int getSum(int...arr) {
	int sum = 0;
	for(int i =0; i <arr.length; i++) {
		sum +=
	
	return sum;
}
*/

