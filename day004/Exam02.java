package day04;

public class Exam02 {

	public static void main(String[] args) {
		/* 난수를 배열에 넣으세요
		 * 들어갈 위치를 랜덤하게 정하고
		 *  1부터 100이하의 수를 넣으시오
		 *  단, 값이 이미 들어가 있으면 넣지 않는다
		 */
		int[] arr = new int[10];
		int min = arr[0];
		for(int i=0; i<arr.length; i++) {
			arr[i] =(int)(Math.random()*10);
			System.out.print(arr[i]+"/t");
		}
		System.out.println();
		for(int i=0; i<arr.length; i++) {
			if(min>arr[i]) {
				min = arr[i];
			}
		}
		System.out.println("최소값 :" +min);
	}//main
}//class
