package list;

import java.util.ArrayList;

public class Generic {
	public static void main(String[] args) {
		ArrayList<Integer> ar=new ArrayList<Integer>();
		//how to add an object
		ar.add(10);
		ar.add(20);
		ar.add(90);
		//how to know the size of the array list 
		int length = ar.size();
		System.out.println(length);
		//to fetch all the vazlues
		for(int i =0;i<length;i++)
		{
			System.out.println(ar.get(i));
		}
	
	}

}
