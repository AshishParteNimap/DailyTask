package Test;

import java.util.*;

public class HashmapAndHashtable {

	public static void main(String[] args) {
		
		//HashMap
		HashMap<String, Integer> newHash=new HashMap<>();
		newHash.put("Login",1);
		newHash.put("Fill form",2);
		newHash.put("Logout",3);
		
		System.out.println(newHash.size());
		
		if(newHash.containsKey("Logout")) {
			Integer a= newHash.get("Logout");
		
			System.out.println("key  for value Logout is :"+a);
		}
		System.out.println(newHash);
		
		//HashTable
		
		Hashtable<Integer, String> hmt=new Hashtable<>();
		
		//put
		hmt.put(1, "BMWX50");
		hmt.put(2, "GWAGON");
		hmt.put(3, "PORCHE911");
		hmt.put(4, "HUMMER");
		hmt.put(5, "CADILAC");
		
		for(Map.Entry m:hmt.entrySet()) {
			System.out.println(m.getKey()+" "+m.getValue());
		}
		
		//remove
		hmt.remove(4);
		
		System.out.println(hmt);
		
		//getOrDefault
		System.out.println(hmt.getOrDefault(1, "Not Found")+" "+hmt.getOrDefault(2, "Not Found"));
		System.out.println(hmt.getOrDefault(7,"Not Found"));
		
		//putIfAbsent
		hmt.putIfAbsent(1, "BMWX50");
		System.out.println(hmt);
		
		hmt.putIfAbsent(4, "HUMMER");
		System.out.println(hmt);
	}

}
