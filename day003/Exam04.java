package day03;

import java.util.Scanner;

public class Exam04 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("�Է� ���� >>");
		int num1 = sc.nextInt(); //5
		System.out.println("������ �Է� >>");
		int sum =0;
		int[] arr = new int[num1];
		for(int i=0; i<arr.length; i++) {
		arr[i] = sc.nextInt();
		sum += arr[i];
		}
		System.out.println("�հ� :  "+ sum );
		for(int i=0; i<arr.length; i++) {
		System.out.println("�Է� ������ : " + arr[i]);
		}
	}//main
}//class
