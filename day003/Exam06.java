package day03;

public class Exam06 {
	/*
	 * ũ�Ⱑ 10�� �迭�� �����
	 * 0���� 50���� ������ �߻��Ͽ�
	 * 0�� �ƴ� ���� �迭�� ��������
	 * �ߺ���� 
	 */
	
	public static void main(String[] args) {
		int arr[] = new int[10];
		for(int n =0; n<arr.length; n++) { //�迭 ũ�� 10�� �ݺ�
		int r =(int)(Math.random()*50);  //�����߻�
		if(r==0) { //������ 0�����Ǵ�
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
