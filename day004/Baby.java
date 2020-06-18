package day04;

public class Baby {
	String name;
	int age;
 public Baby(String name) {
		this.name = name;
	}
 public Baby() {
	 
 }
public void smile() {
	 System.out.println(name +"웃는다");
 }
public void cry() {
	 System.out.println(name +"운다");
 }

public static void main(String[] args) {
	//Baby 객체 b1을 만들고
	//이름 베이비1 나이2
	//베이비 1이 웃는다
	Baby b1 = new Baby();
	b1.name = "베이비1";
	b1.age = 2;
	System.out.println("이름 :" +b1.name+" 나이 : "+b1.age);
	b1.smile();
 
	//Baby 객체 b2을 만들고
		//이름 베이비2 나이1
		//베이비 2이 운다
	Baby b2 = new Baby();
	b2.name = "베이비2";
	b2.age = 1;
	System.out.println("이름 :" +b2.name+" 나이 : "+b2.age);
	b2.cry();	
}//main
}//class
