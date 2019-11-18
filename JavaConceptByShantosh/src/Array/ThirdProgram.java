package Array;

public class ThirdProgram {
	public static void main(String[] args) 
	{
		int sys[][]=new int [2][3];
		sys[0][0]=10;
		sys[0][1]=20;
		sys[0][2]=30;
		sys[1][0]=40;
		sys[1][1]=50;
		sys[1][2]=60;
		for (int is[] : sys)
		{
			for (int i : is) 
			{
				System.out.println(i);
			}
			
		}

}
}