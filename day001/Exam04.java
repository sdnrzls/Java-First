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
		
		float f = 5.0f; //4����Ʈ int< float
		int num = 10;//4����Ʈ
		f=num; // float = int ����ȯ(ĳ����) <- �ڵ��� ��ȯ
		System.out.println("f:"+f);
		num = (int) f; // int <- float ����ȯ (ĳ����) �� ����� �� ��ȯ
		long num1 = 100L;
		
		f= num1; // float = long
		double area = c*c*PI;
		System.out.println("������;"+ area);
		
	}
}
