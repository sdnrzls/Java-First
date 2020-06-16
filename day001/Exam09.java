package day01;

import java.util.Scanner;

public class Exam09 {

	public static void main(String[] args) {
		
	/*	Scanner sc = new Scanner(System.in);
		System.out.println("두가지 수를 입력 하시오");
		int a = sc.nextInt();
		int b = sc.nextInt();
		if(a>b) {
			System.out.println("큰수의 값 : " + a );
			System.out.println("작은수의 값 : "+b );
			System.out.println("두수의 차 : " + (a-b) );
		}else if(b>a){
			System.out.println("큰수의 값 : " + b);
			System.out.println("작은수의 값 : "+a );
			System.out.println("두수의 차 : " + (b-a) );
		}else {
			System.out.println("값이 동일합니다");
			System.out.println("두수의 차 : "  + (a-b));
		}
	*/
			Scanner sc = new Scanner(System.in);
			System.out.println("첫번째 수 입력 >>");
			int max = sc.nextInt();
			System.out.println("두번째 수 입력 >>");
			int min = sc.nextInt();
			if(min> max) {
				int tmp = max; 	// int tmp = min
				max = min;			// min = max
				min = tmp;			// max = tmp
			}
			System.out.println("큰수의 값 : " + max);
			System.out.println("작은수의 값 : "+ min);
			System.out.println("두수의 차 : " + (max-min) );
			
	}

}
