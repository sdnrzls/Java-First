package guiTest;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintStream;
import java.io.StringWriter;

import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class Memo extends JFrame {
	JTextArea ta; //텍스트 입력창 변수
	File f; // 파일 변수
	public Memo(String title) {
		setTitle(title);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JMenu mfile = new JMenu("파일"); // 메뉴 만들기
		JMenuItem mNew = new JMenuItem("새파일"); //메뉴에 포함되는 목록(아이템)
		JMenuItem mOpen = new JMenuItem("열기");//메뉴에 포함되는 목록(아이템)
		JMenuItem mSave = new JMenuItem("저장");//메뉴에 포함되는 목록(아이템)
		JMenuItem mSaveAs = new JMenuItem("다른이름으로저장");//메뉴에 포함되는 목록(아이템)
		JMenuItem mExit = new JMenuItem("끝내기");//메뉴에 포함되는 목록(아이템) 
		mfile.add(mNew); mfile.add(mOpen);  mfile.add(mSave); mfile.add(mSaveAs); mfile.addSeparator(); mfile.add(mExit); //메뉴에 아이템들 추가
		
		JMenuBar mb = new JMenuBar(); //메뉴 바 만들기
		mb.add(mfile);// 메뉴("파일")을 메뉴바에 추가
		setJMenuBar(mb);// 메뉴 표시
		
		 ta = new JTextArea(); // 텍스트 입력창 생성
		JScrollPane jsp = new JScrollPane(ta); //스크롤 생성(ta)라는 텍스트창에
		add(jsp); //스크롤 추가
		
		//새파일
		mNew.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				ta.setText(""); // 텍스트입력창에 공백 생성
				setTitle("제목없음"); // 타이틀 제목없음으로
			}
		});
		
		//열기
		mOpen.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				JFileChooser fc = new JFileChooser(); // 파일 선택 변수 생성
				if(fc.showOpenDialog(Memo.this)== JFileChooser.CANCEL_OPTION) return; //파일선택이 캔슬과 같다면 리턴
				 f = fc.getSelectedFile(); // 선택된 파일
				 setTitle(f.getName());// 설정한 파일 이름 그대로 타이틀가져오기
				 fileRead(f);// 파일읽기
			}
		});
		
		//저장
		mSave.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if(getTitle().equals("제목없음")) { // 타이틀이 제목없음이라면
//					JFileChooser fc = new JFileChooser(); // 파일선택 변수 생성
//					if(fc.showSaveDialog(Memo.this)==JFileChooser.CANCEL_OPTION) return; //파일선택이 캔슬과 같다면 리턴
//					f = fc.getSelectedFile(); //선택된 파일
//					fileSave(f); // 파일 저장
//					setTitle(f.getName()); // 설정한 파일 이름 그대로 타이틀가져오기
					mSaveAs.doClick();// mSaveAs 사용
				}else {
					fileSave(f); //파일저장
				}
			}
		});
		
		//다른이름으로저장
		mSaveAs.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				JFileChooser fc = new JFileChooser();  // 파일선택 변수 생성
				if(fc.showSaveDialog(Memo.this)==JFileChooser.CANCEL_OPTION) return;  //파일선택이 캔슬과 같다면 리턴
				f = fc.getSelectedFile();  //선택된 파일
				fileSave(f); // 파일 저장
				setTitle(f.getName()); // 설정한 파일 이름 그대로 타이틀가져오기
			}
		});
		
		//끝내기
		mExit.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0); //나가기
			}
		});
		
		
		setSize(500,400);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new Memo("제목없음");
	}//main
	//파일 읽기 메소드
	private void fileRead(File f) {
		try {
			FileReader fr = new FileReader(f);
			StringWriter sw = new StringWriter();
			while(true) {
				int ch = fr.read();		
				if(ch==-1) break;
				sw.write(ch);
			}
			ta.setText(sw.toString());
			sw.close();
			fr.close();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	//파일 저장 메소드
	private void fileSave(File f) {
		try {
			PrintStream ps = new PrintStream(f);
			ps.println(ta.getText());
			ps.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
	
}//Memo class
