package utilTest;

public class StringTest02 {

	public static void main(String[] args) {
		String str = "�ȳ��ϼ��� Hello ������ �ڹ� ������!!!";
		System.out.println("str ���� : "+ str.length());// ������ ���̸� ã�� �Լ�
		System.out.println("H��ġ : " + str.indexOf('H'));//������ ������ ��ġã���Լ�
		System.out.println("Hello��ġ : " + str.indexOf("Hello"));//������ ������ ��ġã���Լ�
		System.out.println("4��° ���� :  " + str.charAt(4)); //������ ��ġã�� �Լ�
		String tmp = "������ �սô�";
		System.out.println("str �� tmp ���� : " + str+tmp);
		System.out.println("str �� tmp ���� : " + str.concat(tmp)); // ���ڴ��ϴ� �Լ�
		int value = 7;
		System.out.println("str �� tmp ���� : " + (str+value));
	
		String s =String.valueOf(value); // �ٸ����¸� String���� ��ȯ (�� static String ���� Ŭ�����̸����� ���ٰ���)
		System.out.println("str �� value ���� : " + str.concat(s));
		System.out.println("tmp �� value ���� : "+tmp.concat(String.valueOf(value)));
		
		String msg = "abcdefg";
		System.out.println(msg.toUpperCase());
		System.out.println(msg.toUpperCase().toLowerCase());
		String[] arr = str.split(" ");
		for(int i =0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
		System.out.println(arr.length);
	}//main
}//class
