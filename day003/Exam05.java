package day03;

import java.util.Scanner;

public class Exam05 {

	public static void main(String[] args) {
		//�ִ밪
		//�ִ밪 ��ġ
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
		System.out.println("�ִ밪 : "+ max);
		System.out.println("�ִ밪��ġ : " +maxpos );
		System.out.println("�迭�� �հ� : "+ sum);
		System.out.println("�迭�� ��� : " +(float)sum/data.length );
		System.out.println("================");
		//ã�� �� �Է� 
		//ã�¼� ��ġ or ã�¼��� �����ϴ�.			
		System.out.println("ã�� �� �Է� >>");
		Scanner sc = new Scanner(System.in);	
		int search= sc.nextInt();
		boolean flag = false;
		for(int i=0; i<data.length; i++) {
			if(search==data[i]) {
				System.out.println("ã�¼� "+ search+ " �� "+(i+1)+"��° �ֽ��ϴ�");			
				flag =true;
			} 				
			
		} if(flag==false) {
			System.out.println("ã�¼� "+search+" �� �����ϴ�");
		}
		

	}//main
}//class
