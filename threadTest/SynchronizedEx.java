package threadTest;

class SharedBoard{
	private int sum=0;
	
	 synchronized public void add() {
		int n = sum;
		n+=10;
		sum = n;
		System.out.println(Thread.currentThread().getName()+":"+sum);
	}
	
	public int getSum() {
		return sum;
	}
}
class StudentThread extends Thread{
	public StudentThread(String name, SharedBoard board) {
		super(name);
		this.board = board;
	}
	@Override
	public void run() {
		for(int i= 0; i<10; i++) {
			board.add();
		}
	}

	private SharedBoard board;
}

public class SynchronizedEx {

	public static void main(String[] args) {
		SharedBoard board =new SharedBoard();
		Thread th1 = new StudentThread("이순신",board);
		Thread th2 = new StudentThread("홍길동",board);
		Thread th3 = new StudentThread("강감찬",board);
		th1.start();
		th2.start();
		th3.start();
	}//main
}//class
