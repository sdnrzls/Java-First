package day04;

public class Bank  {
	String name;//이름 멤버변수 (전역변수)
	int money;//잔액
	public Bank() {
		
	}
	public Bank(String name, int money) {
		this.name = name;
		this.money = money;
	}
	//입금
	public void inputmoney(int don) {//don 지역변수
		money+=don; //money=money+don;
	}
	//출금
	public void outputmoney(int don) {
		if(money>=don) {
			money -=don; //money= money-don;
		}else {
			System.out.println(name+"님의 잔액이 부족합니다");
		}
	}
	//잔액확인
	public void getmoney() {
			System.out.println(name+"님의 잔액 " +money+"원 입니다");
	}
	public static void main (String[]args) {
		//Bank 객체 b1을 만들고
		//b1 의 이름은 홍길동
		//홍길동이 5000원을 입금하고 잔액을 확인 함
		//홍길동님의 잔액은 5000원 입니다.
		//홍길동이 3000원 출금하고 잔액확인
		//홍길동님의 잔액은 2000원 입니다
		//b2의 이름 이순신
		//이순신 고객이 10000원 입금
		//잔액 확인
		//이순신 고객이 20000원 출금
		//잔액확인
		//잔액 부족시 잔액 부족
		Bank b1 = new Bank();
		b1.name = "홍길동";
		b1.inputmoney(5000);
		b1.getmoney();
		b1.outputmoney(3000);
		b1.getmoney();
		
		Bank b2 = new Bank();
		b2.name = "이순신";
		b2.inputmoney(10000);
		b2.getmoney();
		b2.outputmoney(20000);
		b2.getmoney();
		
		Bank b3 =new Bank("강감찬",20000);
		b3.getmoney();
	}//main	
}//class
