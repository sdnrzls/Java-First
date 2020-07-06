package Workout;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class Workout1 extends JFrame {

	private JPanel p;
	private JTextField tf;
	private JPanel p1;
	private JTextArea ta;
	private JTextField tf0;
	private JTextField tf1;
	private JTextField tf2;
	private JTextField tf3;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	Connection con;  
	Statement st;
	ResultSet rs ;
	PreparedStatement ps;
	
	//â ����
	public Workout1() {
		
		dbCon();
		setTitle("531 Project");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		p = new JPanel();
		p.setBorder(new EmptyBorder(5, 5, 5, 5));
		p.setLayout(new BorderLayout(0, 0));
		setContentPane(p);
		
		JPanel p0 = new JPanel();// �гλ���
		JButton sbtn= new JButton("����Ʈ 1��");
		sbtn.setBounds(12, 414, 109, 23);
		JButton sbtn2 = new JButton("����Ʈ 2��");
		sbtn2.setBounds(12, 447, 109, 23);
		JButton sbtn3 = new JButton("����Ʈ 3��");
		sbtn3.setBounds(12, 480, 109, 23);
		 
		JButton dbtn= new JButton("���帮��Ʈ 1��");
		dbtn.setBounds(274, 414, 135, 23);
		JButton dbtn2 = new JButton("���帮��Ʈ 2��");
		dbtn2.setBounds(274, 447, 135, 23);
		JButton dbtn3 = new JButton("���帮��Ʈ 3��");
		dbtn3.setBounds(274, 480, 135, 23);
		
		JButton bbtn= new JButton("��ġ������ 1��");
		bbtn.setBounds(133, 414, 129, 23);
		JButton bbtn2 = new JButton("��ġ������ 2��");
		bbtn2.setBounds(133, 447, 129, 23);
		JButton bbtn3 = new JButton("��ġ������ 3��");
		bbtn3.setBounds(133, 480, 129, 23);
		
		JButton obtn= new JButton("������������� 1��");
		obtn.setBounds(421, 414, 153, 23);
		JButton obtn2 = new JButton("������������� 2��");
		obtn2.setBounds(421, 447, 153, 23);
		JButton obtn3 = new JButton("������������� 3��");
		obtn3.setBounds(421, 480, 153, 23);
		JButton ex = new JButton("����");
	
		p0.setLayout(null);
		p0.add(sbtn); p0.add(sbtn2); p0.add(sbtn3); //��ư�� �гο� ����
		p0.add(dbtn); p0.add(dbtn2); p0.add(dbtn3); 
		p0.add(bbtn); p0.add(bbtn2); p0.add(bbtn3);
		p0.add(obtn); p0.add(obtn2); p0.add(obtn3);
		getContentPane().add(p0);
		p0.add(getP1());
		
		JTextArea ta2 = new JTextArea();
		ta2.setBounds(140, 0, 334, 146);
		p1.add(ta2);

		//�̹��� ����
		Imgwor im1 = new Imgwor(new ImageIcon("./image/workout.jpg").getImage());
		File f = new File("./image/workout.jpg");
		System.out.println(f.exists() ?"EXist":"doent exists");
		ta2.add(im1);
		
//-----------------------����Ʈ---------------------------------
		//����Ʈ 1��
		 sbtn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				ta.setText("");
				String sql = "select squat from work";
			try {
				st = con.createStatement();
				rs= st.executeQuery(sql);
				while(rs.next()) {
					int rep = 5;
					int set = 1;
					int i =2;
					while(i<11){			
						ta.append("����Ʈ("+rep+"x"+set+") : "+Math.round(rs.getDouble("squat")*(i*0.08))+"KG"+"\n");
						ta.append("\n");
						if(i>7) {
							rep--;
						}
						i++;	
					}
				}
			}catch(SQLException e2) {
				e2.printStackTrace();
			}
			}
		});
	
			//����Ʈ 2��
		 sbtn2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				ta.setText("");
				String sql = "select squat from work";
			try {
				st = con.createStatement();
				rs= st.executeQuery(sql);
				while(rs.next()) {
					int rep = 5;
					int set = 1;
					int i =2;
					while(i<11) {
						ta.append("����Ʈ("+rep+"x"+set+") : "+Math.round(rs.getDouble("squat")*(i*0.085))+"KG"+"\n");
						ta.append("\n");
						if(i>7) {
							rep--;
						}
						i++;	
					}	
				}
			}catch(SQLException e2) {
				e2.printStackTrace();
			}
			}
		});
		 
		//����Ʈ 3��
		 sbtn3.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				ta.setText("");
				String sql = "select squat from work";
			try {
				st = con.createStatement();
				rs= st.executeQuery(sql);
				while(rs.next()) {
					int rep = 5;
					int set = 1;
					int i =2;
					while(i<11) {
						ta.append("����Ʈ("+rep+"x"+set+") : "+Math.round(rs.getDouble("squat")*(i*0.095))+"KG"+"\n");
						ta.append("\n");
						if(i>7) {
							rep--;
						}
						i++;	
					}	
				}
			}catch(SQLException e2) {
				e2.printStackTrace();
			}
			}
		});
		 
