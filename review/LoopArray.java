package review;

public class LoopArray {

	public static void main(String[] args) {
		/*<li>egoing</li>
		 * 
		 */
		String[] users = new String[3];
		users[0] = "egoing";
		users[1] = "jin";
		users[2] = "youbin";
		
		for(int i =0; i<3; i++) {
			System.out.println("<li>"+users[i]+"</li>");
		}

	}

}
