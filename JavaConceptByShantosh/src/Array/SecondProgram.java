package Array;

public class SecondProgram 
{
	public static void main(String[] args) 
	{
		int sys[][]=new int [2][3];
		sys[0][0]=10;
		sys[0][1]=20;
		sys[0][2]=30;
		sys[1][0]=40;
		sys[1][1]=50;
		sys[1][2]=60;
		
		
		
	for(int row=0;row<sys.length;row++)
	{
	for(int col=0;col<sys[0].length;col++)
	{
		System.out.println(sys[row][col]);
	}
	}
	
	}
}


