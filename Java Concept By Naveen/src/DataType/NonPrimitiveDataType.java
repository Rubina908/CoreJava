package DataType;

public class NonPrimitiveDataType {
	
	public static void main(String[] args) {
		/*string  and array is non primitive data type and it is know as call by reference 
		 * String is a call
		 */
		
	//string is a  class
		
		
		String name="nina";
		String change = name.replace("n", "k");
		System.out.println(change);
		
		String check="";
		
		boolean g = check.isEmpty();
		System.out.println(g);
		
		
		
		/*
		**********************************Array*********************/
		
		int ar[][]=new int[2][3];
		
		ar[0][2]=30;
		ar[0][1]=40;
		
		for(int row=0;row<ar.length;row++)
		{
			for(int col=0;col<ar[0].length;col++)
			{
		
			System.out.println(ar[row][col]);
		}
		
		
		
		
		
		}
	}
}
