package map;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map.Entry;
import java.util.Set;

public class HT2 {
public static void main(String[] args) {
	//HashMap h=new HashMap();
// ArrayList ar=new ArrayList();
// HashMap HM=new HashMap();
   Hashtable<String, Integer> hm = new Hashtable<String, Integer>();
   //adding the element
   hm.put("Rita", 10);
   hm.put("heena", 40);
   hm.put("Rahul", 9);
   
   //i want  to fetch the key 
   System.out.println(hm.get("Rahul"));
   System.out.println(hm.get("heena"));
   
   //if i want to fetch all the values
   //hashtable  is in non-synchronize form means in descending order the values are print 
   
   for(Entry<String, Integer> k:hm.entrySet())
   {
	   System.out.println(k.getKey() + "  "  + k.getValue());
   }
   
}
}
 


