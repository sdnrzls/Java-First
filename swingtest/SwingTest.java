package swingtest;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class SwingTest extends JFrame implements ActionListener {
		JTextField tf1;
		JTextArea ta;
			
	public SwingTest() {
		setTitle("연습"); //창의 제목
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new FlowLayout());
		 tf1 = new JTextField(20); // 한줄 텍스트 입력창
		JButton btn = new JButton("클릭"); // 버튼생성
		 ta = new JTextArea(5,20); // 여러줄  텍스트 입력창
		btn.addActionListener(this);
		add(tf1);
		add(btn);
		add(ta);
		setSize(500,500); //크기를 500,500
		setVisible(true); //화면에 보이기
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		ta.append(tf1.getText()+"\n"); //tf1의 텍스트를 ta에 추가
		tf1.setText("");
		
	}

	
	public static void main(String[] args) {
	new SwingTest();

	}//main


}//class
