package collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class HashMapExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Map<String, String> hashMap = new HashMap<String, String>(); 
		hashMap.put("100","Amit");  
		hashMap.put("101","Vijay");  
		hashMap.put("102","Rahul");
		Iterator<Entry<String, String>> iter  = hashMap.entrySet().iterator();
		while(iter.hasNext()){
			Map.Entry<String, String> entry = (Map.Entry<String, String>) iter.next();
			System.out.println(entry.getValue());
		}
		
		for (Entry<String, String> m : hashMap.entrySet()) {
			System.out.println(m.getKey() + " " + m.getValue());
		}
		
		for (String key: hashMap.keySet()) {
			System.out.println(key + " " + hashMap.get(key));
		}
		
		for (String value : hashMap.values()) {
			System.out.println(value);
		}
		
		Iterator it = hashMap.entrySet().iterator();
		
		while(it.hasNext()){
			Entry key =  (Entry) it.next();
			System.out.println(key.getKey() + " " + hashMap.get(key.getKey()));
		}
		
	}

}
