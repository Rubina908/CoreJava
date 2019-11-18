package list;

import java.util.ArrayList;
import java.util.Iterator;

public class AL {
	public static void main(String[] args) {
		ArrayList ar=new ArrayList();
		//how to add an object
		ar.add(10);
		ar.add(20);
		ar.add(90);
		ar.add(10);//it store the duplicate value 
		//how to know the size of the array list 
		int length = ar.size();
		System.out.println(length);
		//to fetch all the vazlues
//		for(int i =0;i<length;i++)
//		{
//			System.out.println(ar.get(i));
//			
//			
//			
//		}
		Iterator al = ar.iterator();
		while(al.hasNext())
		{
			Object l = al.next();
			System.out.println(l);
		}
	}

}
