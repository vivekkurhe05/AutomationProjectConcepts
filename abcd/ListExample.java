package abcd;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListExample {

	public static void main(String[] args) {
			
		
		List<Integer> val=new ArrayList<>();
		val.add(5);
		val.add(9);
		val.add(1,6);
		val.add(14);
		int a=val.get(1);
		ListIterator<Integer> i=val.listIterator();
		while(i.hasNext()){
			System.out.println(i.next());
		}
		System.out.println("Element at index 1 is "+a);
//		System.out.println(val.lastIndexOf(9));
		

	}

}
