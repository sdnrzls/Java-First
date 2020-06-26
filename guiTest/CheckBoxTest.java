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
	
	private JCheckBox cb;// 체크박스 변수 cb
	private JCheckBox cb2;
	private JTextArea ta;// 리스트 변수 list
	
	public  CheckBoxTest() {
		setTitle("CheckBoxTest");// 제목설정
		setLayout(new BorderLayout());//레이아웃 border로 설정
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//나가기
		
		JPanel p1 = new JPanel(); // p1패널 생성
		cb = new JCheckBox("바나나"); // 체크박스 생성
		cb2 = new JCheckBox("오렌지");
		JScrollPane jsp = new JScrollPane(ta);
		p1.add(cb); p1.add(cb2);
		cb.addItemListener(this);
		cb2.addItemListener(this);
		
		JPanel p2 = new JPanel(new GridLayout(1,1));
		ta = new JTextArea();
		p2.add(ta);
		
		
		
		add(BorderLayout.NORTH,p1); //p1를 보더레이아웃 위치(north) 추가
		add(BorderLayout.CENTER,p2);//p2를 보더레이아웃 위치(center) 추가
		
		setSize(400,400); //창의 사이즈 400,400
		setVisible(true); //화면에 보이기
		}
	
	
	
	@Override
	public void itemStateChanged(ItemEvent e) {
		Object obj = e.getSource(); //이벤트를 발생한 객체를 구분
		
		if(obj==cb) {
			if(cb.isSelected()) {
				ta.append(cb.getText()+"선택\n");
				ta.setBackground(Color.YELLOW);
			}else {
				ta.append(cb.getText()+" 선택해제\n");
				ta.setBackground(Color.WHITE);
			}
		}else if(obj==cb2) {
			if(cb2.isSelected()) {
				ta.append(cb2.getText()+"선택\n");
				ta.setBackground(Color.RED);
			}else {
				ta.append(cb2.getText() +"선택해제\n");
				ta.setBackground(Color.WHITE);
			}
		}
		
		
	}


	
	public static void main(String[] args) {
		new  CheckBoxTest();

	}
	
}//class
