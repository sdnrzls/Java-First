package cooperation;

public class Student {

	String name; //학생이름
	int grade; //학년
	int money; //학생이 가지고 있는 돈
	
	public Student(String name, int money) {
		this.name = name;
		this.money = money;
	}
	public void takeBus(Bus bus) {//버스타다
		bus.take(1000);
		this.money -= 1000;
	}
	public void takeSubway(Subway subway) {	//기차타다
		subway.take(1500);
		this.money -= 1500;
	}
	public void takeTaxi(Taxi taxi) {	//택시타다
		taxi.take(10000);
		this.money -= 10000;
	}
	public void showInfo() {
		System.out.println("학생 이름 : "+name);
		System.out.println("학생 잔액 : "+money);
	}
	
}
