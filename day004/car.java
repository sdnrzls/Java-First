package day04;

public class car {
	String carKind;
	String carColor;
	 int speed;
	 
	 //생성자
	 
	 //디폴트 생성자 => 생략가능하지만 다른 생성자가 있을때는 생략 불가능
	 //오버로딩
	 public car() {
		 System.out.println("디폴트생성자");
	 }
	 
	 public  car(String carColor, String carKind) {
		 this.carColor = carColor;
		 this.carKind = carKind;
		 System.out.println("인자있는 생성자");
	 }
	
	public  void speedUp(int s) {
		speed += s;
	}
	public  void speeddown(int s) {
		this.speed -= s;
	}
	public  void stop() {
		speed=0;
	}
	public static void main(String[] args) {
		car mycar =new car();
		mycar.carKind ="소나타";
		mycar.carColor ="흰색";
		mycar.speedUp(100);
		System.out.println(mycar.carKind+" 속도 : "+mycar.speed);
		System.out.println(mycar.carKind+" color : "+mycar.carColor );
		mycar.stop();
		System.out.println(mycar.carKind+" 속도 : "+mycar.speed);
	
		/*c1 객체를 만들어서
		검은색 뉴카 라는 차를 만들고 
		speed Up(80), 속도출력
		speed Down(50), 속도출력
		 */
		
	car c1 =new car();
	c1.carColor = "검은색";
	c1.carKind  = "뉴카";
	c1.speedUp(80);
	System.out.println( c1.carKind +" 속도 : " + c1.speed);
	c1.speeddown(50);
	System.out.println(c1.carKind+" 속도 : "+ c1.speed);
	System.out.println(c1);
	System.out.println(mycar);
	
	//생성자 -> 멤버 변수 초기화
	
	car c2 = new car("분홍색","내차");
	System.out.println(c2.carColor);
	
	}//main
}//class
