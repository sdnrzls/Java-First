package day02;

public class Exam08 {

	public static void main(String[] args) {
		//1부터 10까지 홀수의 합을 구하시오
		int sum = 0;
		for(int i=1; i<11; i++) {
			if(i%2==1) {
			sum += i;
		}
		}
		System.out.println("결과 : " + sum);
		System.out.println("========");
		int hap = 0;
		for(int i=1; i<11; i++) {
			if(i%2!=1) continue; //조건이 맞을경우 한번더 반복
			hap+=i;
		}
		System.out.println("continue 결과 :" + hap);
		System.out.println("========");
		int h = 0;
		for(int i=1; i<11; i++) {
			if(i%2!=1) break; //조건이 맞을경우 반복문 끝
			h+=i;
			System.out.println("break 결과 :" + h);
			System.out.println("========");
		}
		
		
	}//main
}//class
