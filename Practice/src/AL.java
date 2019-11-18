
import java.util.Iterator;
import java.util.LinkedList;

public class AL {
	
public static void main(String[] args) {
	
LinkedList Ar=new LinkedList();
	Ar.add("Nisha");
	Ar.add("rahul");
	Ar.add("Zidaan");
	Ar.add("Nahyan");
	
	
	int S = Ar.size();
	System.out.println(S);
	 for(int i=0;i<S;i++)
	 {
		 System.out.println(Ar.get(i));
	 }
	 System.out.println("*******************");
	 
	//instead of for loop I will use Iterator to print all the values
	Iterator it = Ar.iterator();
	while(it.hasNext())
	{
		Object N = it.next();
		
		System.out.println(N);
	}
	
}
}
