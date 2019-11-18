package methodOverloading;

public class FirstProgram {
	public static void sum(int a,int b)
	{
		System.out.println("print int");
	}
	public static void sum(String c,int d)
	{
		System.out.println("print string");
	}
	public static void sum(double e,int f)
	{
		System.out.println("print double");
	}
	
	
	
	public static void main(String[] args) {
		sum(10,20);
		sum("heena",30);
		sum(30.2 ,9);
		
	}
}
