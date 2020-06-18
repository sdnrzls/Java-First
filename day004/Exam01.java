package day04;

import java.util.Scanner;

public class Exam01 {

	public static void main(String[] args) {
		// 10개의 수를 입력받아 최소값과 합계를 구하시오
		Scanner sc = new Scanner(System.in);
		System.out.println(" 10개수 입력 >>");
		
		int[] arr = new int[10];
		int sum = 0;
		for(int i=0; i<arr.length; i++) {
			arr[i] = sc.nextInt();
			sum += arr[i];
		}
		int min = arr[0];
		for(int i=0; i<arr.length; i++) {
			if(min>arr[i]) {
				min = arr[i];
			}
		}
		System.out.println("최소값 : " + min);
		System.out.println("합계 : "+ sum);
		
	}//main
}//class
