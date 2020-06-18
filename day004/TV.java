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
		System.out.println(tv+"에서 만든 "+year+"형"+inch+"인치 TV");
	}
	public static void main(String[] args) {
		
		TV tv =new TV("LG",2020,06);
		tv.show(); // LG에서 만든 2020년형 60인치 TV
		TV mytv =new TV("삼성",2019,55);
		mytv.show(); // 삼성에서 만든 2019년형 55인치 TV

	}

}
