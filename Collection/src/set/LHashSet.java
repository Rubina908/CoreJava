package set;

import java.util.Iterator;
import java.util.LinkedHashSet;
//LHashSet is maintain in insertion order
public class LHashSet {
public static void main(String[] args) 
{
	LinkedHashSet<String> name=new LinkedHashSet<String>();
	name.add("rita");
	name.add("hiba");
	name.add("mita");
	//to retrieve all the values
	
	for (String s : name)
	{
System.out.println(s);
	}
Iterator<String> it = name.iterator();

	while(it.hasNext());
	{
Object sum = it.next();
System.out.println(sum);
}
		
}
}
