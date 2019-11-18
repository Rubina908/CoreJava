package st;

import java.util.Hashtable;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class ht {
public static void main(String[] args) {
 Map<String , Integer> h=new Hashtable<>();
 h.put("zidaan", 50);
 h.put("walid", 90);
 System.out.println(h.get("zidaan"));
 
 for(Entry<String, Integer> k : h.entrySet())
 {
	 System.out.println(k.getKey()+  "      "     +k.getValue());
 }
}
}
