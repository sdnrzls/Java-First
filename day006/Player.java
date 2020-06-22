package day06_objectArray;
//�̸�(name), �ּ�(address),
//����(age), Ű(height), ������(weight)
public class Player {
	private int age;
	private String name, address;
	private double weight, height;
	
	//������
	public Player(String name,String address,int age,double height,double weight) {
		this.name =name;
		this.address = address;
		this.age = age;
		this.height = height;
		this.weight = weight;
	}
	
	//getter
	public int getAge() {
		return age;
	}
	public String getName() {
		return name;
	}
	public String getAddress() {
		return address;
	}
	public double getHeight() {
		return height;
	}
	public double getWeight() {
		return weight;
	}

}//class


