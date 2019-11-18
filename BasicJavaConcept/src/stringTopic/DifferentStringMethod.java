package stringTopic;

public class DifferentStringMethod {
	public static void main(String[] args) {
		
		String name="workarea";
		
		System.out.println(name.replace("workarea", "SA"));
		System.out.println(name.toUpperCase());
//		System.out.println(name.replace("workarea","SA"  ));
		String actual = name.replace("workarea","SA");
		boolean expected = actual.contains( "SA");
		System.out.println( " validation of  text " +expected);
		 //System.out.println(name.substring(2, 7));
		String actual1 = name.substring(2, 7);
		boolean expected2 = actual1.contains(actual1);
		System.out.println(" validating the sub string "  +expected2);
		
		System.out.println(name.replace("workarea", "Sa"));
		
		//converting string to Interger
		
		String str="2,567";
		
		int h = Integer.parseInt(str);
		
		
	}

}
