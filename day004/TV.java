package day04;

public class TV {
	String tv;
	int year;
	int inch;
	public TV(String tv, int year, int inch) {
		this.tv = tv;
		this.year = year;
		this.inch = inch;
	}
	public void show() {
		System.out.println(tv+"���� ���� "+year+"��"+inch+"��ġ TV");
	}
	public static void main(String[] args) {
		
		TV tv =new TV("LG",2020,06);
		tv.show(); // LG���� ���� 2020���� 60��ġ TV
		TV mytv =new TV("�Ｚ",2019,55);
		mytv.show(); // �Ｚ���� ���� 2019���� 55��ġ TV

	}

}
