package day03;

public class Exam07 {

	public static void main(String[] args) {
	
		int[][] arr = new int [3][4];
		arr[0][0] =1;
		arr[0][1] =2;
		int [][] a = {
				{1,2,3},
				{11,22,33},
				{111,222,333}
		};
		System.out.println(a[1][2]);
		for(int i=0; i<a.length; i++) { // {{1,2,3},{11,22,33},{111,222,333}};�� ��ȣ�� ����
			for(int j=0; j<a[i].length; j++) { //{{1,2,3},{11,22,33},{111,222,333}};�� ��ȣ �� �� ����
				System.out.print(a[i][j]+"\t");
			}
			System.out.println();
		}
		
	}//main
}//class
