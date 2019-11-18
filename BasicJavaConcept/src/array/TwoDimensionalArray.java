package array;

public class TwoDimensionalArray {

	public static void main(String[] args) {
		
		String name[][]=new String [3][2];
	name[0][0]="heena";
		name[0][1]="rahul";
		name[2][0]="rita";
		name[2][1]="xyz";
		name[1][0]="abc";
		name[1][1]="bhjj";
		
		System.out.println(name[0][1]);
		for(int row=0;row<name.length;row++)
		{
			for(int col=0;col<name[0].length;col++)
			{
				System.out.println(name[row][col]);
			}
		}
	}
}
