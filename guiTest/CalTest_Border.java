package guiTest;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
// JFrame  기본레이아웃은 BorderLayout
// Jpanel  기본 레이아웃은 FlowLayout
public class CalTest_Border extends JFrame implements ActionListener {
	private JTextField tf1,tf2,tf3;
	
	public CalTest_Border(){
		setTitle("계산기 BorderLayout");
		setLayout(new BorderLayout());//BorderLayout 생성
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JPanel p1 = new JPanel(); // p1 패널 생성 패널의 기본 레이웃은 flow
		JPanel p2 = new JPanel();
		JPanel p3 = new JPanel();
		
		tf1 = new JTextField(5); //숫자1 ( 한줄 텍스트 입력창)
		tf2 = new JTextField(5); //숫자2 (")
		tf3 = new JTextField(20); //결과 (")
		
		JButton b1 = new JButton("+");
		JButton b2 = new JButton("-");
		JButton b3 = new JButton("*");
		JButton b4 = new JButton("/");
		
		p1.add(new JLabel("숫자1"));
		p1.add(tf1); //tf1 숫자1의 입력창을 추가
		p1.add(new JLabel("숫자2"));
		p1.add(tf2);  //tf2 숫자2의 입력창을 추가
		p2.add(b1);p2.add(b2);p2.add(b3);p2.add(b4); //버튼을 추가
		p3.add(new JLabel("결과"));
		p3.add(tf3); //tf3 결과의 입력창을 추가
		
		add(BorderLayout.NORTH,p1); // BorderLayout의 위쪽에 패널부착
		add(BorderLayout.CENTER,p2);
		add(BorderLayout.SOUTH,p3);
		
		b1.addActionListener(this); //생성한 버튼 b1을 ActionListener와 연결
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		
		setSize(400,200); //창의크기를 600,150
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
		 new CalTest_Border();
		}//main

	
}//class
