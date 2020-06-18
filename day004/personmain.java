package day04;

public class personmain {

	public static void main(String[] args) {
		/*person 객체 p1만들기
		 * p1이름 - 홍길동
		 * p1주소 - 부산
		 * 홍길동 공부한다
		 */
		person p1 =new person();
		p1.name = "홍길동";
		p1.ad = "부산";
		p1.study();
		
		Bank b= new Bank("김자바",5000);
		b.getmoney();
		
		Baby baby = new Baby();
		baby.name = "애기";
		baby.cry();
		Baby baby1 = new Baby("김애기");
		baby1.cry();
		
		//구구단 10단 출력
		Gugudan gugudan = new Gugudan(10);
		gugudan.viewData();
	
	}//main
}//class
