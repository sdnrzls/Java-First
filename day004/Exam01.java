package day04;

import java.util.Scanner;

public class Exam01 {

	public static void main(String[] args) {
		// 10���� ���� �Է¹޾� �ּҰ��� �հ踦 ���Ͻÿ�
		Scanner sc = new Scanner(System.in);
		System.out.println(" 10���� �Է� >>");
		
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
		System.out.println("�ּҰ� : " + min);
		System.out.println("�հ� : "+ sum);
		
	}//main
}//class
