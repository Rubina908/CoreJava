package set;

import java.util.TreeSet;
//treeset is maintain  in ascending order 
public class THashSet {
	public static void main(String[] args) {
		TreeSet<String> t=new TreeSet<>();
		t.add("mita");
		t.add("vita");
		t.add("apple");
		for (String s : t)
		{
			System.out.println(s);
		}
	}

}
