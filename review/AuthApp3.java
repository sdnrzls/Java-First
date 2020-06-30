package review;

public class AuthApp3 {

	public static void main(String[] args) {
		
		String[][]users = {
				{"king","1234"},
				{"queen","4567"},
				{"jack","7890"}
		};
		String inputid = args[0];
		String inputpass = args[1];
		
		boolean isLogined = false;
		for( int i=0; i<users.length; i++) {
			String currentId[] = users[i];
			if(currentId[0].equals(inputid)&&currentId[1].equals(inputpass)) {
				isLogined =true;
				break;			
			}
		}
		System.out.println("Hi");
		if(isLogined) {
			System.out.println("Master!");
		}else {
			System.out.println("who are you?");
		}
	
	}//main
}//class
