package day06_objectArray;

public class ShiftArray {
	private static void shiftArray(int[][] arr) { //������ �迭�� ����� �� �迭�� arr�� ������ �� ���� �ִ´�,//arr�� �ε����� 2 �� 1�� ���� �ִ´�,//arr�� �ε����� 1�� 0�� ���� �ִ´�,//arr�� �ε����� 0�� ��ġ�� ó�� ���� ������ �迭�� �ִ´�
			int[] tmp= arr[arr.length-1];	//	
			
			for(int i =arr.length-2; i>=0; i--) {//1 0
				arr[i+1]=arr[i]	;	//arr[2]=arr[1], arr[1]=arr[0]
				}
			arr[0] =tmp;
		}
	private static void showArray(int[][] arr) {
		for(int i =0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
			System.out.print(arr[i][j]+"\t");
			}
			System.out.println();
			}
		}
	public static void main(String[] args) {
		int[][] arr= {{1,2,3},{4,5,6},{7,8,9}};
		System.out.println("1�� shift......");
		ShiftArray.shiftArray(arr);
		ShiftArray.showArray(arr);
		System.out.println("2�� shift......");
		ShiftArray.shiftArray(arr);
		ShiftArray.showArray(arr);
		
	}//main



	
}//class
