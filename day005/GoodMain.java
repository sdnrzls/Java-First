package day05;

public class GoodMain {

	public static void main(String[] args) {
		
		Good g1 = new Good("001","����","�����",1000);
		//���� : 1000
		System.out.println(g1.name + " : " + g1.getsellingPrice());
		Good g2 = new Good("002","���","���û�",1500);
		//��� : 1500
		System.out.println(g2.name + " : " + g2.getsellingPrice());
		g2.updateDiscountRate(0.2);
		//��� : 1200
		System.out.println("��� : "+g2.getsellingPrice());
		//��������� : 0.2
		System.out.println(g2.name + "������ : "+ g2.discountRate);
	}//main
}//class
