package utilTest;

public class StringTest03 {

	public static void main(String[] args) {
		
		String tmp = "1 0 15 23 6 21 17 10 11 12 13 14";
		//tmp�� ����
		System.out.println("tmp�� ���� : "+tmp.length());
		//tmp�� �������� �����Ͽ� ���
		String []arr = tmp.split(" ");
		System.out.println("arr���� : " + arr.length);
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+"\t");
		}
		System.out.println();
		//16����
		System.out.println(Integer.toHexString(15));
		//arr�迭�ȿ� �ִ� ���ڸ� 16������ ����
		String oct = "";
		String hex = "";
		for(int i=0; i<arr.length; i++) {
			int v= Integer.parseInt(arr[i]); 
			hex +=Integer.toHexString(v).toUpperCase()+"\t";
			oct +=Integer.toOctalString(v).toUpperCase()+"\t";
		}
		System.out.println("16���� : " + hex);
		System.out.println("8���� : " + oct);
	
	}//main
}//class
