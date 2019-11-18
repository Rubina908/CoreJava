package array;

public class objec {
	public static void main(String[] args) {
		
		int a[]=new int[4];
		int g = a.length;
	/*System.out.println(g);*/
		a[3]=5;
		a[2]=6;
		a[1]=4;
		for(int k=3;k<g;k++)
		{
			System.out.println(a[k]);
		}
		
		System.out.println("*****************************************************************");
		//
		for (int i : a)
		{
		System.out.println();	
		}
	}
}
		