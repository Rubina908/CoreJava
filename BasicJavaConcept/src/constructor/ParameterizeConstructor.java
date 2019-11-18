package constructor;

public class ParameterizeConstructor {
	static int cal;
	
	ParameterizeConstructor(String a,String name)
	{
//		a=30;
//		name="'rahul";
		this.cal=50; 
		System.out.println(" performance of the week "   +cal );
		//System.out.println();
	}
	
	
	public static int earn()
	{
		int c = 0;
		System.out.println("performance of the week "  +c);
		
		return c;
		}
	
	
	public static void names(int v,String h)
	{
		v=20;
		h="r";
	}
	public static void main(String[] args) 
	{
		
		names(20, "b");
		earn();
		 ParameterizeConstructor b=new  ParameterizeConstructor("rita", "rahul");
		
	}

}
