package day03;

import java.util.Scanner;

public class Exam04 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("입력 갯수 >>");
		int num1 = sc.nextInt(); //5
		System.out.println("데이터 입력 >>");
		int sum =0;
		int[] arr = new int[num1];
		for(int i=0; i<arr.length; i++) {
		arr[i] = sc.nextInt();
		sum += arr[i];
		}
		System.out.println("합계 :  "+ sum );
		for(int i=0; i<arr.length; i++) {
		System.out.println("입력 데이터 : " + arr[i]);
		}
	}//main
}//class
