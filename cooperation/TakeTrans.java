package cooperation;

public class TakeTrans {

	public static void main(String[] args) {
		Student s1 =new Student("홍길동",5000);
		Student s2 =new Student("이순신",10000);
		Student s3 =new Student("Edward",30000);
		
		Bus bus  = new Bus(100);
		s1.takeBus(bus);
		s1.showInfo();
		bus.showInfo();
		System.out.println("=======================");
		Subway subway = new Subway("2호선");
		s2.takeSubway(subway);
		s2.showInfo();
		subway.showInfo();
		System.out.println("=======================");
		Taxi taxi = new Taxi("모범택시");
		s3.takeTaxi(taxi);
		s3.showInfo();
		taxi.showInfo();
	}//main
}//class
