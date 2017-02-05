package myPack;

import java.util.*;
import java.util.Iterator;

public class Ses9Asnment2 {

	public static void main(String[] args)
	{
		ArrayList al = new ArrayList();
		al.add(10);
		al.add(15);
		al.add(20);
		al.add(20);
		al.add(15);
		al.add(35);
		al.add(36);
		System.out.println("Size of arrayList is " +al.size());
		Iterator itr = al.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		System.out.println(al);
		System.out.println("After Converting above Arraylist to Set, the output is : ");
		
		
	    HashSet hs = new HashSet(al);
	    
	    System.out.println(hs);
	    
		
	    System.out.println("Set interface does not accept Duplicate");
		  
		
		

	}

}
