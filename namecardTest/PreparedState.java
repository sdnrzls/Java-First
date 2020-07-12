package com.oracle.namecardTest;

import java.sql.*; //�ڹ� sql ���̺귯��


public class PreparedState {

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

        Connection conn = null; 
        PreparedStatement pstmt = null;
        
        String query = " UPDATE NAMECARD SET company = ? WHERE NO = ?";
      
        try {
            conn = DriverManager.getConnection(URL,USER,PASS);
            
            pstmt = conn.prepareStatement(query);
            pstmt.setString(1,"daum net");
            pstmt.setInt(2,2);
            pstmt.executeUpdate();
            
            conn.commit();
            System.out.println("�����Ϸ�!");

    
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println(query);
        } finally {
            try {
                pstmt.close();	
                conn.close();
            } catch (SQLException e) {}
        }
    }

}
