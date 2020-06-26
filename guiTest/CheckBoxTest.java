package guiTest;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.List;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class CheckBoxTest  extends JFrame implements ItemListener{
	
	private JCheckBox cb;// üũ�ڽ� ���� cb
	private JCheckBox cb2;
	private JTextArea ta;// ����Ʈ ���� list
	
	public  CheckBoxTest() {
		setTitle("CheckBoxTest");// ������
		setLayout(new BorderLayout());//���̾ƿ� border�� ����
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//������
		
		JPanel p1 = new JPanel(); // p1�г� ����
		cb = new JCheckBox("�ٳ���"); // üũ�ڽ� ����
		cb2 = new JCheckBox("������");
		JScrollPane jsp = new JScrollPane(ta);
		p1.add(cb); p1.add(cb2);
		cb.addItemListener(this);
		cb2.addItemListener(this);
		
		JPanel p2 = new JPanel(new GridLayout(1,1));
		ta = new JTextArea();
		p2.add(ta);
		
		
		
		add(BorderLayout.NORTH,p1); //p1�� �������̾ƿ� ��ġ(north) �߰�
		add(BorderLayout.CENTER,p2);//p2�� �������̾ƿ� ��ġ(center) �߰�
		
		setSize(400,400); //â�� ������ 400,400
		setVisible(true); //ȭ�鿡 ���̱�
		}
	
	
	
	@Override
	public void itemStateChanged(ItemEvent e) {
		Object obj = e.getSource(); //�̺�Ʈ�� �߻��� ��ü�� ����
		
		if(obj==cb) {
			if(cb.isSelected()) {
				ta.append(cb.getText()+"����\n");
				ta.setBackground(Color.YELLOW);
			}else {
				ta.append(cb.getText()+" ��������\n");
				ta.setBackground(Color.WHITE);
			}
		}else if(obj==cb2) {
			if(cb2.isSelected()) {
				ta.append(cb2.getText()+"����\n");
				ta.setBackground(Color.RED);
			}else {
				ta.append(cb2.getText() +"��������\n");
				ta.setBackground(Color.WHITE);
			}
		}
		
		
	}


	
	public static void main(String[] args) {
		new  CheckBoxTest();

	}
	
}//class
