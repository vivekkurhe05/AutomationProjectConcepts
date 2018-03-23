package abcd;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListExample {

	public static void main(String[] args) {
		
		ArrayList<Integer> arrlist=new ArrayList<Integer>();
		arrlist.add(5);
		arrlist.add(2);
		arrlist.add(9);
		arrlist.add(15);
		arrlist.add(59);
		
		@SuppressWarnings("rawtypes")
		Iterator i=arrlist.iterator();
		
		if(i.hasNext()){
			
			System.out.println(arrlist);
		}
		arrlist.forEach(System.out::println);
//		System.out.println("Array size is "+arrlist.size());
//		
//		Object[] list2=arrlist.toArray();
//		
//		for(Object obj:list2)
//			System.out.println(obj);

	}

}
