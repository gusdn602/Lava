package day14;
/**
 *  이 클래스는 JButton의 이벤트를 처리할 때 사용하는 무명 내부 클래스의 사용법을 연습용 클래스
 * @author 우현우
 * @since 2020.03.26
 * @version v.1.0
 * @see	
 * 		JFrame, JPanel, JButton, ActionListener
 */
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class Colorwin {
	/*
	 	자바에서 GUI를 만들 수 있는 도구를 제공하고 있는데
	 	javax.swing 패키지와 java.awt 패키지이다.
	 	
	 	이 클래스에서는 Windows에 창을 만들어주는 JFrame을 사용해서 창을 만들고
	 	내부에 JPanner을 이용해서 채운 후
	 	JPannel의 색상을 변경하고
	 	그리고 JButton에 기능을 부여해 보자
	 */
	//사용할 요소 변수 선언
	JFrame frame;
	JPanel pan1, pan2;
	JButton cBtn, eBtn, tBtn;
	public Colorwin() {
		//변수 초기화
		//frame 객체 만들어주고
		frame = new JFrame();
		//frame 창의 x 버튼 누를때 종료하는 기능 부여
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("아무것도 아닙니다!");
		
		pan1 = new JPanel();
		pan1.setBackground(Color.pink);
		pan2 = new JPanel();
		pan2.setBackground(Color.pink);
		
		cBtn = new JButton("Color");
		eBtn = new JButton("EXIT");
		tBtn = new JButton("title");
		
		//이벤트 객체 만들고
		TitleEvt evt1 = new TitleEvt(this);
		//tBtn에 이벤트 객체 넣어주고
		tBtn.addActionListener(evt1);
		eBtn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
			
		});
		
		cBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//이 함수는 칼라 버튼이 클릭이 되면 실행되는 함수로
				//칼라를 랜덤하게 만들어서 JPanel의 배경색을 변경시켜주는 함수이다.
				
				//먼저 칼라를 랜덤하게 만든다.
				int red = (int)(Math.random() * 256);
				int green = (int)(Math.random() * 256);
				int blue = (int)(Math.random() * 256);
				
				// 2. 칼라의 구성요소는 만들었으니 칼라를 만들자.
				Color color = new Color(red, green, blue);
				
				//3. 만들어진 칼라를  pan1, pan2에다가 입히자.
				pan1.setBackground(color);
				pan2.setBackground(color);
			}
			
		});
		
		pan2.add(cBtn);
		pan2.add(eBtn);
		pan2.add(tBtn);
		
		frame.add(pan1, BorderLayout.CENTER);
		frame.add(pan2, BorderLayout.SOUTH);
		//사이즈 부여하고
		frame.setSize(500, 500);
		frame.setVisible(true);
	}
	public static void main(String[] args) {
		new Colorwin();
	

	}

}

class TitleEvt implements ActionListener {
	Colorwin main;
	public TitleEvt() {}
	public TitleEvt(Colorwin main) {
		this.main = main;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		//먼저 타입을 입력 받는다.
		/*
		String title = JOptionPane.showInputDialog("타이틀을 입력하세요");
		main.frame.setTitle(title);
		*/
		main.frame.setTitle(JOptionPane.showInputDialog("타이틀을 입력하세요"));
	}
}
