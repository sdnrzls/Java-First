package cooperation;

public class Subway {

	String LineNumber; //����ö ��ȣ
	int passengerCount; //�°���
	int money; //����
	
	public Subway(String LineNumber) {
		this.LineNumber = LineNumber;
	}
	public void take(int money) {
		this.money +=money;
		passengerCount++;
	}
	
	public void showInfo() {
		System.out.println("����ö ��ȣ : " + LineNumber);
		System.out.println("�°��� : " + passengerCount);
		System.out.println("���� : " + money);
	}
}