//-----------------------��ġ������------------------------------
		//��ġ������ 1��
		 bbtn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				ta.setText("");
				String sql = "select Bench from work";
			try {
				st = con.createStatement();
				rs= st.executeQuery(sql);
				while(rs.next()) {
					int rep = 5;
					int set = 1;
					int i =2;
					while(i<11){			
						ta.append("��ġ������("+rep+"x"+set+") : "+Math.round(rs.getDouble("Bench")*(i*0.08))+"KG"+"\n");
						ta.append("\n");
						if(i>7) {
							rep--;
						}
						i++;	
					}
				}
			}catch(SQLException e2) {
				e2.printStackTrace();
			}
			}
		});
	
			//��ġ������ 2��
		 bbtn2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				ta.setText("");
				String sql = "select Bench from work";
			try {
				st = con.createStatement();
				rs= st.executeQuery(sql);
				while(rs.next()) {
					int rep = 5;
					int set = 1;
					int i =2;
					while(i<11) {
						ta.append("��ġ������("+rep+"x"+set+") : "+Math.round(rs.getDouble("Bench")*(i*0.085))+"KG"+"\n");
						ta.append("\n");
						if(i>7) {
							rep--;
						}
						i++;	
					}	
				}
			}catch(SQLException e2) {
				e2.printStackTrace();
			}
			}
		});
		 
		//��ġ������ 3��
		 bbtn3.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				ta.setText("");
				String sql = "select Bench from work";
			try {
				st = con.createStatement();
				rs= st.executeQuery(sql);
				while(rs.next()) {
					int rep = 5;
					int set = 1;
					int i =2;
					while(i<11) {
						ta.append("��ġ������("+rep+"x"+set+") : "+Math.round(rs.getDouble("Bench")*(i*0.095))+"KG"+"\n");
						ta.append("\n");
						if(i>7) {
							rep--;
						}
						i++;	
					}	
				}
			}catch(SQLException e2) {
				e2.printStackTrace();
			}
			}
		});
		 
//---------------------------���帮��Ʈ----------------------------------
		//���帮��Ʈ 1��
		 dbtn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				ta.setText("");
				String sql = "select Deadlift from work";
			try {
				st = con.createStatement();
				rs= st.executeQuery(sql);
				while(rs.next()) {
					int rep = 5;
					int set = 1;
					int i =2;
					while(i<11){			
						ta.append("���帮��Ʈ("+rep+"x"+set+") : "+Math.round(rs.getDouble("Deadlift")*(i*0.08))+"KG"+"\n");
						ta.append("\n");
						if(i>7) {
							rep--;
						}
						i++;	
					}
				}
			}catch(SQLException e2) {
				e2.printStackTrace();
			}
			}
		});
	
			//���帮��Ʈ 2��
		 dbtn2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				ta.setText("");
				String sql = "select Deadlift from work";
			try {
				st = con.createStatement();
				rs= st.executeQuery(sql);
				while(rs.next()) {
					int rep = 5;
					int set = 1;
					int i =2;
					while(i<11) {
						ta.append("���帮��Ʈ("+rep+"x"+set+") : "+Math.round(rs.getDouble("Deadlift")*(i*0.085))+"KG"+"\n");
						ta.append("\n");
						if(i>7) {
							rep--;
						}
						i++;	
					}	
				}
			}catch(SQLException e2) {
				e2.printStackTrace();
			}
			}
		});
		 
		//���帮��Ʈ 3��
		 dbtn3.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				ta.setText("");
				String sql = "select Deadlift from work";
			try {
				st = con.createStatement();
				rs= st.executeQuery(sql);
				while(rs.next()) {
					int rep = 5;
					int set = 1;
					int i =2;
					while(i<11) {
						ta.append("���帮��Ʈ("+rep+"x"+set+") : "+Math.round(rs.getDouble("Deadlift")*(i*0.095))+"KG"+"\n");
						ta.append("\n");
						if(i>7) {
							rep--;
						}
						i++;	
					}	
				}
			}catch(SQLException e2) {
				e2.printStackTrace();
			}
			}
		});
		 
