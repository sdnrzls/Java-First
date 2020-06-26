package guiTest;

import java.awt.Button;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PannelTest extends Frame implements ActionListener{ //Frame ��� �ް�ActionListener
	TextField tf1; //��� ������ ���� TextField
	public PannelTest() {
		super("GUI Test"); // setTitle("GUI Test");
		Button b1 = new Button("��ư1");
		Button b2 = new Button("��ư2");
		Button b3 = new Button("��ư3");
		tf1 = new TextField(30); //���� �ؽ�Ʈ �Է�â 
		setLayout(new FlowLayout()); //��ġ ������
		add(b1);
		add(b2);
		add(b3);
		add(tf1);
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		setSize(300,400); // ��ư ������
		setVisible(true);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		String str = e.getActionCommand();
		if(str.equals("��ư1")) {
			System.out.println("��ư 1 �̺�Ʈ �߻�");
			setBackground(Color.YELLOW);//���� 
			System.out.println(tf1.getText());//tf1�� �Էµ� �� ǥ��
		}else if(str.equals("��ư2")) {
			System.out.println("��ư 2 �̺�Ʈ �߻�");
			setBackground(Color.BLUE);
		}else{
			System.out.println("��ư 3 �̺�Ʈ �߻�");
			setBackground(Color.PINK);
		}
}
		
	public static void main(String[] args) {
		new PannelTest(); //������
	
	}//main
}//class
