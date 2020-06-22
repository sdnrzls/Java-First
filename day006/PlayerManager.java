package day06_objectArray;

public class PlayerManager {
	private 
	Player[] arr = new Player[50];
	int cnt;
	void insertPlayer() {
		System.out.println("선수정보 등록...");
		System.out.print("이름 >>");
		String name = BookMain.sc.nextLine();
		System.out.print("주소 >>");
		String address = BookMain.sc.nextLine();
		System.out.print("나이 >>");
		int age = BookMain.sc.nextInt();
		System.out.print("키 >>");
		double height = BookMain.sc.nextDouble();
		System.out.print("몸무게 >>");
		double weight = BookMain.sc.nextDouble();
		arr[cnt++] = new Player(name,address,age,height,weight);
		
	}
	public void viewPlayer() {
		for(Player p : arr ) {
			if(p==null)break;
			System.out.println("이름 : "+p.getName());
			System.out.println("나이 :  "+p.getAge());
			System.out.println("주소 :  "+p.getAddress());
			System.out.println("키 :  "+p.getHeight());
			System.out.println("몸무게 :  "+p.getWeight());
		}
	}
	
	public Player search(String searchName) {
		for(int i=0 ; i<cnt;i++) {
			if(searchName.equals(arr[i].getName())) {
		return arr[i];
			}
		}
		return null;
	}
	
	public void searchPlayer() {
		System.out.println("찾을 선수 이름 >>");
		String searchName = BookMain.sc.next();
		Player p=search(searchName);
		if(p==null) {
			System.out.println("찾는 선수가 없습니다.");
			return;
		}
		System.out.println("이름 : "+p.getName());
		System.out.println("나이 :  "+p.getAge());
		System.out.println("주소 :  "+p.getAddress());
		System.out.println("키 :  "+p.getHeight());
		System.out.println("몸무게 :  "+p.getWeight());
	}
	/*
	public void searchPlayer() {
		System.out.println("찾을 선수 이름 >>");
		//이름이 같으면 찾는 선수
		//찾는 선수가 있으면 이름,키,주소,나이,몸무게 전부 출력
		//없으면 찾는 선수는 없습니다
		String name2 = BookMain.sc.nextLine();
		Player p =null;
		for(int i=0 ; i<cnt;i++) {
			if(arr[i].getName().equals(name2)) {
				p = arr[i];
				break;
			} //if
		}//for
			if(p!=null) {
				System.out.println("이름 : "+p.getName());
				System.out.println("나이 :  "+p.getAge());
				System.out.println("주소 :  "+p.getAddress());
				System.out.println("키 :  "+p.getHeight());
				System.out.println("몸무게 :  "+p.getWeight());
			}else {
				System.out.println("찾는 선수 없습니다.");
			}
		}
	*/
	
	
	
	}//class

