package review;

import java.util.Scanner;

public class review01 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		/*System.out.println("나이를 입력 해 주세요");
		int a = sc.nextInt();
		
		if(a>=20) {
			System.out.println(a+"세 입니다 입장 가능");
		}else if(a>=15) {
			System.out.println(a+"세 입니다 부모님과 입장 가능");
		}else {
			System.out.println("입장 불가능 입니다.");
		}
		*/
		
		System.out.println("학번을 입력해 주세요");
		int num1 = sc.nextInt();
		int a = num1/10;
		int b = num1&10;
		System.out.println("이름을 입력해 주세요");
		String name = sc.next();
		System.out.println("자바 점수를 입력해 주세요");
		int java = sc.nextInt();
		System.out.println("UI점수를 입력해 주세요");
		int ui = sc.nextInt();
		System.out.println("영어 점수를 입력해 주세요");
		int eng = sc.nextInt();
		int total = java+ui+eng;
		int aver = total/3;
		
		if(a==0) {
			System.out.println("1학년 : "+name);
			System.out.println("총점: "+total+"평균 : "+aver);
		}else{
			System.out.println("2학년 : "+name);
			System.out.println("총점: "+total+"평균 : "+aver);
		}
		
	}//main
}//class
