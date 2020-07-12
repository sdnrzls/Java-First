package com.oracle.namecardTest;

import java.sql.*; //자바 sql 라이브러리

public class Insert {
			//(oracle) jdbc:oracle:thin:@localhost:1521:xe
			//(mySQL) jdbc:mysql://localhost:3306/db이름
			//미리 입력할 오라클 주소,계정,비밀번호를 변수로 지정
		static String URL = "jdbc:oracle:thin:@127.0.0.1:1521:XE";
	    static String USER = "scott";
	    static String PASS= "1234";

	public static void main(String[] args) {
		 try {
	        	//1. 오라클 드라이버 로딩   ( ojdbc6_g.jar )    		
	            Class.forName("oracle.jdbc.driver.OracleDriver");
	        } catch (ClassNotFoundException e ) { //클래스를 못찾았을때 (드라이버 없을때 )
	            e.printStackTrace();
	        }

        Connection conn = null;  //conn은 오라클 연결을 위한 객체
        Statement stmt = null; // stmt는 sql문을 실행하기위한 객체
        String query = "INSERT INTO NAMECARD VALUES"+
        		"( CARD_NO.NEXTVAL,"+
        	    "'LALA',"+
        	   " '010-1234-5678',"+
        	    "'LALA@naver.com',"+
        	   "'Naver Com')";
      
        try { //DB 연결 부분은 try-catch 문으로 예외 발생시 처리
        	//2. DB 연결
            conn = DriverManager.getConnection(URL,USER,PASS);
            //3. SQL 문 준비
            stmt = conn.createStatement();
            //4. SQL 쿼리 실행하고 결과 받기
           stmt.executeUpdate(query);
           conn.commit();
           System.out.println("입력 완료!");
           
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                stmt.close();		//State문 닫기
                conn.close();
            } catch (SQLException e) {}
        }
    }

}
