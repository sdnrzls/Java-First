package cooperation;

public class Taxi {
	String Taxikind; //�ý�����
	int passengerCount; //�°���
	int money; //����

	public Taxi(String Taxikind) {
		
		this.Taxikind = Taxikind;
	}
	public void take(int money) {
		this.money +=money;
		passengerCount++;
	}
	public void showInfo() {
		System.out.println("�ý����� : "+ Taxikind);
		System.out.println("�°� : "+  passengerCount);
		System.out.println("���� : " + money);
	
	}
}
