package day01;

import java.util.Scanner;

public class Exam08 {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		System.out.println("이름을 입력하세요");
		String name = sc.next();
		System.out.println("국어점수를 입력하세요");
		int K  = sc.nextInt();
		System.out.println("영어점수를 입력하세요");
		int E  = sc.nextInt();
		System.out.println("수학점수를 입력하세요");
		int M  = sc.nextInt();
	
		int T = K+E+M;
		int A = T/3;
		System.out.println("이름 :  "+name+" 총점 : "+T+" 평균 : "+A);
		String grade= "";
		if(A>=90) {
			grade="A학점";
		}else if(A>=80) {
			grade="B학점";
		}else if(A>=70) {
			grade="C학점";
		}else {
			grade="F학점";
		}
		System.out.println(grade);

	}

}
