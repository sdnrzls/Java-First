package guiTest;

import java.awt.GridLayout;
import java.awt.List;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Bank extends JFrame  {
	HashMap<String, Integer> hm = new HashMap<String, Integer>();
	List lst;
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
		JButton fileBtn = new JButton("���Ϸ� ����");
		p4.add(inputBtn); p4.add(outputBtn); p4.add(fileBtn);
		
		left.add(p1); left.add(p2); left.add(p3); left.add(p4);
		//������ȭ��
		 lst = new List();
		//����,������ ȭ����̱�
		add(left); add(lst);
		
		//���»�����ư Ŭ��
		btn.addActionListener(new ActionListener() {	 //tfName�� ������ �����ͼ� lst�� �߰�
			@Override
			public void actionPerformed(ActionEvent a) {
				if(tfName.getText().isEmpty()) return;
				lst.add(tfName.getText().trim());
				hm.put(tfName.getText().trim(),0);//�ʿ�����
				tfName.setText("");
			}
		});
		
		//����Ʈ
		lst.addItemListener(new ItemListener() { // ����Ʈ���� ������ �̸��� tfName�� �ְ� �ܾ��� tfBalnce�� �ֱ�
			@Override
			public void itemStateChanged(ItemEvent b) {
				String str = lst.getSelectedItem().trim(); //����Ʈ���� ������ �̸��� str�̶�� ���� ���� //trim() �յڰ�������
				tfName.setText(str);
				tfBalance.setText(hm.get(str)+""); // +""�� ���������� �ٲ��ִ� ������ ����
			}
		});
		
		//����
		inputBtn.addActionListener(new ActionListener() {// ����Ʈ�������õ� ���� �ܾ׿� tfMoney��ŭ ���ؼ� tfBalance(�ܾ�)�� �����ְ� �ʿ� ����
			@Override
			public void actionPerformed(ActionEvent c) {
				try {
				 String key = lst.getSelectedItem().trim();//����Ʈ���� ������ �̸��� key�̶�� ���� ����
				int balance = hm.get(key); //�����ܾ� (key�� value���� balance���(get.()) ��������)
				int value = balance+Integer.parseInt(tfMoney.getText()); //���� �ܾ� = �����ܾ� + tfmoney�� �Է��� ��
				tfBalance.setText(value+""); // ȭ�鿡 �ܾ� ����
				hm.put(key,value); //hm ���� ����
				tfMoney.setText("");//���Ǹ� ���� ���ݾ� �����
			}catch(NullPointerException n) {
				new MessageBox("����!!!", "���¸� �������ּ���");
			}catch(NumberFormatException m) {
				new MessageBox("�Է¿���", "���ڸ��Է��ϼ���");
			}
			}
		});
		
		//���
		outputBtn.addActionListener(new ActionListener() { //����Ʈ���� ���õ� ���� �ܾ׿� tfMoney��ŭ ���� tfBalance(�ܾ�)�� �����ְ� �ʿ� ����
			@Override
			public void actionPerformed(ActionEvent e) {
				try {
				String key = lst.getSelectedItem().trim();//����Ʈ���� ������ �̸��� key�̶�� ���� ����
				int balance = hm.get(key); //�����ܾ� (key�� value���� balance���(get.()) ��������)
				int value = balance-Integer.parseInt(tfMoney.getText());//���� �ܾ� = �����ܾ� - tfmoney�� �Է��� ��
				if(value<0) {
					new MessageBox("�ܾ׺���!!",key+"�� �ܾ��� �����մϴ�.");
					return;
				}
				tfBalance.setText(value+""); // ȭ�鿡 �ܾ� ����
				hm.put(key,value); //hm ���� ����
				tfMoney.setText(""); //���Ǹ� ���� ���ݾ� �����
				}catch(NullPointerException n) {
					new MessageBox("����", "���¸� ���� ���ּ���");
				}catch(NumberFormatException m) {
					new MessageBox("�Է¿���", "���ڸ��Է����ּ���");
				}
				}
		});
		
		//���Ϸ� ����
		fileBtn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				//hm�� ���� -> file
				File dir = new File("src\\guiTest");
				File file = new File(dir,"myBank.txt");
				try {
					FileWriter fw = new FileWriter(file);
					Set<String>set=hm.keySet(); // key�� ����
					Iterator<String>it = set.iterator();
					while(it.hasNext()) {
						String key = it.next(); //�ϳ��� key ���ϱ�
						fw.write(key+" ");//�̸� ��������
						fw.write(hm.get(key)+"\n");//�ܾױ��ϱ�
					}
					fw.close();
				} catch (IOException e1) {
					new MessageBox("���Ͽ���", "�����������");
					e1.printStackTrace();
				}
			}
		});
		
		setSize(500,300);	//ũ�⼳��
		setVisible(true);	//���̱�
		load();
	}
	
		private void load() {
			hm.clear();
			File dir = new File("src\\guiTest");
			File file = new File(dir,"myBank.txt");
			try {
				if(!file.exists()) {
					file.createNewFile();
				}
				Scanner sc = new Scanner(file); //���Ϸ� �о����
				while(sc.hasNext()) {
					String name = sc.next().trim(); //�̸�
					int money =sc.nextInt(); //�ܾ�
					hm.put(name,money); //�ʿ� ����
					lst.add(name + "\n"); // ����Ʈ�� �̸��߰�
				} 
				sc.close();
				}catch (Exception e) {
					e.printStackTrace();
				}
		}
			

	public static void main(String[] args) {
		new Bank();
	}//main

}//bank class
