package utilTest;

import java.util.Iterator;
import java.util.Vector;

public class VecterTest {

	public static void main(String[] args) {
	
		Vector<Integer> v =new Vector<Integer>();
		v.add(5);
		v.add(new Integer(5));
		v.add(-1);
		v.add(2,100); //(��ġ��,��)
		for(Integer i : v) {
			System.out.print(i+"\t" );
		}
		System.out.println();
		
		Iterator<Integer> it = v.iterator();
		while(it.hasNext()) {
			System.out.print(it.next()+ "\t");
		}
		System.out.println();
	}//main
}//class
