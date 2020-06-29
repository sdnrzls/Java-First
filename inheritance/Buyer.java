package inheritance;

public class Buyer {
	private int money;
	private int point;
	int cnt;
	Product[] arr = new Product[10];
	//가지고 있는 돈
	public Buyer(int money) {
		this.money= money;
	}
	//구매하기
	public void buy(Product p) {
		arr[cnt++] = p;
		money -=p.price;
		point +=p.bonusPoint;
		
	}
	//구매 내역
	public void showInfo() {
		for(Product p : arr) {			//for(int i = 0; cnt.lenth; i++){
			if(p==null) break;			//System.out.println(arr[i]);}
			System.out.println(p);
		}
		System.out.println("잔액 : " + money);
		System.out.println("포인트 : " +point);
	}
	
	


}//class
