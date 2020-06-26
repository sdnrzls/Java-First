package guiTest;

import java.awt.Button;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PannelTest extends Frame implements ActionListener{ //Frame 상속 받고ActionListener
	TextField tf1; //멤버 변수로 선언 TextField
	public PannelTest() {
		super("GUI Test"); // setTitle("GUI Test");
		Button b1 = new Button("버튼1");
		Button b2 = new Button("버튼2");
		Button b3 = new Button("버튼3");
		tf1 = new TextField(30); //한줄 텍스트 입력창 
		setLayout(new FlowLayout()); //배치 관리자
		add(b1);
		add(b2);
		add(b3);
		add(tf1);
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		setSize(300,400); // 버튼 사이즈
		setVisible(true);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		String str = e.getActionCommand();
		if(str.equals("버튼1")) {
			System.out.println("버튼 1 이벤트 발생");
			setBackground(Color.YELLOW);//색깔 
			System.out.println(tf1.getText());//tf1에 입력된 값 표출
		}else if(str.equals("버튼2")) {
			System.out.println("버튼 2 이벤트 발생");
			setBackground(Color.BLUE);
		}else{
			System.out.println("버튼 3 이벤트 발생");
			setBackground(Color.PINK);
		}
}
		
	public static void main(String[] args) {
		new PannelTest(); //생성자
	
	}//main
}//class
