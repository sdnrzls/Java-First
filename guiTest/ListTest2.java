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

//JFrame  기본레이아웃은 BorderLayout
//Jpanel  기본 레이아웃은 FlowLayout

public class ListTest2 extends JFrame {
	private JTextField tf;  //한줄 텍스트 입력창 변수 tf
	private JTextArea ta; //여러줄  텍스트 입력창 변수 ta
	private List list; // 리스트 변수 list 
	private JCheckBox cb; //체크박스 변수 cb 
	
	public ListTest2() {
		setTitle("List 예제2"); // 제목설정
		setLayout(new BorderLayout()); //레이아웃 설정
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 닫기
		
		JPanel p1 = new JPanel();	// p1 j패널 생성
		tf = new JTextField(15); // 텍스트 입력창 tf 15크기로 생성
		JButton btn = new JButton("추가"); // 버튼 생성
		cb = new JCheckBox("다중선택"); // 체크박스 "다중선택"으로 생성
		p1.setBackground(Color.GRAY); // 배경색 설정
		p1.add(tf); p1.add(btn); p1.add(cb); //p1패널에 tf(텍스트),btn(버튼),cb(체크박스) 추가
		
		JPanel p2 = new JPanel(new GridLayout(1, 2));
		list = new List(); // 리스트생성
		ta = new JTextArea(); // 여러줄 텍스트 입력창 생성
		p2.add(list); p2.add(ta); //p2패널에 list(리스트),ta(텍스트) 추가
		ActionH ah = new ActionH();// 내부클래스 넣음
		ItemH ih = new ItemH();
		
		btn.addActionListener(ah); // 버튼을 ActionListener에 연결
		tf.addActionListener(ah); // 텍스트입력창을 엔터를 눌러도 사용가능
		list.addItemListener(ih);// 리스트를 ActionListener에 연결
		cb.addItemListener(ih);// 체크박스를 ItemListener에 연결
		
		
		add(BorderLayout.NORTH,p1); //p1를 보더레이아웃 위치(north) 추가
		add(BorderLayout.CENTER,p2);//p2를 보더레이아웃 위치(center) 추가
		
		setSize(400,400); //창의 사이즈 400,400
		setVisible(true); //화면에 보이기
		
	}
		
	
	
	public static void main(String[] args) {
			new ListTest2();
		}
	
	class ActionH implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
			if(tf.getText().isEmpty()) return; // isEmpty 빈공간이면 true 그렇지않다면 false
			list.add(tf.getText());//tf의 적힌 텍스트를 list에 추가
			tf.setText("");// 입력후 지워주는
		}
	}//ActionH
	
	class ItemH implements ItemListener{
		@Override
		public void itemStateChanged(ItemEvent e) {
			Object obj = e.getSource(); //이벤트를 발생한 객체를 구분
			
			if(obj==list) { // list가 이벤트 발생
				ta.setText("");
				if(list.isMultipleMode()) {//list가 다중 선택
					String[] arr = list.getSelectedItems(); //리스트에 있는 값을 여러개 선택
					for(int i =0; i<arr.length; i++) {
						ta.append(arr[i]+"\n");
					}
				}else {//list가 단일 선택
					ta.setText(list.getSelectedItem()); //리스트(list)에서 선책한 애용을 textarea(ta)  출력
				}		
			}else if(obj==cb) {//checkbox가 이벤트발생
				if(cb.isSelected()) {//체크박스 선택 -> list 다중모드
					list.setMultipleMode(true);
				}else {//체크박스 해제 ->list 단일모드
					list.setMultipleMode(false);
				}
			}
		}
	}//ItemH


	

}//ListTest2
