package guiTest;

import java.awt.GridLayout;
import java.awt.List;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.HashMap;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Bank extends JFrame  {
	HashMap<String, Integer> hm = new HashMap<String, Integer>();
	
	public Bank() {
		setTitle("Bank");// Ÿ��Ʋ ����
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //������
		setLayout(new GridLayout(1,2)); //���̾ƿ� 1��2�� ����
		JPanel left =new JPanel();// ���� �гλ���
		left.setLayout(new GridLayout(5, 1));//�����г� ���̾ƿ� 5��1��
		JPanel p1 =new JPanel();//����ȭ�� ù������
		p1.add(new JLabel("�̸�"));
		JTextField tfName = new JTextField(15);
		p1.add(tfName);
		
		JButton btn = new JButton("���»���");//����ȭ�� �ι�° ��
		p1.add(btn);
		
		JPanel p2 =new JPanel();//����ȭ�� ��������
		p2.add(new JLabel("�ܾ�"));
		JTextField tfBalance = new JTextField(10);
		p2.add(tfBalance);
		
		JPanel p3 =new JPanel();//����ȭ�� �׹�����
		JTextField tfMoney = new JTextField(15);
		p3.add(tfMoney);
		p3.add(new JLabel("��"));
		
		JPanel p4 =new JPanel();//����ȭ�� �ټ�������
		JButton inputBtn = new JButton("����");
		JButton outputBtn = new JButton("���");
		JButton filtBtn = new JButton("���Ϸ� ����");
		p4.add(inputBtn); p4.add(outputBtn); p4.add(filtBtn);
		
		left.add(p1); left.add(p2); left.add(p3); left.add(p4);
		//������ȭ��
		List lst = new List();
		//����,������ ȭ����̱�
		add(left); add(lst);
		
		//���»�����ư Ŭ��
		btn.addActionListener(new ActionListener() {	 //tfName�� ������ �����ͼ� lst�� �߰�
			@Override
			public void actionPerformed(ActionEvent a) {
				if(tfName.getText().isEmpty()) return;
				lst.add(tfName.getText());
				hm.put(tfName.getText(),0);//�ʿ�����
				tfName.setText("");
			}
		});
		
		//����Ʈ
		lst.addItemListener(new ItemListener() { // ����Ʈ���� ������ �̸��� tfName�� �ְ� �ܾ��� tfBalnce�� �ֱ�
			@Override
			public void itemStateChanged(ItemEvent b) {
				String str = lst.getSelectedItem(); //����Ʈ���� ������ �̸��� str�̶�� ���� ����
				tfName.setText(str);
				tfBalance.setText(hm.get(str)+""); // +""�� ���������� �ٲ��ִ� ������ ����
			}
		});
		
		//����
		inputBtn.addActionListener(new ActionListener() {// ����Ʈ�������õ� ���� �ܾ׿� tfMoney��ŭ ���ؼ� tfBalance(�ܾ�)�� �����ְ� �ʿ� ����
			@Override
			public void actionPerformed(ActionEvent c) {
				 String key = lst.getSelectedItem();//����Ʈ���� ������ �̸��� key�̶�� ���� ����
				int balance = hm.get(key); //�����ܾ� (key�� value���� balance���(get.()) ��������)
				int value = balance+Integer.parseInt(tfMoney.getText()); //���� �ܾ� = �����ܾ� + tfmoney�� �Է��� ��
				tfBalance.setText(value+""); // ȭ�鿡 �ܾ� ����
				hm.put(key,value); //hm ���� ����
				tfMoney.setText("");//���Ǹ� ���� ���ݾ� �����
			}
		});
		
		//���
		outputBtn.addActionListener(new ActionListener() { //����Ʈ���� ���õ� ���� �ܾ׿� tfMoney��ŭ ���� tfBalance(�ܾ�)�� �����ְ� �ʿ� ����
			@Override
			public void actionPerformed(ActionEvent e) {
			
				String key = lst.getSelectedItem();//����Ʈ���� ������ �̸��� key�̶�� ���� ����
				int balance = hm.get(key); //�����ܾ� (key�� value���� balance���(get.()) ��������)
				int value = balance-Integer.parseInt(tfMoney.getText());//���� �ܾ� = �����ܾ� - tfmoney�� �Է��� ��
				if(value<0) {
					new MessageBox("�ܾ׺���!!",key+"�� �ܾ��� �����մϴ�.");
					return;
				}
				tfBalance.setText(value+""); // ȭ�鿡 �ܾ� ����
				hm.put(key,value); //hm ���� ����
				tfMoney.setText(""); //���Ǹ� ���� ���ݾ� �����
			
				}
		});
		
		
		
		setSize(500,300);//ũ�⼳��
		setVisible(true);//���̱�
	}

	public static void main(String[] args) {
		new Bank();

	}

}
