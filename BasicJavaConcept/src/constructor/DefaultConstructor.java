package constructor;

public class DefaultConstructor {
	//global variable
public	int a;
	int b=30;
	
	public static void add()
	{
	
	}
	
	 DefaultConstructor()
	 {
		 this.a=30;
		 this.b=45;
		 System.out.println("calculating the sum of two variable" + "    " +(a+b));
	 }
	
	public static void main(String[] args) 
	{
		
		
		DefaultConstructor c=new DefaultConstructor();
	}

}
