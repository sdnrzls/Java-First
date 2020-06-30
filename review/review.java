package review;

import java.util.Scanner;

public class review {

	public static void main(String[] args) {
		//10개의 수를 입력 받아 최소값과 최대값 그리고 합계를 구하시오
		
		Scanner sc = new Scanner(System.in);
		System.out.println("10개의 수를 입력하시오");
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
		System.out.println("합계 : " + sum);
		System.out.println("최소값 : "+min);
		System.out.println("최대값 :" +max);
	}

}
