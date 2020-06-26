package guiTest;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class JPannelTest extends JFrame implements ActionListener{
	JTextField jtf;
	JTextArea ta;
	TextArea tta;
	public JPannelTest(){
		JButton b1 = new JButton("버튼1");
		JButton b2 = new JButton("버튼2");
		jtf = new JTextField(25); // 한줄 텍스트 입력창
		ta = new JTextArea(5,20); // 여러줄  텍스트 입력창
		tta = new TextArea(5,10); // 여러줄 텍스트 입력창 (스크롤 기능이 있음)
		setLayout(new FlowLayout());
		add(b1);
		add(b2);
		add(jtf);
		add(ta);
		add(tta);
		b1.addActionListener(this);
		b2.addActionListener(this);
		//크기를 300,400
		setSize(300, 400);
		//화면에 보이기
		setVisible(true);
	 }
	
	@Override
	public void actionPerformed(ActionEvent e) {
		String str = e.getActionCommand();
		if(str.equals("버튼1")) {
			System.out.println("버튼 1 이벤트 발생 ");
			getContentPane().setBackground(Color.BLACK);//J프레임은 getContentPane()사용
			System.out.println(jtf.getText());
			System.out.println(ta.getText());
			System.out.println(tta.getText());
		}else {
			System.out.println("버튼 2 이벤트 발생");
			Container con = getContentPane();
			con.setBackground(Color.WHITE);
			jtf.setText("");
			ta.setText("");
			tta.setText("");
		}
	}
	
	 
	 public static void main(String[] args) {
		new JPannelTest();

	}//main
}//class
