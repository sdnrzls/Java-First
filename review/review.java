package review;

import java.util.Scanner;

public class review {

	public static void main(String[] args) {
		//10���� ���� �Է� �޾� �ּҰ��� �ִ밪 �׸��� �հ踦 ���Ͻÿ�
		
		Scanner sc = new Scanner(System.in);
		System.out.println("10���� ���� �Է��Ͻÿ�");
		int[] arr = new int[10];
		int sum = 0;
		for(int i =0; i<arr.length; i++) {
			arr[i] = sc.nextInt();
			sum += arr[i];
		}
		int max = arr[0];
		int min = arr[0];
		for(int i =0; i<arr.length; i++) {
			if(min>arr[i]) {
				min=arr[i];
			}
		}
		for(int i =0; i<arr.length; i++) {
			if(max<arr[i]) {
				max=arr[i];
			}
		}
		System.out.println("�հ� : " + sum);
		System.out.println("�ּҰ� : "+min);
		System.out.println("�ִ밪 :" +max);
	}

}
