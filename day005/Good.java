package day05;

public class Good {
	
	String num;
	String name;
	String company;
	int price;
	double discountRate;
	
	public Good(String num, String name, String company, int price) {
		this.num = num;
		this.name =name;
		this.company = company;
		this.price = price;
	}
	public int getsellingPrice(){//�Ǹűݾ�
		return price-(int)(price*discountRate);
	}
	public void updateDiscountRate(double rate){
		discountRate = rate;
	}
	
		
	
}//class
