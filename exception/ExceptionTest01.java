package exception;

public class ExceptionTest01 {

	public static void main(String[] args) {
		int[] arr = new int[5]; // 0 1 2 3 4 
		String str = "";
		try {
			System.out.println(str.length());
		for(int i =0; i<=5; i++) {
			arr[i] = i;
			System.out.println(arr[i]);
		}
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("���ܹ߻�");
		}catch(NullPointerException n) {
			System.out.println("null ���̳׿�");
		}finally {
			System.out.println("�ݵ�� ����Ǵ� ����");
		}
		
		
	}//main
}//class
