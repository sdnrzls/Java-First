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
		setTitle("����");
		setLayout(new FlowLayout());// ���̾ƿ� ����
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		tf1 = new JTextField(5); //����1 ( ���� �ؽ�Ʈ �Է�â)
		tf2 = new JTextField(5); //����2 (")
		tf3 = new JTextField(20); //��� (")
		
		JButton b1 = new JButton("+");
		JButton b2 = new JButton("-");
		JButton b3 = new JButton("*");
		JButton b4 = new JButton("/");
		add(new JLabel("����1"));
		add(tf1); //tf1 ����1�� �Է�â�� �߰�
		add(new JLabel("����2"));
		add(tf2);  //tf2 ����2�� �Է�â�� �߰�
		add(b1);add(b2);add(b3);add(b4); //��ư�� �߰�
		add(new JLabel("���"));
		add(tf3); //tf3 ����� �Է�â�� �߰�
		b1.addActionListener(this); //������ ��ư b1�� ActionListener�� ����
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		
		setSize(800,150); //â��ũ�⸦ 600,150
		setVisible(true); //ȭ�鿡 ���̱�
	}
	
		@Override
		public void actionPerformed(ActionEvent e) {
			String str = e.getActionCommand();
			try {
			int a = Integer.parseInt(tf1.getText()); // �������� tf1�� ���ڷ� ����
			int b = Integer.parseInt(tf2.getText());// �������� tf2�� ���ڷ� ����
			switch(str) {
			case"+": tf3.setText(String.valueOf(a+b)); break; //setText �ȿ��� ���������� ���;��ؼ� String.valueOf�� ����
			case"-": tf3.setText(a-b+""); break; // +""���� ���������� �ν�
			case"*":  tf3.setText(a*b+""); break;// +""���� ���������� �ν�
			case"/":  tf3.setText(a/b+""); break;// +""���� ���������� �ν�
			}
			}catch(NumberFormatException n){
				tf3.setText("���ڸ� �Է��ϼ���"); //���ڸ� �Է����������� �����޼��� catch �� ���
			}catch(ArithmeticException a) {
				tf3.setText("0���� ���� �� �����ϴ�");
			}
			
		}

	
		public static void main(String[] args) {
		 new CalTest();
		}//main

	
}//class
