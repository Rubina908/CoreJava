package variables;

public class LocalVariableUsingMethod 
{
public void sum()
{
	int a;//local variable //varibla declare inside  method is called local variable
	int b;
	a=30;
	b=40;
	int c = a+b;
	System.out.println(c);
}
public static void main(String[] args) 
{

	LocalVariableUsingMethod b1=new LocalVariableUsingMethod();
b1.sum();


}
}
