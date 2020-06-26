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
		JButton b1 = new JButton("��ư1");
		JButton b2 = new JButton("��ư2");
		jtf = new JTextField(25); // ���� �ؽ�Ʈ �Է�â
		ta = new JTextArea(5,20); // ������  �ؽ�Ʈ �Է�â
		tta = new TextArea(5,10); // ������ �ؽ�Ʈ �Է�â (��ũ�� ����� ����)
		setLayout(new FlowLayout());
		add(b1);
		add(b2);
		add(jtf);
		add(ta);
		add(tta);
		b1.addActionListener(this);
		b2.addActionListener(this);
		//ũ�⸦ 300,400
		setSize(300, 400);
		//ȭ�鿡 ���̱�
		setVisible(true);
	 }
	
	@Override
	public void actionPerformed(ActionEvent e) {
		String str = e.getActionCommand();
		if(str.equals("��ư1")) {
			System.out.println("��ư 1 �̺�Ʈ �߻� ");
			getContentPane().setBackground(Color.BLACK);//J�������� getContentPane()���
			System.out.println(jtf.getText());
			System.out.println(ta.getText());
			System.out.println(tta.getText());
		}else {
			System.out.println("��ư 2 �̺�Ʈ �߻�");
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
