package array;

public class ObjectArray {
	public static void main(String[] args) {
		Object s1[]=new Object[3];
		s1[2]=9;
		s1[1]="rita";
		s1[0]="Rahul";
		
		//to print all the value
		
		for (int i=0;i<s1.length;i++)
		{
			System.out.println(s1[i]);
		}
		
		
		System.out.println("*******************");
		
		
//		for each loop
		
		for (Object object : s1) 
		{
			System.out.println(object);
		}
		
		
		
	}

}
