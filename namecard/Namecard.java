package com.oracle.namecard;
//테이블 NAMECARD의 열들을 멤버변수로 하는 클래스 Namecard
public class Namecard {
	private int no;
    private String name;
    private String mobile;
    private String email;
    private String company;
    
    //생성자 기본
    public Namecard() {}
    //필드변수 초기화 생성자(no없음) =>dao의 insert메소드 참고
    public Namecard(String name, String mobile, 
            String email, String company) {
        this.name = name;
        this.mobile = mobile;
        this.email = email;
        this.company = company;
    }
    //필드변수 초기화 생성자(no있음)
    public Namecard(int no, String name, 
            String mobile, String email, String company) {
        this.no = no;
        this.name = name;
        this.mobile = mobile;
        this.email = email;
        this.company = company;
    }
    // 멤버변수들을 getter/setter 세팅
    public int getNo() {
        return no;
    }
    public void setNo(int no) {
        this.no = no;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getMobile() {
        return mobile;
    }
    public void setMobile(String mobile) {
        this.mobile = mobile;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getCompany() {
        return company;
    }
    public void setCompany(String company) {
        this.company = company;
    }
    //toString 메소드는 클래스변수들을 일렬로 문자열로 만들어 리턴
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[NO: ");
        sb.append(no);
        sb.append("] ");
        sb.append(name);
        sb.append(" ,Mobile: ");
        sb.append(mobile);
        sb.append(" ,Email: ");
        sb.append(email);
        sb.append(" ,Company: ");
        sb.append(company);
     // 멤버변수의 값들을 모아서 하나의 문자열로 리턴
        return sb.toString();
    }
    
}
