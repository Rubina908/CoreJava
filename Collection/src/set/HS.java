package set;

import java.util.HashSet;
import java.util.Iterator;

public class HS {
	public static void main(String[] args)
	{
		HashSet<String> hs=new HashSet<String>();
		hs.add("rahul");
		hs.add("haana");
		hs.add("Rita");
		hs.add("rahul");
		  System.out.println(hs);
		int s = hs.size();
		  //iterator is use to fetech all the values one by one 
		  //set doesn't contain index so we cannot use for loop for set conc
		  for(int i=0;i<s;i++)
		  {
			  System.out.println();
		  }
		  
		  Iterator<String> h = hs.iterator();
		  while(h.hasNext())
		  {
			 String k = h.next();
			 System.out.println(k);
		  }
	}

}
