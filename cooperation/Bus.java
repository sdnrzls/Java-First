package cooperation;

public class Bus {
	int busNumber; //¹ö½º¹øÈ£
	int passengerCount; //½Â°´¼ö
	int money; //¼öÀÔ

	public Bus(int busNumber) {
		this.busNumber = busNumber;
	}
	public void take(int money) {
		this.money +=money;
		passengerCount++;
	}
	public void showInfo() {
		System.out.println("¹ö½º : "+ busNumber);
		System.out.println("½Â°´ : "+  passengerCount);
		System.out.println("¼öÀÔ : " + money);
	
	}
}
