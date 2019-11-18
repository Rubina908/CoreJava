package Method;

public class Firstprogram {
	public static void main(String[] args) 
	{
		 Firstprogram  a=new  Firstprogram ();
		cal();
		a.add();
/*		add()*/
	
	}
	
	public static  void cal()
	{
		int a=30;
		int b=40;
		System.out.println(a+b);
	}

	public String add()
	{
		String name = "nisha";
		int  student = 15;
		System.out.println("The total student in the class are :: "  +student  +" and the  name of the student who is topper in the class is ::"   +name);
		
		return name ;
	}
}
