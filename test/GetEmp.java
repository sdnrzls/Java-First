package com.oreacle.test;

import java.sql.*; //�ڹ� sql ���̺귯��

public class GetEmp {

	public static void main(String[] args) {
		//(oracle) jdbc:oracle:thin:@localhost:1521:xe
		//(mySQL) jdbc:mysql://localhost:3306/db�̸�
		//�̸� �Է��� ����Ŭ �ּ�,����,��й�ȣ�� ������ ����
		String DB_URL = "jdbc:oracle:thin:@127.0.0.1:1521:XE";
        String DB_USER = "HR ";
        String DB_PASSWORD = "1234";

        Connection conn = null;  //conn�� ����Ŭ ������ ���� ��ü
        Statement stmt = null; // stmt�� sql���� �����ϱ����� ��ü
        ResultSet rs = null; // rs�� sql�� ������ ������� �޾ƿ��� ��ü

        String query = "SELECT * FROM employees WHERE salary>12000 ";
        String query2 = "SELECT*FROM emp WHERE empno=7369";
        
        try {
        	//1. ����Ŭ ����̹� �ε�   ( ojdbc6_g.jar )    		
            Class.forName("oracle.jdbc.driver.OracleDriver");
        } catch (ClassNotFoundException e ) { //Ŭ������ ��ã������ (����̹� ������ )
            e.printStackTrace();
        }

        try { //DB ���� �κ��� try-catch ������ ���� �߻��� ó��
        	//2. DB ����
            conn = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
            //3. SQL �� �غ�
            stmt = conn.createStatement();
            //4. SQL ���� �����ϰ� ��� �ޱ�
            rs = stmt.executeQuery(query);

            while (rs.next()) { // ���̺��� �� �྿ ����
                String employe_id = rs.getString(1);  // ù��° ��
                String first_name = rs.getString(2);
                String Last_name = rs.getString(3);
                String email = rs.getString(4);
                String phone = rs.getString(5);
                String hire = rs.getString(6);
                String job_id= rs.getString(7);
                String salary = rs.getString(8);
                String com = rs.getString(9);
                String m_id = rs.getString(10);
                String d_id = rs.getString(11);

                System.out.println(employe_id + " : " +first_name + " : " +Last_name + " : " + email + " : " +phone+ " : " + hire + " : " + job_id+ " : " + salary + " : "+com
                		+ " : " + m_id + " : " +d_id); 
                System.out.println();
            }
            
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                rs.close(); 		//ResultSet (���� ���) �ݱ�
                stmt.close();		//State�� �ݱ�
                conn.close();
            } catch (SQLException e) {}
        }
        
    }

}
