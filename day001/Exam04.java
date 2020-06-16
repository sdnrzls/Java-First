package day01;

public class Exam04 {

	public static void main(String[] args) {
		double a = Math.pow(5, 2);
		final double b = Math.PI;
		System.out.println(a*b);

		int c = 5;
		System.out.println(c*c*3.14);
		final double PI = 3.14;
		System.out.println(c*c*PI);
		
		float f = 5.0f; //4바이트 int< float
		int num = 10;//4바이트
		f=num; // float = int 형변환(캐스팅) <- 자동형 변환
		System.out.println("f:"+f);
		num = (int) f; // int <- float 형변환 (캐스팅) ← 명시적 형 변환
		long num1 = 100L;
		
		f= num1; // float = long
		double area = c*c*PI;
		System.out.println("원넓이;"+ area);
		
	}
}
