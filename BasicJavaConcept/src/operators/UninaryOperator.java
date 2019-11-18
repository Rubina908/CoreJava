package operators;

public class UninaryOperator {
	public static void main(String[] args) 
	{
		//post incremnet 
		int a=2;//in post increment the value of the variable increase by 1 
		int b=a++;
		//a=a+1
		System.out.println(a);//it will be 3
		System.out.println(b);//it will be 2
		
		int d=4;
		int h=d++;
		System.out.println(d);//d=d+1=5
		System.out.println(h);//h=4
		
		
		//preincrement
		//in post incremnet the value of the varible increase by 1 
		int l=2;
		int k=++l;
		System.out.println(k);//l=l+1=2+1=3
		System.out.println(l);//l=l+1=2+1=3
	}
}



