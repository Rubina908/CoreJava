package list;

import java.util.ArrayList;
import java.util.LinkedList;

public class LL {
	public static void main(String[] args) {
		
	LinkedList al=new LinkedList();
	//how to add an object
	al.add(10);
	al.add(20);
	al.add(90);
	al.remove(2);
	//how to know the size of the array list 
	int length = al.size();
	System.out.println(length);
	//to fetch all the vazlues
	for(int i =0;i<length;i++)
	{
		System.out.println(al.get(i));
	}
	
}

}



