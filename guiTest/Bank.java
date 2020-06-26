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
		setTitle("Bank");// 타이틀 설정
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //나가기
		setLayout(new GridLayout(1,2)); //레이아웃 1행2열 설정
		JPanel left =new JPanel();// 왼쪽 패널생성
		left.setLayout(new GridLayout(5, 1));//왼쪽패널 레이아웃 5행1열
		JPanel p1 =new JPanel();//왼쪽화면 첫번쨰줄
		p1.add(new JLabel("이름"));
		JTextField tfName = new JTextField(15);
		p1.add(tfName);
		
		JButton btn = new JButton("계좌생성");//왼쪽화면 두번째 줄
		p1.add(btn);
		
		JPanel p2 =new JPanel();//왼쪽화면 세번쨰줄
		p2.add(new JLabel("잔액"));
		JTextField tfBalance = new JTextField(10);
		p2.add(tfBalance);
		
		JPanel p3 =new JPanel();//왼쪽화면 네번쨰줄
		JTextField tfMoney = new JTextField(15);
		p3.add(tfMoney);
		p3.add(new JLabel("원"));
		
		JPanel p4 =new JPanel();//왼쪽화면 다섯번쨰줄
		JButton inputBtn = new JButton("예금");
		JButton outputBtn = new JButton("출금");
		JButton filtBtn = new JButton("파일로 저장");
		p4.add(inputBtn); p4.add(outputBtn); p4.add(filtBtn);
		
		left.add(p1); left.add(p2); left.add(p3); left.add(p4);
		//오른쪽화면
		List lst = new List();
		//왼쪽,오른쪽 화면붙이기
		add(left); add(lst);
		
		//계좌생성버튼 클릭
		btn.addActionListener(new ActionListener() {	 //tfName의 내용을 가져와서 lst에 추가
			@Override
			public void actionPerformed(ActionEvent a) {
				if(tfName.getText().isEmpty()) return;
				lst.add(tfName.getText());
				hm.put(tfName.getText(),0);//맵에저장
				tfName.setText("");
			}
		});
		
		//리스트
		lst.addItemListener(new ItemListener() { // 리스트에서 선택한 이름을 tfName에 넣고 잔액은 tfBalnce에 넣기
			@Override
			public void itemStateChanged(ItemEvent b) {
				String str = lst.getSelectedItem(); //리스트에서 선택한 이름을 str이라는 변수 지정
				tfName.setText(str);
				tfBalance.setText(hm.get(str)+""); // +""는 문자형으로 바꿔주는 간단한 수식
			}
		});
		
		//예금
		inputBtn.addActionListener(new ActionListener() {// 리스트에서선택된 계좌 잔액에 tfMoney만큼 더해서 tfBalance(잔액)을 고쳐주고 맵에 저장
			@Override
			public void actionPerformed(ActionEvent c) {
				 String key = lst.getSelectedItem();//리스트에서 선택한 이름을 key이라는 변수 지정
				int balance = hm.get(key); //기존잔액 (key의 value값을 balance라는(get.()) 변수지정)
				int value = balance+Integer.parseInt(tfMoney.getText()); //수정 잔액 = 기존잔액 + tfmoney에 입력한 값
				tfBalance.setText(value+""); // 화면에 잔액 수정
				hm.put(key,value); //hm 내용 수정
				tfMoney.setText("");//편의를 위해 예금액 지우기
			}
		});
		
		//출금
		outputBtn.addActionListener(new ActionListener() { //리스트에서 선택된 계좌 잔액에 tfMoney만큼 빼서 tfBalance(잔액)을 고쳐주고 맵에 저장
			@Override
			public void actionPerformed(ActionEvent e) {
			
				String key = lst.getSelectedItem();//리스트에서 선택한 이름을 key이라는 변수 지정
				int balance = hm.get(key); //기존잔액 (key의 value값을 balance라는(get.()) 변수지정)
				int value = balance-Integer.parseInt(tfMoney.getText());//수정 잔액 = 기존잔액 - tfmoney에 입력한 값
				if(value<0) {
					new MessageBox("잔액부족!!",key+"님 잔액이 부족합니다.");
					return;
				}
				tfBalance.setText(value+""); // 화면에 잔액 수정
				hm.put(key,value); //hm 내용 수정
				tfMoney.setText(""); //편의를 위해 예금액 지우기
			
				}
		});
		
		
		
		setSize(500,300);//크기설정
		setVisible(true);//보이기
	}

	public static void main(String[] args) {
		new Bank();

	}

}
