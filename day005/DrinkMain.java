package day05;

public class DrinkMain {

	public static void main(String[] args) {
		Drink coffee = new Drink("커피",500,3);
		coffee.getData();//커피 500 3 1500
		Drink tea = new Drink("녹차",800,5);
		tea.getData(); // 녹차 800 5 4000
		 System.out.println(coffee.getTotal());
		 System.out.println(tea.getTotal());
		 //판매금액
		 System.out.println("총 판매 금액 : "+(coffee.getTotal()+tea.getTotal()));
	
		 
	}//main
}//class
