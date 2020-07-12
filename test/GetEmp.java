package com.oreacle.test;

import java.sql.*; //자바 sql 라이브러리

public class GetEmp {

	public static void main(String[] args) {
		//(oracle) jdbc:oracle:thin:@localhost:1521:xe
		//(mySQL) jdbc:mysql://localhost:3306/db이름
		//미리 입력할 오라클 주소,계정,비밀번호를 변수로 지정
		String DB_URL = "jdbc:oracle:thin:@127.0.0.1:1521:XE";
        String DB_USER = "HR ";
        String DB_PASSWORD = "1234";

        Connection conn = null;  //conn은 오라클 연결을 위한 객체
        Statement stmt = null; // stmt는 sql문을 실행하기위한 객체
        ResultSet rs = null; // rs는 sql문 실행후 결과값을 받아오는 객체

        String query = "SELECT * FROM employees WHERE salary>12000 ";
        String query2 = "SELECT*FROM emp WHERE empno=7369";
        
        try {
        	//1. 오라클 드라이버 로딩   ( ojdbc6_g.jar )    		
            Class.forName("oracle.jdbc.driver.OracleDriver");
        } catch (ClassNotFoundException e ) { //클래스를 못찾았을때 (드라이버 없을때 )
            e.printStackTrace();
        }

        try { //DB 연결 부분은 try-catch 문으로 예외 발생시 처리
        	//2. DB 연결
            conn = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
            //3. SQL 문 준비
            stmt = conn.createStatement();
            //4. SQL 쿼리 실행하고 결과 받기
            rs = stmt.executeQuery(query);

            while (rs.next()) { // 테이블의 한 행씩 실행
                String employe_id = rs.getString(1);  // 첫번째 열
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
                rs.close(); 		//ResultSet (쿼리 결과) 닫기
                stmt.close();		//State문 닫기
                conn.close();
            } catch (SQLException e) {}
        }
        
    }

}
