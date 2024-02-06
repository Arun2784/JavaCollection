package HashMap;

import java.util.HashMap;
import java.util.Iterator;

public class HashMapIterator {

	public static void main(String[] args) {
	
		HashMap<Integer, String > map = new HashMap<Integer, String>();
		map.put(1, "Java");
		map.put(12, "C++");
		map.put(33, "Selenium");
		map.put(4, "Python");
		map.put(33, "C#");
		
		System.out.println(map.get(12));
		System.out.println(map.get(33));
		
		Iterator<Integer> it = map.keySet().iterator();
		while(it.hasNext()){
			       int key= it.next();
			       String value =map.get(key);	       
			     System.out.println("Key is " +key+ " and Value is " +value);
			
		}
		
		
		
		
		
		
	}

}
