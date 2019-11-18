package methods;

public class ParameterizeMethod {
	
	public static void main(String[] args) 
	{
		 ParameterizeMethod v1=new  ParameterizeMethod();
				 v1.reachout("Dc","Robinson" );
	}
	
public String reachout(String workarea,String StationNumber)
{
//	workarea="Dc";
//	 StationNumber="Robinson";
	 if(workarea != StationNumber)
	 {
		 System.out.println("printing the workarea  " +workarea  +" printting the station Number"   +StationNumber);
	 }
	 else
	 {
		 System.out.println("skip the test case");
	 }
	
	 
	 return StationNumber  ;
	 
}
	
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	


