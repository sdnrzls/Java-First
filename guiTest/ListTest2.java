package guiTest;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.List;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

//JFrame  �⺻���̾ƿ��� BorderLayout
//Jpanel  �⺻ ���̾ƿ��� FlowLayout

public class ListTest2 extends JFrame {
	private JTextField tf;  //���� �ؽ�Ʈ �Է�â ���� tf
	private JTextArea ta; //������  �ؽ�Ʈ �Է�â ���� ta
	private List list; // ����Ʈ ���� list 
	private JCheckBox cb; //üũ�ڽ� ���� cb 
	
	public ListTest2() {
		setTitle("List ����2"); // ������
		setLayout(new BorderLayout()); //���̾ƿ� ����
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // �ݱ�
		
		JPanel p1 = new JPanel();	// p1 j�г� ����
		tf = new JTextField(15); // �ؽ�Ʈ �Է�â tf 15ũ��� ����
		JButton btn = new JButton("�߰�"); // ��ư ����
		cb = new JCheckBox("���߼���"); // üũ�ڽ� "���߼���"���� ����
		p1.setBackground(Color.GRAY); // ���� ����
		p1.add(tf); p1.add(btn); p1.add(cb); //p1�гο� tf(�ؽ�Ʈ),btn(��ư),cb(üũ�ڽ�) �߰�
		
		JPanel p2 = new JPanel(new GridLayout(1, 2));
		list = new List(); // ����Ʈ����
		ta = new JTextArea(); // ������ �ؽ�Ʈ �Է�â ����
		p2.add(list); p2.add(ta); //p2�гο� list(����Ʈ),ta(�ؽ�Ʈ) �߰�
		ActionH ah = new ActionH();// ����Ŭ���� ����
		ItemH ih = new ItemH();
		
		btn.addActionListener(ah); // ��ư�� ActionListener�� ����
		tf.addActionListener(ah); // �ؽ�Ʈ�Է�â�� ���͸� ������ ��밡��
		list.addItemListener(ih);// ����Ʈ�� ActionListener�� ����
		cb.addItemListener(ih);// üũ�ڽ��� ItemListener�� ����
		
		
		add(BorderLayout.NORTH,p1); //p1�� �������̾ƿ� ��ġ(north) �߰�
		add(BorderLayout.CENTER,p2);//p2�� �������̾ƿ� ��ġ(center) �߰�
		
		setSize(400,400); //â�� ������ 400,400
		setVisible(true); //ȭ�鿡 ���̱�
		
	}
		
	
	
	public static void main(String[] args) {
			new ListTest2();
		}
	
	class ActionH implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
			if(tf.getText().isEmpty()) return; // isEmpty ������̸� true �׷����ʴٸ� false
			list.add(tf.getText());//tf�� ���� �ؽ�Ʈ�� list�� �߰�
			tf.setText("");// �Է��� �����ִ�
		}
	}//ActionH
	
	class ItemH implements ItemListener{
		@Override
		public void itemStateChanged(ItemEvent e) {
			Object obj = e.getSource(); //�̺�Ʈ�� �߻��� ��ü�� ����
			
			if(obj==list) { // list�� �̺�Ʈ �߻�
				ta.setText("");
				if(list.isMultipleMode()) {//list�� ���� ����
					String[] arr = list.getSelectedItems(); //����Ʈ�� �ִ� ���� ������ ����
					for(int i =0; i<arr.length; i++) {
						ta.append(arr[i]+"\n");
					}
				}else {//list�� ���� ����
					ta.setText(list.getSelectedItem()); //����Ʈ(list)���� ��å�� �ֿ��� textarea(ta)  ���
				}		
			}else if(obj==cb) {//checkbox�� �̺�Ʈ�߻�
				if(cb.isSelected()) {//üũ�ڽ� ���� -> list ���߸��
					list.setMultipleMode(true);
				}else {//üũ�ڽ� ���� ->list ���ϸ��
					list.setMultipleMode(false);
				}
			}
		}
	}//ItemH


	

}//ListTest2
