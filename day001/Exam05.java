package day01;

public class Exam05 {

	public static void main(String[] args) {
	
		int a =49;
		if(a%2 == 0) {
			System.out.println(a+" : 짝수");
		}else{
			System.out.println(a+" : 홀수");
		}
		
		//다중 if
		int b = 252;
		if(b<0) {
			System.out.println("0미만");
		}else if(b<100) {
			System.out.println("0에서 99사이 수");
		}else if(b<200) {
			System.out.println("100에서 199사이 수 ");
		}else if(b<300) {
			System.out.println("200에서 299 사이 수");
		}else {
			System.out.println("300 이상 수");
		}
		
		int c =  5;
		if(c < 0) {
			System.out.println("0미만");
		}
		 if(c>=0 && c<100) { //c는 0보다 크고 100보다 작다 c>0 && c< 100
			System.out.println("0에서 99 사이수 ");
		}
		 if(c>=100&&c<200 ) {
			 System.out.println("100에서 199 사이 수");
		 }
		 if(c>=200&&c<300) {
			 System.out.println("200에서 299 사이 수");
		 }
		 if(c>=300) {
			 System.out.println("300 이상의 수");
		 }
		
		int su = 51;
		if(su>0&&su%2==0) {
			System.out.println("su는 0보다 크고 짝수");
		}else if(su==0) {
			System.out.println("su는 0이다");
		}else if (su>0&&su%2==1) {// !0→부정문 
			System.out.println("su는 0보다 크고 홀수");
		}
		 
		}
}
