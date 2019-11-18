package array;

public class ArrayProgram {
	public static void main(String[] args) {
		int a[]=new int [5];
//		want to know the size of array
		a[4]=20;
		a[3]=30;
		a[2]=10;
		a[1]=90;
		
		
int size = a.length;
		System.out.println(size);
		//for loop
		for(int i=0;i<size;i++)

		{
System.out.println(a[i]);

		
		}
		
		
	}

}
