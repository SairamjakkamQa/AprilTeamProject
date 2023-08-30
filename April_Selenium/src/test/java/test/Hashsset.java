package test;

import java.util.HashSet;

public class Hashsset {

	public static void main(String[] args) {

	   HashSet hs=new HashSet();
	   
	   hs.add(3);
	   
	   hs.add("ram");
	   
	   hs.add("Bike");
	   
	   hs.add(98);
	   
	   hs.add(null);
	   
	   
	   
	   HashSet set2=new HashSet();
	   
	   
	   set2.add(3);
	   
	   set2.add("Bike");
	   
	   set2.add("India");
	   
	   set2.add("City");
	   
		
	   hs.addAll(set2);      //union >> unique values from both sets 
	   
	   //hs.retainAll(set2);      //intersection >> common elements from both sets
	   
	  // hs.removeAll(set2);
	   
	   
	   System.out.println(hs);
	   
	   System.out.println(hs.contains("India"));
	   
	   
	  
	System.out.println(hs.isEmpty());	
		
		
	}

}
