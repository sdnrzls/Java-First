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
	JTextArea ta; //�ؽ�Ʈ �Է�â ����
	File f; // ���� ����
	public Memo(String title) {
		setTitle(title);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JMenu mfile = new JMenu("����"); // �޴� �����
		JMenuItem mNew = new JMenuItem("������"); //�޴��� ���ԵǴ� ���(������)
		JMenuItem mOpen = new JMenuItem("����");//�޴��� ���ԵǴ� ���(������)
		JMenuItem mSave = new JMenuItem("����");//�޴��� ���ԵǴ� ���(������)
		JMenuItem mSaveAs = new JMenuItem("�ٸ��̸���������");//�޴��� ���ԵǴ� ���(������)
		JMenuItem mExit = new JMenuItem("������");//�޴��� ���ԵǴ� ���(������) 
		mfile.add(mNew); mfile.add(mOpen);  mfile.add(mSave); mfile.add(mSaveAs); mfile.addSeparator(); mfile.add(mExit); //�޴��� �����۵� �߰�
		
		JMenuBar mb = new JMenuBar(); //�޴� �� �����
		mb.add(mfile);// �޴�("����")�� �޴��ٿ� �߰�
		setJMenuBar(mb);// �޴� ǥ��
		
		 ta = new JTextArea(); // �ؽ�Ʈ �Է�â ����
		JScrollPane jsp = new JScrollPane(ta); //��ũ�� ����(ta)��� �ؽ�Ʈâ��
		add(jsp); //��ũ�� �߰�
		
		//������
		mNew.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				ta.setText(""); // �ؽ�Ʈ�Է�â�� ���� ����
				setTitle("�������"); // Ÿ��Ʋ �����������
			}
		});
		
		//����
		mOpen.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				JFileChooser fc = new JFileChooser(); // ���� ���� ���� ����
				if(fc.showOpenDialog(Memo.this)== JFileChooser.CANCEL_OPTION) return; //���ϼ����� ĵ���� ���ٸ� ����
				 f = fc.getSelectedFile(); // ���õ� ����
				 setTitle(f.getName());// ������ ���� �̸� �״�� Ÿ��Ʋ��������
				 fileRead(f);// �����б�
			}
		});
		
		//����
		mSave.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if(getTitle().equals("�������")) { // Ÿ��Ʋ�� ��������̶��
//					JFileChooser fc = new JFileChooser(); // ���ϼ��� ���� ����
//					if(fc.showSaveDialog(Memo.this)==JFileChooser.CANCEL_OPTION) return; //���ϼ����� ĵ���� ���ٸ� ����
//					f = fc.getSelectedFile(); //���õ� ����
//					fileSave(f); // ���� ����
//					setTitle(f.getName()); // ������ ���� �̸� �״�� Ÿ��Ʋ��������
					mSaveAs.doClick();// mSaveAs ���
				}else {
					fileSave(f); //��������
				}
			}
		});
		
		//�ٸ��̸���������
		mSaveAs.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				JFileChooser fc = new JFileChooser();  // ���ϼ��� ���� ����
				if(fc.showSaveDialog(Memo.this)==JFileChooser.CANCEL_OPTION) return;  //���ϼ����� ĵ���� ���ٸ� ����
				f = fc.getSelectedFile();  //���õ� ����
				fileSave(f); // ���� ����
				setTitle(f.getName()); // ������ ���� �̸� �״�� Ÿ��Ʋ��������
			}
		});
		
		//������
		mExit.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0); //������
			}
		});
		
		
		setSize(500,400);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new Memo("�������");
	}//main
	//���� �б� �޼ҵ�
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
	
	//���� ���� �޼ҵ�
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
