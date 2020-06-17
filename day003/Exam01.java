package day03;

public class Exam01 {

	public static void main(String[] args) {
		//*********
		//*******
		//*****
		//***
		//*		
		for ( int i=9; i>0; i-=2) {
			for(int a=1; a<=i; a++) {
				System.out.print("*");
			} // j
		System.out.println("("+i+")");
		} // i
	
		System.out.println("=============");
		
		//형변화 캐스팅
		for ( char i='I'; i>='A'; i-=2) {
			for(char j='A'; j<=i; j++) {
				System.out.print((char)(j+1));
			} // j
		System.out.println("("+(char)(i+2)+")");
		} // i
		
		System.out.println("================");
	/*	******************************xyz
		*****************************wxyz
		*****************************vxyz
		.
		.
		.
		*abcdefg....
		*/
		
		for(char i='z'; i>='a'; i--) { // z
			for(char j='a'; j<='z'; j++) { //a..b..c..z
				if(j<i) {
					System.out.print("*");
				}else {
					System.out.print(j);
				}			
			}
			System.out.println();
		}
		System.out.println("=======================");
		
		for(int i=20; i>=0; i--) {
			for(int j=0; j<=20; j++) {
				if(j<i) {
					System.out.print("*");
				}else {
					System.out.print(j);
				}			
			}
			System.out.println();
		}
		
	}//main
}//class
