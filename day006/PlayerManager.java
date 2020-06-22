package day06_objectArray;

public class PlayerManager {
	private 
	Player[] arr = new Player[50];
	int cnt;
	void insertPlayer() {
		System.out.println("�������� ���...");
		System.out.print("�̸� >>");
		String name = BookMain.sc.nextLine();
		System.out.print("�ּ� >>");
		String address = BookMain.sc.nextLine();
		System.out.print("���� >>");
		int age = BookMain.sc.nextInt();
		System.out.print("Ű >>");
		double height = BookMain.sc.nextDouble();
		System.out.print("������ >>");
		double weight = BookMain.sc.nextDouble();
		arr[cnt++] = new Player(name,address,age,height,weight);
		
	}
	public void viewPlayer() {
		for(Player p : arr ) {
			if(p==null)break;
			System.out.println("�̸� : "+p.getName());
			System.out.println("���� :  "+p.getAge());
			System.out.println("�ּ� :  "+p.getAddress());
			System.out.println("Ű :  "+p.getHeight());
			System.out.println("������ :  "+p.getWeight());
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
		System.out.println("ã�� ���� �̸� >>");
		String searchName = BookMain.sc.next();
		Player p=search(searchName);
		if(p==null) {
			System.out.println("ã�� ������ �����ϴ�.");
			return;
		}
		System.out.println("�̸� : "+p.getName());
		System.out.println("���� :  "+p.getAge());
		System.out.println("�ּ� :  "+p.getAddress());
		System.out.println("Ű :  "+p.getHeight());
		System.out.println("������ :  "+p.getWeight());
	}
	/*
	public void searchPlayer() {
		System.out.println("ã�� ���� �̸� >>");
		//�̸��� ������ ã�� ����
		//ã�� ������ ������ �̸�,Ű,�ּ�,����,������ ���� ���
		//������ ã�� ������ �����ϴ�
		String name2 = BookMain.sc.nextLine();
		Player p =null;
		for(int i=0 ; i<cnt;i++) {
			if(arr[i].getName().equals(name2)) {
				p = arr[i];
				break;
			} //if
		}//for
			if(p!=null) {
				System.out.println("�̸� : "+p.getName());
				System.out.println("���� :  "+p.getAge());
				System.out.println("�ּ� :  "+p.getAddress());
				System.out.println("Ű :  "+p.getHeight());
				System.out.println("������ :  "+p.getWeight());
			}else {
				System.out.println("ã�� ���� �����ϴ�.");
			}
		}
	*/
	
	
	
	}//class

