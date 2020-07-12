package com.oracle.namecard;

import java.sql.*;
import java.util.ArrayList;
//DAO : data access object => 데이터에 접근하는 객체
//DAO 클래스를 정의하여 객체 생성시
//insert,select,update,delete 등의 DML 작업을 할수있도록
//예 : NamecardDao dao = new  NamecardDao();
//예 : dao.insert
public class NamecardDao {
    static final String URL = "jdbc:oracle:thin:@127.0.0.1:1521:XE";  //127.0.0.1 == localhost(내컴퓨터주소)
    static final String USER = "scott";
    static final String PASSWORD = "1234";
    
    //1.드라이버 로드
    public NamecardDao() {
        try { // 오라클 DB 드라이버 로드
            Class.forName("oracle.jdbc.driver.OracleDriver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
    //2.DB연결 
    private Connection getConnection() throws SQLException {
    	// DB 연결을 메소드로 만들기
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }
    		//먼저 ResultSet 이 널값이 아니면 종료, 다음 Statement 종료, 마지막으로 커넥션 종료
    private void close(ResultSet rs, PreparedStatement pstmt, Connection con) {
        if (rs != null) {
            try {
                rs.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        if (pstmt != null) {
            try {
                pstmt.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        if (con != null) {
            try {
                con.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
    
    // 입력 메소드
    public void insert(Namecard card) {
    	
        Connection con = null;
        PreparedStatement pstmt = null;
        
        String sql = "INSERT INTO namecard VALUES (CARD_NO.NEXTVAL, ?, ?, ?, ?)";

        try {
        	// DB 연결
            con = getConnection();
            pstmt = con.prepareStatement(sql);
            pstmt.setString(1, card.getName());
            pstmt.setString(2, card.getMobile());
            pstmt.setString(3, card.getEmail());
            pstmt.setString(4, card.getCompany());
            pstmt.executeUpdate();
            con.commit();
            System.out.println("입력 완료");
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println(sql);
        } finally {
            close(null, pstmt, con);
        }
    }
    
    //번호 no 행 삭제    
    public void delete(int no) {
    
    	  Connection con = null;
          PreparedStatement pstmt = null;
          
          String sql = "DELETE FROM namecard WHERE no=?";

          try {
          	// DB 연결
              con = getConnection(); 
              pstmt = con.prepareStatement(sql); //sql 준비
              pstmt.setInt(1,no);
              pstmt.executeUpdate(); //sql 실행
              con.commit(); // 데이터저장
              System.out.println("삭제 완료");
          } catch (SQLException e) {
              e.printStackTrace();
              System.out.println(sql);
          } finally {
              close(null, pstmt, con);
          }
    }
    
    //번호 no 행 검색
    public Namecard selectOne(int no) {
    	 Connection con = null;
         PreparedStatement pstmt = null;
         ResultSet rs = null; 
         Namecard card = null; //Namecard class 객체
         String sql = "SELECT * FROM namecard WHERE no=?";

         try {
         	// DB 연결
             con = getConnection(); 
             pstmt = con.prepareStatement(sql); //sql 준비
             pstmt.setInt(1,no);
             //pstmt.executeUpdate(); //결과값이 없을경우
             rs = pstmt.executeQuery(); //sql 실행(결과값 있을때)
             
             if(rs.next()) {
            	 card = new Namecard();
            	 card.setNo(rs.getInt("NO"));
            	 card.setName(rs.getString("NAME"));
            	 card.setMobile(rs.getString("MOBILE"));
            	 card.setEmail(rs.getString("EMAIL"));
            	 card.setCompany(rs.getString("COMPANY"));
            	 return card;
             }          
         } catch (SQLException e) {
             e.printStackTrace();
             System.out.println(sql);
         } finally {
             close(rs, pstmt, con);
         }
        return null; // 만약에 에러 발생시 리턴됨
    }
    
    //이름으로 찾기
    public ArrayList<Namecard> selectByKeyword(String keyword) {       
        ArrayList<Namecard> matched = new ArrayList<Namecard>();
        Connection con = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null; 
        Namecard card = null; //Namecard class 객체
        String sql = "SELECT * FROM namecard WHERE  NAME = ?";

        try {
        	// DB 연결
            con = getConnection(); 
            pstmt = con.prepareStatement(sql); //sql 준비
            pstmt.setString(1,keyword);
            //pstmt.executeUpdate(); //결과값이 없을경우
            rs = pstmt.executeQuery(); //sql 실행(결과값 있을때)
            
            while(rs.next()) {
           	 card = new Namecard();
           	 card.setNo(rs.getInt("NO"));
           	 card.setName(rs.getString("NAME"));
           	 card.setMobile(rs.getString("MOBILE"));
           	 card.setEmail(rs.getString("EMAIL"));
           	 card.setCompany(rs.getString("COMPANY"));
           	 matched.add(card);
           	 }
            return matched;
	        } catch (SQLException e) {
	            e.printStackTrace();
	            System.out.println(sql);
	        } finally {
	            close(rs, pstmt, con);
	        }
	       return null; // 만약에 에러 발생시 리턴됨
	   }
     
    
    //Namecard의 모든 행/열을 가져오기 번호순으로 
    public ArrayList<Namecard> selectAll() {
        ArrayList<Namecard> all = new ArrayList<Namecard>();
        Connection con = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null; 
        Namecard card = null; //Namecard class 객체
        String sql = "SELECT * FROM namecard ORDER BY 1";

        try {
        	// DB 연결
            con = getConnection(); 
            pstmt = con.prepareStatement(sql); //sql 준비
            //pstmt.executeUpdate(); //결과값이 없을경우
            rs = pstmt.executeQuery(); //sql 실행(결과값 있을때)
            while(rs.next()) {
           	 card = new Namecard();
           	 card.setNo(rs.getInt("NO"));
           	 card.setName(rs.getString("NAME"));
           	 card.setMobile(rs.getString("MOBILE"));
           	 card.setEmail(rs.getString("EMAIL"));
           	 card.setCompany(rs.getString("COMPANY"));
           	 all.add(card);
            }
            return all;
	        } catch (SQLException e) {
	            e.printStackTrace();
	            System.out.println(sql);
	        } finally {
	            close(rs, pstmt, con);
	        }
	       return null; // 만약에 에러 발생시 리턴됨
	   }
	       
    
    //수정하기
    public void update(Namecard card) {
    	 Connection con = null;
         PreparedStatement pstmt = null;
         
         String sql = "UPDATE namecard SET  NAME = ?,MOBILE=?,"
         		+ "EMAIL=?,COMPANY=? WHERE NO = ? ";

         try {
         	// DB 연결
             con = getConnection();
             pstmt = con.prepareStatement(sql);
             pstmt.setString(1, card.getName());
             pstmt.setString(2, card.getMobile());
             pstmt.setString(3, card.getEmail());
             pstmt.setString(4, card.getCompany());
             pstmt.setInt(5, card.getNo());
             pstmt.executeUpdate();
             con.commit();
             System.out.println("수정 완료");
         } catch (SQLException e) {
             e.printStackTrace();
             System.out.println(sql);
         } finally {
             close(null, pstmt, con);
         }
 	   }


} //class
