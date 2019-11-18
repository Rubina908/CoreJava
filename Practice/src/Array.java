
public class Array {
	public static void main(String[] args) 
	{
		String name[][]=new String[2][4];
		name[1][3]="nita";
		name[1][2]="rita";
		for (String[] neena : name) 
		{
			for (String vita : neena) 
			{
				System.out.println(vita);
			}
		}
		
	}

}
