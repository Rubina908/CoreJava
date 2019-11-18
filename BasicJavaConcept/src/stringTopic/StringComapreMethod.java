package stringTopic;

public class StringComapreMethod {
	public static void main(String[] args) 
	{
		String s1="workarea";
		String s2="serviceare";
		 String s3="Workarea";
		 
		System.out.println(s1.compareTo(s2)==1); 
		System.out.println(s1.compareTo(s3)==0);
		System.out.println(s1.compareToIgnoreCase(s3)==0);
		 
	}

}
