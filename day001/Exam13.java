package day01;

import java.util.Scanner;

public class Exam13 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("첫번째 수를 입력하시오");
		int a = sc.nextInt();
		System.out.println("두번째 수를 입력하시오");
		int b = sc.nextInt();
		System.out.println("연산자를 입력하시오");
		String c = sc.next();
		
		if(c.equals("+")) {  //문자열 값이 같다: equals()사용
			System.out.println("덧셈결과 : " + (a+b)); 
			}else if(c.equals ("-")) {
			System.out.println("뺄셈결과 : " + (a-b));
			}else if(c.equals("*")) {
			System.out.println("곱셈결과 : " + (a*b));
			}else if(c.equals ("/")) {
				System.out.println("나눗셈결과 : " + (a/b));
			}else if(c.equals ("%")) {
				System.out.println("나머지결과 : " + (a%b));
			}else {
				 System.out.println("연산자 오류");
			}
		
		/*
		switch(c) {
		case "+" : System.out.println("덧셈결과 : " + (a+b));
		break;
		case "-" : System.out.println("뺄셈결과 : " + (a-b)); 
		break;
		case "*" : System.out.println("곱셈결과 : " + (a*b));
		break;
		case "/" : System.out.println("나눗셈결과 : " + (a/b));
		break;
		case "%" : System.out.println("나머지결과 : "+ (a%b) );
		break;
		default : System.out.println("연산자 오류");
		}
		*/
				
	} //main
}//class
