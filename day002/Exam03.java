package day02;

import java.util.Scanner;

public class Exam03 {

	public static void main(String[] args) {
		
		for(int i =1; i<6; i++) { 
		System.out.println(i+" : 안녕하세요");
		}
		
		System.out.println("==================");
		for(int i=5; i>0; i--) {
			System.out.println(i+" : 안녕하세요");
		}
		System.out.println("==================");
		for(int i=1; i<10; i++) {
			System.out.println("2*"+i+"="+2*i);
		}
		System.out.println("==================");
		for(int i=1; i<11; i++) {
			if(i%2==0) {
				System.out.println(i+" : 짝수입니다");
			}
		}
		System.out.println("==================");
		for(int i=2; i<11; i+=2) {
			System.out.println(i+ " : 짝수입니다");
		}
		System.out.println("==================");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("단을 입력 하시오");
		int a = sc.nextInt();
		for(int i=1; i<10; i++) {
				System.out.println(a+"*"+i+"="+a*i);
		}
		
	}//main
}//class
