package day02;

import java.util.Scanner;

public class Exam05 {

	public static void main(String[] args) {
		//입력할 갯수를 입력받아
		//그 수만큼 수를 입력받아 그 수까지의 합 구하기
		//예)5
		// 2 4 6 7 9
		Scanner sc = new Scanner(System.in);
		System.out.println("입력 갯수>>");
		int num1 = sc.nextInt();
		System.out.println("데이터 입력>>");
		int sum = 0;
		for(int i=0; i<num1; i++) {
			int inputData = sc.nextInt();
			sum +=inputData;			
		}
		System.out.println("합계 : "+sum);


	}//main
}//class
