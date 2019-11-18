package array;



public class simple {
public static void main(String[] args) {
	//this is two dimension array 
	int g[][]=new int[1][4];
	g[0][0]=90;
	g[0][1]=20;
	g[0][2]=30;
	g[0][3]=40;
	
	 
	System.out.println("to know the length of row"  +g.length);
	
	
	
	  // to know the length of cloumn
 	System.out.println(g[0].length);
 	
 	
 for (int row=0;row<g.length;row++)
 {
	for(int col=0;col<g[0].length;col++)
	{
		System.out.println(g[row][col]);
	}
 }
}
}
