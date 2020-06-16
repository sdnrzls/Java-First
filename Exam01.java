package day02;

import java.util.Scanner;

public class Exam01 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("국어 점수를 입력 하세요");
		int kor = sc.nextInt();
		System.out.println("영어 점수를 입력 하세요");
		int eng = sc.nextInt();
		System.out.println("수학 점수를 입력 하세요");
		int math = sc.nextInt();
		
		int total = kor+eng+math;
		int ave = total/3;
		
		String grade= "";
		switch(ave/10) {
		case 10 :
		case 9 :
			grade ="A"; 
			break;
		case 8:
			grade ="B";
			break;
		case 7 :
			grade ="C"; 
			break;
		default  :
			grade ="F"; 
		}
		System.out.println("총점 : " + total);
		System.out.println("평균 : "+ ave);
		System.out.println("학점 : "+ grade);
		
		
		}//main
	}//class
