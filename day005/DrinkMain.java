package day05;

public class DrinkMain {

	public static void main(String[] args) {
		Drink coffee = new Drink("Ŀ��",500,3);
		coffee.getData();//Ŀ�� 500 3 1500
		Drink tea = new Drink("����",800,5);
		tea.getData(); // ���� 800 5 4000
		 System.out.println(coffee.getTotal());
		 System.out.println(tea.getTotal());
		 //�Ǹűݾ�
		 System.out.println("�� �Ǹ� �ݾ� : "+(coffee.getTotal()+tea.getTotal()));
	
		 
	}//main
}//class
