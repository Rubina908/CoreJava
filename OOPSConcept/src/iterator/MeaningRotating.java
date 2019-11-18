package iterator;

import java.util.ArrayList;
import java.util.Iterator;

public class MeaningRotating {
	public static void main(String[] args) {
		
		ArrayList al=new ArrayList();
		//adding tht object in arraylist
		al.add(10);
		al.add(40);
	
		
		//array list is used when we   perform frequent operation that is insertion and deletion
		
	//deleting
		al.remove(1);
	//iterator meaning rotating 
		
		//iterator is the top most interface 
		
		Iterator it = al.iterator();
		//to print all the valu we use while loop instad of for loop
		
		
		while(it.hasNext())
		{
			Object k = it.next();
	
			System.out.println(k);
			
		}
		
		
		
	
		
	}

}
