package review;

public class review06 {

	public static void main(String[] args) {
	
		/*이중 for 사용 하여
		1부터 10까지의 합
		11부터 20까지의 합
		21부터 30까지의 합
		.
		.
		91부터 100까지의 합
	*/
		
		for(int i=1; i<101; i+=10) {
			int sum =0;
			int j;
			for(j=i; j<i+10; j++) {
				sum+=j;
			}
			System.out.println(i+"부터"+(j-1)+"까지의 합은"+sum+"입니다");
		}

	}

}
