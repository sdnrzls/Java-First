package review;

public class review05 {

	public static void main(String[] args) {
		/* **********(9)
		 * *********(7)
			*******(5)
		 */
		
			for(int i =9; i>0; i-=2) {
				for(int j =1; j<=i;  j++) {
					System.out.print("*");
				}
				System.out.println("("+i+")");
			}

			System.out.println("=====================");
			
			/*
			 *  *********************z
			 *  ********************yz
			 *  *******************xyz
			 */
			
			for(char i='z'; i>='a'; i--) {
				for(char j='a'; j<='z'; j++) {
					if(j<i) {
						System.out.print("*");
					}else {
						System.out.print(j);
					}
				}
				System.out.println();
			}
			
	}//main
}//class
