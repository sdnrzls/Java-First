package inheritance;

public class Buyer {
	private int money;
	private int point;
	int cnt;
	Product[] arr = new Product[10];
	//������ �ִ� ��
	public Buyer(int money) {
		this.money= money;
	}
	//�����ϱ�
	public void buy(Product p) {
		arr[cnt++] = p;
		money -=p.price;
		point +=p.bonusPoint;
		
	}
	//���� ����
	public void showInfo() {
		for(Product p : arr) {			//for(int i = 0; cnt.lenth; i++){
			if(p==null) break;			//System.out.println(arr[i]);}
			System.out.println(p);
		}
		System.out.println("�ܾ� : " + money);
		System.out.println("����Ʈ : " +point);
	}
	
	


}//class
