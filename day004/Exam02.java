package day04;

public class Exam02 {

	public static void main(String[] args) {
		/* ������ �迭�� ��������
		 * �� ��ġ�� �����ϰ� ���ϰ�
		 *  1���� 100������ ���� �����ÿ�
		 *  ��, ���� �̹� �� ������ ���� �ʴ´�
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
		System.out.println("�ּҰ� :" +min);
	}//main
}//class
