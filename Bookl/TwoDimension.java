package Bookl;

public class TwoDimension {

	public static void main(String[] args) {
	
		char[][] arr= new char[13][2];
		char ch = 'a';
		for(int i = 0; i<arr.length; i++) {
			for(int j = 0; j<arr[i].length; j++) {
				arr[i][j] = ch++;
			}
		}
		for(int i = 0; i<arr.length; i++) {
			for(int j = 0; j<arr[i].length; j++) {
				 System.out.print(arr[i][j]+"\t");
			}
				System.out.println();
		}
		


	}//main
}//class
