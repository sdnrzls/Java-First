package com.oracle.namecard;
//���̺� NAMECARD�� ������ ��������� �ϴ� Ŭ���� Namecard
public class Namecard {
	private int no;
    private String name;
    private String mobile;
    private String email;
    private String company;
    
    //������ �⺻
    public Namecard() {}
    //�ʵ庯�� �ʱ�ȭ ������(no����) =>dao�� insert�޼ҵ� ����
    public Namecard(String name, String mobile, 
            String email, String company) {
        this.name = name;
        this.mobile = mobile;
        this.email = email;
        this.company = company;
    }
    //�ʵ庯�� �ʱ�ȭ ������(no����)
    public Namecard(int no, String name, 
            String mobile, String email, String company) {
        this.no = no;
        this.name = name;
        this.mobile = mobile;
        this.email = email;
        this.company = company;
    }
    // ����������� getter/setter ����
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
    //toString �޼ҵ�� Ŭ������������ �Ϸķ� ���ڿ��� ����� ����
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
     // ��������� ������ ��Ƽ� �ϳ��� ���ڿ��� ����
        return sb.toString();
    }
    
}
