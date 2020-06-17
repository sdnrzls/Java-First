package day03;

public class Exam06 {
	/*
	 * 크기가 10인 배열을 만들고
	 * 0에서 50사이 난수를 발생하여
	 * 0이 아닌 값을 배열에 넣으세요
	 * 중복허용 
	 */
	
	public static void main(String[] args) {
		int arr[] = new int[10];
		for(int n =0; n<arr.length; n++) { //배열 크기 10번 반복
		int r =(int)(Math.random()*50);  //난수발생
		if(r==0) { //난수가 0인지판단
			continue;
			}
		arr[n] = r;
		}
		
		for(int i=0; i<arr.length; i++) {
		System.out.print(arr[i]+"\t");
		}
		
		System.out.println("======================");
		
		for(int i : arr) { //for-each = for
			System.out.print(i+"\t");
		}
		
		System.out.println("======================");
		
		String[] str = {"one","two","three","four"};
		for(String s :str) {//for-each
			System.out.println(s);
		}
		
		
		}//main
}//class
