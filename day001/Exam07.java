package day01;

import java.util.Scanner;

public class Exam07 {

	public static void main(String[] args) {
		System.out.println("점수를 입력하세요");
		Scanner sc = new Scanner(System.in);
		int score = sc.nextInt();
		System.out.println("커트라인을 입력하세요");
		int pass = sc.nextInt();
		if(score >=pass ) {
			System.out.println("합격입니다");
		}else {
			System.out.println("불합격 입니다");
		}
		if(score%3==0) {
			System.out.println(score +"점은 3의 배수입니다");
		}else {
			System.out.println(score +"점은 3의 배수가 아닙니다");
		}
	}

}
