package loops;

public class ForLoop {
	public static void main(String[] args) {
		for(int i=0;i<7;i++)
		{
			System.out.println(i);
		}
		
		int sum=0;
		//write a programn to count the sum of first 5 number 
		for(int i=1;i<5;i++)
		{
			sum=sum+i;
			
		}
		System.out.println(sum);
		
	
	//write a program to multiply the first 5 number in factorial
	
	int mul=1;
	for(int i=1;i<=5;i++)
	{
		mul=mul*i;
	}
	System.out.println(mul);
	}
}
