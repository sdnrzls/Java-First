package day03;

public class Exam03 {

	public static void main(String[] args) {
		
		int[] test = new int[20]; // int 형 배열 0으로 초기화
		System.out.println(test[5]);
		for(int i =0; i<test.length; i++) {
			test[i] = i ;
		}
		System.out.println("test[5] : "+ test[5]);
		test[5] = 50000;
		System.out.println("test[5] : "+ test[5]);
		
		System.out.println("====================");
		int[] arr = new int[5];
		for(int i=0; i<arr.length; i++) {
			arr[i] = i+1;
		}
		for(int i=0; i<arr.length; i++) {
			System.out.println("arr["+i+"] : " + arr[i]);
		}
		System.out.println("====================");
		int[] arr2 = {1,2,3,4,5,6,7};
		for(int i=0; i<arr2.length; i++) {
			System.out.println("arr["+i+"] : " + arr2[i]);
		}
		System.out.println("====================");
		String[] str = {"one","two","three"};
		for(int i=0; i<str.length; i++) {
			System.out.println("str["+i+"] : " + str[i]);
		}
		
	
		
		
		/*String[] test2 = new String[5];
		test2[0]= "Good";
		System.out.println(test2[0]);
		System.out.println(test2[1]);
		*/

	}//main
}//class
