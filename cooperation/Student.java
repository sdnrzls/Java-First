package cooperation;

public class Student {

	String name; //�л��̸�
	int grade; //�г�
	int money; //�л��� ������ �ִ� ��
	
	public Student(String name, int money) {
		this.name = name;
		this.money = money;
	}
	public void takeBus(Bus bus) {//����Ÿ��
		bus.take(1000);
		this.money -= 1000;
	}
	public void takeSubway(Subway subway) {	//����Ÿ��
		subway.take(1500);
		this.money -= 1500;
	}
	public void takeTaxi(Taxi taxi) {	//�ý�Ÿ��
		taxi.take(10000);
		this.money -= 10000;
	}
	public void showInfo() {
		System.out.println("�л� �̸� : "+name);
		System.out.println("�л� �ܾ� : "+money);
	}
	
}
