package Strin;

public class SecondType {
public static void main(String[] args) 
{
	//String is immutable means the value canot be change it is constant 
	
	String s1="Hello";
	String s2="Hello";
	//in string both variable s1 and s2 holding same vale so it store in same memory location 
	
	System.out.println(s1);
	System.out.println(s2);
	System.out.println(s1.hashCode());//s1 and s2 variable are holdin same memory address that why string is immutable the value cannot be change it remain constant
	System.out.println(s2.hashCode());
	
}
}
