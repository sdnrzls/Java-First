package day02;

import java.util.Scanner;

public class Exam06 {

	public static void main(String[] args) {
		
		int sum = 0;
		for(int i=1; i<101; i++) {
			sum +=i;  //sum = sum+i;
			if(i%10==0) {
			System.out.println((i-9)+"부터" +i+"까지의 합은"+sum+"입니다");
			sum = 0;
			}
		}
		System.out.println("==============");
		
		//학생수와 한줄에 앉을 학생 수를 입력받아 출력하시오
		Scanner sc = new Scanner(System.in);
		System.out.println("학생수를 입력>>");
		int st = sc.nextInt();
		System.out.println("한줄 인원>>");
		int line = sc.nextInt();
		for(int i=1; i<=st; i++) {
		System.out.print(i+" ");
		if(i%line==0) {
			System.out.println();
		}
		}
		int a = st/line + st%line;
		System.out.println();
		System.out.println("총 : "+a+"줄");
		// 총 몇줄인지 출력
		int raw = 0;
		if(st%line==0) {
			raw = st/line;
		}else {
			raw = (st/line)+1;
		}
		System.out.println("총 : "+raw+"줄");
		//삼항 연산자(조건연산자)
		int r = (st%line==0)? st/line : (st/line)+1;
		System.out.println("총 : "+r+"줄");
	} //main
} //class
