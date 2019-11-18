package Coll;

import java.util.ArrayList;
import java.util.Iterator;

public class pro {
	public static void main(String[] args) {
		ArrayList<String>ar=new ArrayList<String>();
		ar.add("Walid");
		ar.add("Rubina");
		ar.add("Zidaan");
		ar.add("Nahyan");
		
//		ar.add("Walid");
		
		/*for (String all : ar) 
		{
			System.out.println(all);
		}*/
		
		/*int S = ar.size();
		System.out.println(S);
		for(int i=0;i<S;i++)
		{
			System.out.println(ar.get(i));
		}*/
		Iterator it = ar.iterator();
		while(it.hasNext())
		{
			Object n = it.next();
			System.out.println(n);
		}
		
	}

	
	
}
