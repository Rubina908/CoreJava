package operators;

public class EqalsToOperator 
{
public static void main(String[] args)
{
String s2=new String("drugs");
String s3=new String("drugs");
//the  two reference object cannot be compare
 System.out.println(s2==s3);//it will return false because two object reference cannot be compare


System.out.println(s2.equals(s3));//it will written true because two object content is same

}
}