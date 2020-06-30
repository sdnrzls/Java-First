package review;

import java.util.Scanner;

public class review03 {

	public static void main(String[] args) {
		
		//구구단
		for(int a=2; a<10; a++) {
			for(int b=1; b<10; b++) {
				System.out.println(a+"*"+b+"="+a*b);
			}
			System.out.println();
		}
		
		System.out.println("============");
		//구구단 세로 홀수만
		for(int c=1; c<10; c++) {
			for(int d=3; d<=7; d++) {
				if(d%2==1) {
					System.out.print(d+"*"+c+"="+d*c+"  \t");
				}
			}
			System.out.println();
		}

		//123456789
		//1234567
		//12345
		System.out.println("=============");
		for(int num=9; num>0; num--) {
			for(int num2=1; num2<=num; num2++) {
				System.out.print(num2);
			}
			System.out.println();
		}
		
		//switch문을 이용하여 성적점수 
		
		Scanner sc = new Scanner(System.in);
		System.out.println("국어 점수 입력 >>");
		int kor = sc.nextInt();
		System.out.println("영어 점수 입력 >>");
		int eng = sc.nextInt();
		System.out.println("수학 점수 입력 >>");
		int math = sc.nextInt();
		
		int total = kor+eng+math;
		int ave = total/3;
		
		String grade = "";
		switch(ave/10) {
		case 10 :
		case 9 : grade="A";
		break;
		case 8 :  grade="B";
		break;
		case 7 :  grade="C";
		break;
		default :  grade="F";
		}
		System.out.println("총점 :  "+ total);
		System.out.println("평균 :  "+ ave);
		System.out.println("학점 : "+ grade);
		
		System.out.println("=============");
		
		//지폐 단위 구분
		System.out.println("금액을 입력하시오");
		int money = sc.nextInt();
		int cash1 = money/10000;
		System.out.println("만원 권 : "+cash1);
		money = money%10000;
		int cash2 = money/1000;
		System.out.println("천원 권 : "+cash2);
	
	
	
	
	
	
	} //main
} //class
