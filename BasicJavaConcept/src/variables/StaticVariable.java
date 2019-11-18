package variables;

public class StaticVariable {
 //variable declare with static keyword is know as static variable
	static int eod;//static variable can be called no need to create object 
	static int vehiclenmber=204;
	public static void main(String[] args) 
	{
		eod=53;
		System.out.println(eod);
		System.out.println(vehiclenmber);
		System.out.println(StaticVariable .vehiclenmber);//sttaic variable can be called by class name
		
	}
	

}
