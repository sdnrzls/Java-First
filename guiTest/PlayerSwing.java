package guiTest;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.naming.spi.DirStateFactory.Result;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class PlayerSwing extends JFrame{
	JTextField[] tf = new JTextField[6];
	Connection con;
	public PlayerSwing() {
		dbCon();
		setTitle("Player Test");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new GridLayout(2,2));
		
		add(new PanelPane()); //1�� 1��
		JTextArea ta = new JTextArea();
		JScrollPane jsp = new JScrollPane(ta);
		add(jsp); //1�� 2��
		
		ta.addMouseListener(new MouseAdapter() { //��Ͷ� �������̽��� ������ Ŭ����
			@Override
			public void mouseReleased(MouseEvent e) {
			try {
				int num = Integer.parseInt(ta.getSelectedText().trim());
				tf[0].setText(num+"");
				String sql = "select * from player where num="+num;
				Statement	st = con.createStatement();
				ResultSet rs = st.executeQuery(sql);
					if(rs.next()) {
						tf[1].setText(rs.getString("name"));
						tf[2].setText(rs.getString("birth"));
						tf[3].setText(rs.getString("height")+"");
						tf[4].setText(rs.getString("weight")+"");
						tf[5].setText(rs.getString("kind"));
						
					}
					}catch(NullPointerException n) {
						JOptionPane.showMessageDialog(null, "��ȣ�� �����ϼ���");	 // �޼��� �ڽ� 
					} catch (SQLException e1) {
						e1.printStackTrace();
						}
			}
		});
		JPanel p1 = new JPanel();
		JButton insertBtn = new JButton("�߰�");
		JButton viewBtn = new JButton("����");
		JButton updateBtn = new JButton("����");
		JButton deleteBtn = new JButton("����");
		p1.add(insertBtn); p1.add(viewBtn); p1.add(updateBtn); p1.add(deleteBtn);
		add(p1);
		
		//�߰�
		 insertBtn.addActionListener(new ActionListener() {	
			@Override
			public void actionPerformed(ActionEvent e) {
				String sql="insert into player values(player_seq.nextval,?,?,?,?,?)";
				try {
					PreparedStatement ps = con.prepareStatement(sql);
					ps.setString(1, tf[1].getText());
					ps.setString(2, tf[2].getText());
					ps.setDouble(3, Double.parseDouble(tf[3].getText()));
					ps.setDouble(4, Double.parseDouble(tf[4].getText()));
					ps.setString(5, tf[5].getText());
					ps.executeUpdate();
				} catch (SQLException e1) {
					e1.printStackTrace();
				}
			}
		});
		 
		 //����
		 viewBtn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				ta.setText("");
				String sql = "select * from player order by num DESC";
			try {
				Statement st = con.createStatement();
				ResultSet rs = st.executeQuery(sql);
				while(rs.next()) {
					ta.append("��ȣ : "+rs.getInt("num")+"\n");
					ta.append("�̸� : "+rs.getString("name")+"\n");
					ta.append("���� : "+rs.getString("birth")+"\n");
					ta.append("Ű : "+rs.getDouble("height")+"\n");
					ta.append("������ : "+rs.getDouble("weight")+"\n");
					ta.append("���� : "+rs.getString("kind")+"\n");
					ta.append("\n");
					
				}
			}catch(SQLException e2) {
				e2.printStackTrace();
			}
			}
		});
		
		 //����
		 updateBtn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
		        String sql = "update player set name=?,birth=?,height=?,weight=?,kind=? where num=?";
		        try {
					PreparedStatement ps = con.prepareStatement(sql);
					ps.setString(1, tf[1].getText());
					ps.setString(2, tf[2].getText());
					ps.setDouble(3, Double.parseDouble(tf[3].getText()));
					ps.setDouble(4, Double.parseDouble(tf[4].getText()));
					ps.setString(5, tf[5].getText());
					ps.setInt(6, Integer.parseInt(tf[0].getText()));
					ps.executeUpdate();
					viewBtn.doClick();
					clearText();
				} catch (SQLException e1) {
					e1.printStackTrace();
				}
			}
		});
		 
		 //����
		 deleteBtn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				int result = JOptionPane.showConfirmDialog(null,"���� �����ұ��?","Confirm",JOptionPane.YES_NO_OPTION);
				if(JOptionPane.YES_OPTION==result) { //����
					int num = Integer.parseInt(tf[0].getText());
					try {
					String sql = "Delete from player where num="+num;
					Statement st = con.createStatement();
					st.executeUpdate(sql);
					clearText();
					viewBtn.doClick();
				} catch (SQLException e1) {
					e1.printStackTrace();
				}
				}
			}
		});
		 
		JPanel p2 = new JPanel(); //2�� 2��
		JComboBox<String>jcb = new JComboBox<String>();
		jcb.addItem("�̸�");
		jcb.addItem("����");
		JTextField searchtf = new JTextField(10);
		JButton searchbtn = new JButton("�˻�");
		p2.add(jcb); p2.add(searchtf); p2.add(searchbtn);
		add(p2);//2��2��
		
		//�˻���ư
		searchbtn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
			
			}
		});
		
		setSize(600,400);
		setVisible(true);
	}
	
	class  PanelPane extends JPanel{
		private String[] text = {"��ȣ","�̸�","����","Ű","������","����"}; 
		public  PanelPane() {
			setLayout(null);
			for(int i=0; i<text.length; i++) {
				JLabel la = new JLabel(text[i]);
				la.setHorizontalAlignment(JLabel.RIGHT); //������ ����
				la.setSize(50,20);
				la.setLocation(30,50+i*20);
				add(la);
				tf[i]= new JTextField(50);
				tf[i].setHorizontalAlignment(JTextField.CENTER); //��� ����
				tf[i].setSize(150,20);
				tf[i].setLocation(120, 50+i*20);
				add(tf[i]);
			}
			tf[0].setEditable(false);
		}
	}
	
	//DB����
	private void dbCon() {
		try {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		String url = "jdbc:oracle:thin:@localhost:1521:xe"; //localhost �� 1521��Ʈ ,xe : ����Ŭ ����
		String user = "scott";
		String pwd = "1234";
		con = DriverManager.getConnection(url, user, pwd);
		
		} catch (SQLException e) {
			e.printStackTrace();
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	private void clearText() {
		for(int i=0; i<tf.length;i++) {
			tf[i].setText("");
		}
	}
	
	public static void main(String[] args) {		
		new PlayerSwing();
	}//main

}//PlayerSwing
