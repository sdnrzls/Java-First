package day05;

public class Drink {
	String  name;
	int pay;
	int ea;
	
	public Drink(String name,int pay, int ea) {
		this.name = name;
		this.pay = pay;
		this.ea = ea;
	}
	public void getData() {
		System.out.println(name+"\t"+pay+"\t"+ea+"\t"+(pay*ea));
	
	}
	public int getTotal() {
		return pay*ea;
	}
	
}
