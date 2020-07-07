package utilTest;

public class EncTest {
	/*
	 * 암호화 전 : Hi..Glad to meet you!!
		암호화 후 : Jk00"Incf"vq"oggv"{qw##
	 */
	private String encrypt(String msg) {
		String dap = "";
		for(int i=0; i<msg.length(); i++) {
		if(msg.charAt(i)==' ') {
			dap+=msg.charAt(i);
		}else {
			dap +=(char)(msg.charAt(i)+2);
		}
		}
		return dap;
	}
	private String decrypt(String str1) {
		String dap2 ="";
		for(int i =0; i<str1.length(); i++ ) {
			if(str1.charAt(i)==' ') {
				dap2 +=str1.charAt(i);
			}else {
				dap2 +=(char)(str1.charAt(i)-2);
			}
			}
		return dap2;
	}

	public static void main(String[] args) {
		EncTest enc = new EncTest();
		String msg = "Hi..Glad to meet you!!";
		System.out.println("암호화 전 : "+msg );
		String str1 = enc.encrypt(msg); //한문자에 2씩 더하기
		System.out.println("암호화 후 : " + str1);
		System.out.println("복호화 후 : "+enc.decrypt(str1));

	}//main
}//class
