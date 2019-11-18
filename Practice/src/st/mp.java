package st;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class mp {
	public static void main(String[] args) {
		HashMap<String , Integer> hm=new HashMap<>();
		hm.put("rubina", 40);
		hm.put("zidaan", 40);
		System.out.println(hm.get("zidaan"));
		
	for(Entry<String, Integer>  h : hm.entrySet())
	{
		System.out.println(h.getKey() +""+h.getValue());
	}
		
	}

}
