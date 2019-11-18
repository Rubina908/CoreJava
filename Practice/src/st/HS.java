package st;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class HS {
	public static void main(String[] args) {
		Set<String>st=new TreeSet<>();//
		st.add("rubina");
		st.add("heena");
		Iterator<String> it = st.iterator();
		while(it.hasNext())
		{
			String n = it.next();
			System.out.println(n);
		}
	
		
	}
	
}
