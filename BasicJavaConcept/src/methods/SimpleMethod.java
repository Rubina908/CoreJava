package methods;

public class SimpleMethod {
	
	public int sum()
	{
		int a=4;
		int b=5;
		int total =a+b;
		return total;
		
	}
	
	public static void main(String[] args) {
		SimpleMethod h=new SimpleMethod();
			int my = h.sum();
			System.out.println(my);
				}
	}

