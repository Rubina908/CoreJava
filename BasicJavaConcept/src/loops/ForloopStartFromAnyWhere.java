package loops;

public class ForloopStartFromAnyWhere {
	public static void main(String[] args) {
		String name[]=new String[3];
		name[0]="rita";
		name[1]="rahul";
		name[2]="heena";
	//want to fetch only heena using for loop
		
		for (int i=2;i<name.length;i++)
		{
			System.out.println(name[i]);
		}
		
		System.out.println("****************************************************");
		
		
		System.out.println("difference between for loop and advance for loop ");
		
		System.out.println("****************************************************************");
		//for each loop will print all the values we cannot take the specific value in for each loop i.e in advance for loop 
		
		
		for (String H : name) 
		{
			System.out.println(H);
		}
}

}
