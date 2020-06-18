package day04;

public class Student {

		int StudentID;//학번
		String name;//이름
		int grade;//학년
		String address;//주소
		
		//공부하다 (행위) =>메소드(함수)
		public void study() {
			System.out.println(name + "공부하다");
		}
		public void play() {
			System.out.println(name +"운동한다");
		}
		
		public static void main(String[] args) {
			Student s1 =new Student();
			s1.StudentID=100;
			s1.name="홍길동";
			s1.grade=1;
			s1.address = "부산";
			System.out.println("s1 이름 : "+s1.name);
			System.out.println("s1 주소 :"+s1.address);
			s1.study();
			s1.play();
			
			System.out.println("======================");
			
			Student s2 =new Student();
			s2.StudentID=200;
			s2.name="이순신";
			s2.grade=4;
			s2.address = "서울";
			System.out.println("s2 이름 : "+s2.name);
			/* 이름이 강감찬 이고 3학년,인천에 사는 학생 s3을 생성하고
			 * s3의 이름과 주소를 출력하시오
			 */
			System.out.println("======================");
			Student s3 = new Student();
			s3.name = "강감찬";
			s3.address ="인천";
			System.out.println("s3 이름 : "+s3.name+ " 주소 : " + s3.address);
			s3.play();
		}
		

}//class
