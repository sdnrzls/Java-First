package day01;

import java.util.Scanner;

public class Exam10 {

	public static void main(String[] args) {
		
	Scanner sc = new Scanner(System.in);
		System.out.println("1~99사이 정수를 입력하시오");   	
/*		int  num = sc.nextInt();
		int a =num/10;
		int b = num%10;
		if((a==3 || a==6 || a==9)&&(b==3 || b==6 || b==9)) {
			System.out.println("박수짝짝!");
		}else if((a==3 || a==6 || a==9)||(b==3 || b==6 || b==9)) {
			System.out.println("박수짝!");
		}else {
			System.out.println("박수없음");
		}
*/		
		int  num = sc.nextInt();
		int a =num/10;
		int b = num%10;
		int cnt = 0;
		if(a!=0 && a%3==0) {
		cnt++ ;  //cnt +=1;	//cnt = cnt+1;		
		}if(b!=0 && b%3==0) {
		cnt++;   // cnt +=1;	//cnt = cnt+1;
		}
		if(cnt == 2) {
			System.out.println("박수짝짝");
		}else if (cnt == 1) {
			System.out.println("박수짝");
		}else {
			System.out.println("박수없음");
		}
	
	}	
}


