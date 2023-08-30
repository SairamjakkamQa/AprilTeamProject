package test;

import java.util.ArrayList;

public class ArrayLisst {

	public static void main(String[] args) {

		ArrayList al=new ArrayList();
		
		
		
		
		
		al.add("car");
		
		al.add("truck");
		
		al.add("Bike");
		
		al.add("cycle");
		
		//al.set(2, "plane");
		
		al.remove(3);
		
		
		ArrayList al2=new ArrayList();
		
		al2.add("car");
		
		al2.add("bike");
		
		al2.add("train");

		al.addAll(al2);	
		
		System.out.println(al);
		
		
	}

}
