package day05;

public class DrinkTeaMain {

	public static void main(String[] args) {
		Drink[]arr =new Drink[100];
		//Ä¿ÇÇ 500 3 1500	
		//³ìÂ÷ 800 5 4000	
		//Ä«Æä¶ó¶¼ 1500 5 7500		
		//ÃÑÆÇ¸Å¾×
		arr[0] = new Drink("Ä¿ÇÇ",500,3);
		arr[1] = new Drink("³ìÂ÷",800,5);
		arr[2] = new Drink("Ä«Æä¶ó¶¼",1500,5);
		int sum = 0;
		for(int i=0; i<arr.length; i++) {
			if(arr[i]==null) break;
			arr[i].getData();
			sum +=arr[i].getTotal();
		}
		System.out.println("ÃÑÆÇ¸Å¾× : "+sum);
	}

}
