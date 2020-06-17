package day03;

import java.util.Scanner;

public class Exam05 {

	public static void main(String[] args) {
		//최대값
		//최대값 위치
		int[] data = {10,5,90,100,250,30,77};	
		
		int max = data[0];
		int maxpos =0;
		int sum = 0;	
		for(int i=0; i<data.length; i++) {
			sum += data[i];
			if(max < data[i]) {
				max = data[i];
				maxpos = i+1;	
			}
		}
		System.out.println("최대값 : "+ max);
		System.out.println("최대값위치 : " +maxpos );
		System.out.println("배열의 합계 : "+ sum);
		System.out.println("배열의 평균 : " +(float)sum/data.length );
		System.out.println("================");
		//찾는 수 입력 
		//찾는수 위치 or 찾는수가 없습니다.			
		System.out.println("찾는 수 입력 >>");
		Scanner sc = new Scanner(System.in);	
		int search= sc.nextInt();
		boolean flag = false;
		for(int i=0; i<data.length; i++) {
			if(search==data[i]) {
				System.out.println("찾는수 "+ search+ " 는 "+(i+1)+"번째 있습니다");			
				flag =true;
			} 				
			
		} if(flag==false) {
			System.out.println("찾는수 "+search+" 는 없습니다");
		}
		

	}//main
}//class
