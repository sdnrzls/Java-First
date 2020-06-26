package guiTest;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class CalTest extends JFrame implements ActionListener {
	private JTextField tf1,tf2,tf3;
	
	public CalTest(){
		setTitle("계산기");
		setLayout(new FlowLayout());// 레이아웃 생성
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		tf1 = new JTextField(5); //숫자1 ( 한줄 텍스트 입력창)
		tf2 = new JTextField(5); //숫자2 (")
		tf3 = new JTextField(20); //결과 (")
		
		JButton b1 = new JButton("+");
		JButton b2 = new JButton("-");
		JButton b3 = new JButton("*");
		JButton b4 = new JButton("/");
		add(new JLabel("숫자1"));
		add(tf1); //tf1 숫자1의 입력창을 추가
		add(new JLabel("숫자2"));
		add(tf2);  //tf2 숫자2의 입력창을 추가
		add(b1);add(b2);add(b3);add(b4); //버튼을 추가
		add(new JLabel("결과"));
		add(tf3); //tf3 결과의 입력창을 추가
		b1.addActionListener(this); //생성한 버튼 b1을 ActionListener와 연결
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		
		setSize(800,150); //창의크기를 600,150
		setVisible(true); //화면에 보이기
	}
	
		@Override
		public void actionPerformed(ActionEvent e) {
			String str = e.getActionCommand();
			try {
			int a = Integer.parseInt(tf1.getText()); // 문자형인 tf1을 숫자로 변형
			int b = Integer.parseInt(tf2.getText());// 문자형인 tf2을 숫자로 변형
			switch(str) {
			case"+": tf3.setText(String.valueOf(a+b)); break; //setText 안에는 문자형으로 들어와야해서 String.valueOf로 변형
			case"-": tf3.setText(a-b+""); break; // +""사용시 문자형으로 인식
			case"*":  tf3.setText(a*b+""); break;// +""사용시 문자형으로 인식
			case"/":  tf3.setText(a/b+""); break;// +""사용시 문자형으로 인식
			}
			}catch(NumberFormatException n){
				tf3.setText("숫자를 입력하세요"); //숫자를 입력하지않을시 오류메세지 catch 문 사용
			}catch(ArithmeticException a) {
				tf3.setText("0으로 나눌 수 없습니다");
			}
			
		}

	
		public static void main(String[] args) {
		 new CalTest();
		}//main

	
}//class
