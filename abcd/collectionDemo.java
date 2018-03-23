 package abcd;

import java.util.ArrayList;
import java.util.Collection;

public class collectionDemo {

	@SuppressWarnings({ })
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Collection<Integer> values=new ArrayList<>();
		System.out.println(values.isEmpty());
		values.add(1);
		values.add(2);
//		values.add("vivek");
//		values.add(5.5);
//		values.add(3.2f);
		
		
//		Iterator i=values.iterator();
//		
//		while(i.hasNext())
//			System.out.print(i.next()+", ");
		
		for(Integer o: values)
			System.out.println(o);
		System.out.println(values.isEmpty());
		
		Collection<Integer> newvalues=new ArrayList<>();
		newvalues.addAll(values);
		System.out.println("collection 2");
		System.out.println(newvalues);
		System.out.println(newvalues.contains(1));
		System.out.println(newvalues.containsAll(newvalues));
		System.out.println("equals:"+values.equals(newvalues));
		newvalues.clear();
		System.out.println(newvalues);
		System.out.println(newvalues.containsAll(newvalues));
		if(newvalues.contains(2)){
			System.out.println("element is present");
		}
		else{
			System.out.println("Element is not present");
		}
		
	}

}
