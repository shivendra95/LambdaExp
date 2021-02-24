package co.shivendra;

import java.util.HashMap;
import java.util.Map;

public class Mapexec {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer, String> customers = new HashMap<>();
		customers.put(1, "Ajay");
		customers.put(2, "Barkha");
		customers.put(3, "Cathy");
		 
		System.out.println("Using foreach");
		customers.forEach((id, name) -> {
		System.out.println("Key : " + id + " value : " + name);
		});
		
		Map<String,String> xyz = new HashMap<String,String>(); 
        
	       //Enter value and url
	        xyz.put("xyz", "Alphabet.org"); 
	        xyz.put("Pronounce", "words.org"); 
	            
	        // using keySet() for iteration over keys 
	        for (String name : xyz.keySet())  
	            System.out.println("key: " + name); 
	            
	        // using values() for iteration over keys 
	        for (String url : xyz.values())  
	            System.out.println("value: " + url); 
	        
	        Map<Integer, String> students = new HashMap<>();
	        students.put(1, "Anamika");
	        students.put(2, "Bhaskar");
	        students.put(3, "Rahul");
	  
	        System.out.println("");
	        students.entrySet().stream().forEach(e ->
	                System.out.println("Key : " + e.getKey() + " value : " + e.getValue())
	        );
	}

}
