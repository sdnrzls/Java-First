package guiTest;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class JGugudan extends JFrame implements ActionListener{
	
	JTextArea ta;
	JTextField tf;
	public JGugudan() {
		setTitle("구구단");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JButton b1 = new JButton("구구단");
		tf = new JTextField(25);
		ta = new JTextArea(10,20);
		add(tf); add(b1); add(ta);
		setLayout(new FlowLayout());
		setSize(300, 400);
		setVisible(true);
		b1.addActionListener(this);
		tf.addActionListener(this);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		ta.setText("");
		try {
			int b = Integer.parseInt(tf.getText());
			for(int i=1; i<10; i++) {
					ta.append(b+"x"+i+"="+b*i+"\n");
				}
		}catch(NumberFormatException n) {
			tf.setText("숫자를 입력하세요");
		}
		}
	
	public static void main(String[] args) {
		new JGugudan();
	}//main
}//class
