package com.oracle.namecardTest;

import java.sql.*; //�ڹ� sql ���̺귯��

public class Insert {
			//(oracle) jdbc:oracle:thin:@localhost:1521:xe
			//(mySQL) jdbc:mysql://localhost:3306/db�̸�
			//�̸� �Է��� ����Ŭ �ּ�,����,��й�ȣ�� ������ ����
		static String URL = "jdbc:oracle:thin:@127.0.0.1:1521:XE";
	    static String USER = "scott";
	    static String PASS= "1234";

	public static void main(String[] args) {
		 try {
	        	//1. ����Ŭ ����̹� �ε�   ( ojdbc6_g.jar )    		
	            Class.forName("oracle.jdbc.driver.OracleDriver");
	        } catch (ClassNotFoundException e ) { //Ŭ������ ��ã������ (����̹� ������ )
	            e.printStackTrace();
	        }

        Connection conn = null;  //conn�� ����Ŭ ������ ���� ��ü
        Statement stmt = null; // stmt�� sql���� �����ϱ����� ��ü
        String query = "INSERT INTO NAMECARD VALUES"+
        		"( CARD_NO.NEXTVAL,"+
        	    "'LALA',"+
        	   " '010-1234-5678',"+
        	    "'LALA@naver.com',"+
        	   "'Naver Com')";
      
        try { //DB ���� �κ��� try-catch ������ ���� �߻��� ó��
        	//2. DB ����
            conn = DriverManager.getConnection(URL,USER,PASS);
            //3. SQL �� �غ�
            stmt = conn.createStatement();
            //4. SQL ���� �����ϰ� ��� �ޱ�
           stmt.executeUpdate(query);
           conn.commit();
           System.out.println("�Է� �Ϸ�!");
           
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                stmt.close();		//State�� �ݱ�
                conn.close();
            } catch (SQLException e) {}
        }
    }

}
