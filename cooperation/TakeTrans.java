package cooperation;

public class TakeTrans {

	public static void main(String[] args) {
		Student s1 =new Student("ȫ�浿",5000);
		Student s2 =new Student("�̼���",10000);
		Student s3 =new Student("Edward",30000);
		
		Bus bus  = new Bus(100);
		s1.takeBus(bus);
		s1.showInfo();
		bus.showInfo();
		System.out.println("=======================");
		Subway subway = new Subway("2ȣ��");
		s2.takeSubway(subway);
		s2.showInfo();
		subway.showInfo();
		System.out.println("=======================");
		Taxi taxi = new Taxi("����ý�");
		s3.takeTaxi(taxi);
		s3.showInfo();
		taxi.showInfo();
	}//main
}//class
