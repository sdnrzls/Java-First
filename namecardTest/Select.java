package com.oracle.namecardTest;

import java.sql.*; //�ڹ� sql ���̺귯��

public class Select {

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
        ResultSet rs = null; // rs�� sql�� ������ ������� �޾ƿ��� ��ü
        String query = "SELECT*FROM NAMECARD ORDER BY NO";
      
        try { //DB ���� �κ��� try-catch ������ ���� �߻��� ó��
        	//2. DB ����
            conn = DriverManager.getConnection(URL,USER,PASS);
            //3. SQL �� �غ�
            stmt = conn.createStatement();
            //4. SQL ���� �����ϰ� ��� �ޱ�
           stmt.executeUpdate(query);
           rs = stmt.executeQuery(query);

           while (rs.next()) { // ���̺��� �� �྿ ����
               int no = rs.getInt("NO");  // ù��° ��
               String name = rs.getString("name");
               String mobile = rs.getString("mobile");
               String email = rs.getString("email");
               String company = rs.getString("company");
               System.out.println(no + " / " + name + " / " + mobile + " / " + email + " / " + company ); 
           }
           
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
            	rs.close();
                stmt.close();		//State�� �ݱ�
                conn.close();
            } catch (SQLException e) {}
        }
    }

}