//------------------------�������������---------------------------------
		
			//������������� 1��
			 obtn.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					ta.setText("");
					String sql = "select OverHead from work";
				try {
					st = con.createStatement();
					rs= st.executeQuery(sql);
					while(rs.next()) {
						int rep = 5;
						int set = 1;
						int i =2;
						while(i<11){			
							ta.append("�������������("+rep+"x"+set+") : "+Math.round(rs.getDouble("OverHead")*(i*0.08))+"KG"+"\n");
							ta.append("\n");
							if(i>7) {
								rep--;
							}
							i++;	
						}
					}
				}catch(SQLException e2) {
					e2.printStackTrace();
				}
				}
			});
		
				//������������� 2��
			 obtn2.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					ta.setText("");
					String sql = "select OverHead from work";
				try {
					st = con.createStatement();
					rs= st.executeQuery(sql);
					while(rs.next()) {
						int rep = 5;
						int set = 1;
						int i =2;
						while(i<11) {
							ta.append("�������������("+rep+"x"+set+") : "+Math.round(rs.getDouble("OverHead")*(i*0.085))+"KG"+"\n");
							ta.append("\n");
							if(i>7) {
								rep--;
							}
							i++;	
						}	
					}
				}catch(SQLException e2) {
					e2.printStackTrace();
				}
				}
			});
			 
			//������������� 3��
			 obtn3.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					ta.setText("");
					String sql = "select OverHead from work";
				try {
					st = con.createStatement();
					rs= st.executeQuery(sql);
					while(rs.next()) {
						int rep = 5;
						int set = 1;
						int i =2;
						while(i<11) {
							ta.append("�������������("+rep+"x"+set+") : "+Math.round(rs.getDouble("OverHead")*(i*0.095))+"KG"+"\n");
							ta.append("\n");
							if(i>7) {
								rep--;
							}
							i++;	
						}	
					}
				}catch(SQLException e2) {
					e2.printStackTrace();
				}
				}
			});

		setSize(600,600);
		setVisible(true);

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
	
	private JPanel getP1() {
		if (p1 == null) {
			p1 = new JPanel();
			p1.setBounds(88, 10, 486, 394);
			p1.setLayout(null);
			p1.add(getTa());
			p1.add(getTf0());
			p1.add(getTf1());
			p1.add(getTf2());
			p1.add(getTf3());
			p1.add(getLblNewLabel());
			p1.add(getLblNewLabel_1());
			
			JLabel lblNewLabel_2 = new JLabel("��ġ������");
			lblNewLabel_2.setBounds(12, 146, 116, 15);
			p1.add(lblNewLabel_2);
			
			JLabel lblNewLabel_3 = new JLabel("�������������");
			lblNewLabel_3.setBounds(12, 202, 116, 15);
			p1.add(lblNewLabel_3);
			
				JButton insertbtn = new JButton("�߰�");
				insertbtn.setBounds(12, 251, 76, 23);
				
				JButton viewbtn = new JButton("����");
				viewbtn.setBounds(12, 285, 76, 23);
				
				JButton updatebtn = new JButton("����");
				updatebtn.setBounds(12, 318, 76, 23);
				
				 JButton deletebtn = new JButton("����");
				 deletebtn.setBounds(12, 352, 76, 23);
				 
				 JButton ex = new JButton("����");
				 ex.setBounds(12, 375, 76, 23);
				
				 
				 
				p1.add(insertbtn);
				p1.add(viewbtn);
				p1.add(updatebtn);	
				p1.add(deletebtn);
				p1.add(ex);

				//�߰�
				insertbtn.addActionListener(new ActionListener() {//insertBtn �׼��̺�Ʈ
					@Override
					public void actionPerformed(ActionEvent e) {
						
						String sql="insert into work values(?,?,?,?)";//sql�� �ۼ�
					
						try {
							ps = con.prepareStatement(sql); //con�� ����Ŭ�� ���� ps�� sql���� ����	

								ps.setDouble(1, Double.parseDouble(tf0.getText()));
								ps.setDouble(2, Double.parseDouble(tf1.getText()));
								ps.setDouble(3, Double.parseDouble(tf2.getText()));
								ps.setDouble(4, Double.parseDouble(tf3.getText()));
								ps.executeUpdate();
								viewbtn.doClick();
						} catch (SQLException e1) {
							e1.printStackTrace();
						}
					}
				});
				 
				//����		
				 viewbtn.addActionListener(new ActionListener() {
						@Override
						public void actionPerformed(ActionEvent e) {
							ta.setText("");
							String sql = "select * from work";
						try {
							st = con.createStatement();
							rs= st.executeQuery(sql);
							while(rs.next()){
								ta.append("����Ʈ : "+rs.getInt("squat")+"\n");
								ta.append("\n");
								ta.append("���帮��Ʈ : "+rs.getInt("Deadlift")+"\n");
								ta.append("\n");
								ta.append("��ġ������ : "+rs.getInt("Bench")+"\n");
								ta.append("\n");
								ta.append("������������� : "+rs.getInt("Overhead")+"\n");
								}
						}catch(SQLException e2) {
							e2.printStackTrace();
						}
						}
					});
				 //������Ʈ
				 updatebtn.addActionListener(new ActionListener() {
						@Override
						public void actionPerformed(ActionEvent e) {
							
					        String sql = "update work set squat=?,deadlift=?,bench=?,overhead=?";
					        try {
								PreparedStatement ps = con.prepareStatement(sql);
								ps.setDouble(1, Double.parseDouble(tf0.getText()));
								ps.setDouble(2, Double.parseDouble(tf1.getText()));
								ps.setDouble(3, Double.parseDouble(tf2.getText()));
								ps.setDouble(4, Double.parseDouble(tf3.getText()));
								ps.executeUpdate();
								viewbtn.doClick();
							} catch (SQLException e1) {
								e1.printStackTrace();
							}
						}
					});
				 //����
				 deletebtn.addActionListener(new ActionListener() {
						@Override
						public void actionPerformed(ActionEvent e) {
							int result = JOptionPane.showConfirmDialog(null,"���� �����ұ��?","Confirm",JOptionPane.YES_NO_OPTION);
							if(JOptionPane.YES_OPTION==result) { //����
								try {
								st = con.createStatement();
								String sql = "Delete from work";
								st.executeUpdate(sql);
								viewbtn.doClick();
							} catch (SQLException e1) {
								e1.printStackTrace();
							}
							}
						}
					});
				 //����
				 ex.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						JOptionPane.showMessageDialog(null,"������ : ����Ʈ\n"
								+ "ȭ����: �������������\n"
								+ "������: ����� �� ����Ŵ� �\n"
								+ "�����: ���帮��Ʈ\n"
								+ "�ݿ���: ��ġ������\n"
								+ "�ָ�: �޽�");
						
					}
				});
		}
		return p1;
		
	}
	private JTextArea getTa() {
		if (ta == null) {
			ta = new JTextArea();
			ta.setBounds(140, 146, 346, 238);
		}
		return ta;
	}
	
	private JTextField getTf0() {
		if (tf0 == null) {
			tf0 = new JTextField();
			tf0.setBounds(12, 60, 116, 21);
			tf0.setColumns(10);
		}
		return tf0;
	}
	private JTextField getTf1() {
		if (tf1 == null) {
			tf1 = new JTextField();
			tf1.setBounds(12, 115, 116, 21);
			tf1.setColumns(10);
		}
		return tf1;
	}
	private JTextField getTf2() {
		if (tf2 == null) {
			tf2 = new JTextField();
			tf2.setBounds(12, 171, 116, 21);
			tf2.setColumns(10);
		}
		return tf2;
	}
	private JTextField getTf3() {
		if (tf3 == null) {
			tf3 = new JTextField();
			tf3.setBounds(12, 220, 116, 21);
			tf3.setColumns(10);
		}
		return tf3;
	}
	private JLabel getLblNewLabel() {
		if (lblNewLabel == null) {
			lblNewLabel = new JLabel("����Ʈ");
			lblNewLabel.setBounds(12, 35, 116, 15);
		}
		return lblNewLabel;
	}
	private JLabel getLblNewLabel_1() {
		if (lblNewLabel_1 == null) {
			lblNewLabel_1 = new JLabel("���帮��Ʈ");
			lblNewLabel_1.setBounds(12, 91, 116, 15);
		}
		return lblNewLabel_1;
	}
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					String a = JOptionPane.showInputDialog("�ݰ����ϴ� 531 � ���α׷� �Դϴ�.\n������ 3���߷��� �Է��ϼ���");
					int id = Integer.parseInt(a);
					if(id>200) {
					Workout1 frame = new Workout1();
					frame.setVisible(true);
					}else {
					JOptionPane.showMessageDialog(null,"3���߷� 200�̻��� �Ǿ����� ���α׷��� ������ּ���.");
					}
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

}