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
		setTitle("����"); //â�� ����
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new FlowLayout());
		 tf1 = new JTextField(20); // ���� �ؽ�Ʈ �Է�â
		JButton btn = new JButton("Ŭ��"); // ��ư����
		 ta = new JTextArea(5,20); // ������  �ؽ�Ʈ �Է�â
		btn.addActionListener(this);
		add(tf1);
		add(btn);
		add(ta);
		setSize(500,500); //ũ�⸦ 500,500
		setVisible(true); //ȭ�鿡 ���̱�
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		ta.append(tf1.getText()+"\n"); //tf1�� �ؽ�Ʈ�� ta�� �߰�
		tf1.setText("");
		
	}

	
	public static void main(String[] args) {
	new SwingTest();

	}//main


}//class
