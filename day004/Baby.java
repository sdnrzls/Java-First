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
	 System.out.println(name +"���´�");
 }
public void cry() {
	 System.out.println(name +"���");
 }

public static void main(String[] args) {
	//Baby ��ü b1�� �����
	//�̸� ���̺�1 ����2
	//���̺� 1�� ���´�
	Baby b1 = new Baby();
	b1.name = "���̺�1";
	b1.age = 2;
	System.out.println("�̸� :" +b1.name+" ���� : "+b1.age);
	b1.smile();
 
	//Baby ��ü b2�� �����
		//�̸� ���̺�2 ����1
		//���̺� 2�� ���
	Baby b2 = new Baby();
	b2.name = "���̺�2";
	b2.age = 1;
	System.out.println("�̸� :" +b2.name+" ���� : "+b2.age);
	b2.cry();	
}//main
}//class
