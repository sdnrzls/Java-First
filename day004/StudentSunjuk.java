package day04;

public class StudentSunjuk {
	String name;
	int kor;
	int eng;
	int math;
	
	public StudentSunjuk(String name,int kor,int eng,int math) {
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
	
	public void getTotal() {
		System.out.println(name+" �� ������ "+(kor+eng+math)+"�Դϴ�");
	}
	public String getAvg() {
		return name + "��� : " + (kor+eng+math)/3;
	}
	
}//class
