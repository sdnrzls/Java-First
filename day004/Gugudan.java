package day04;

public class Gugudan {
	int dan;
	
	public Gugudan(int dan) {
		this.dan = dan;
	}
	public void viewData() {
		System.out.println(dan+"´Ü");	
		for(int j=1; j<10; j++) {		
				System.out.println(dan+"*"+j+"="+dan*j);
		}
			}	
	public static void main(String[] args) {
		
		Gugudan g1 = new Gugudan(5);
		g1.viewData();
		System.out.println("===============");
		
		Gugudan g2 =new Gugudan(7);
		g2.viewData();
		System.out.println("===============");
		
		Gugudan g3 =new Gugudan(9);
		g3.viewData();
		
	}//main
}//class
