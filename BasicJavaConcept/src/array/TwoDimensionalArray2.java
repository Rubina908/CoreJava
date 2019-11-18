package array;

public class TwoDimensionalArray2 {

	public static void main(String[] args) {
		//first one is row and second one is column
		String name[][]=new String[1][3];
		
		name[0][0]="heena";
		name[0][1]="heeta";
		name[0][2]="hamka";
		for(int i=0;i<name.length;i++)
		{
			for(int j=0;j<name[0].length;j++)
			{
				System.out.println(name[i][j]);
			}
				
		}
	
	}
}