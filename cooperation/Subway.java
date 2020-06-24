package cooperation;

public class Subway {

	String LineNumber; //ÁöÇÏÃ¶ ¹øÈ£
	int passengerCount; //½Â°´¼ö
	int money; //¼öÀÔ
	
	public Subway(String LineNumber) {
		this.LineNumber = LineNumber;
	}
	public void take(int money) {
		this.money +=money;
		passengerCount++;
	}
	
	public void showInfo() {
		System.out.println("ÁöÇÏÃ¶ ¹øÈ£ : " + LineNumber);
		System.out.println("½Â°´¼ö : " + passengerCount);
		System.out.println("¼öÀÔ : " + money);
	}
}
