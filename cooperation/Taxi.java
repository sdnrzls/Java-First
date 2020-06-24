package cooperation;

public class Taxi {
	String Taxikind; //ÅÃ½ÃÁ¾·ù
	int passengerCount; //½Â°´¼ö
	int money; //¼öÀÔ

	public Taxi(String Taxikind) {
		
		this.Taxikind = Taxikind;
	}
	public void take(int money) {
		this.money +=money;
		passengerCount++;
	}
	public void showInfo() {
		System.out.println("ÅÃ½ÃÁ¾·ù : "+ Taxikind);
		System.out.println("½Â°´ : "+  passengerCount);
		System.out.println("¼öÀÔ : " + money);
	
	}
}
