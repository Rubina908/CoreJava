package oops;

public class FruitTestclass extends mango {
	public static void main(String[] args) {
		
		//if child class is refered by it own child class then it is static polymorphism
		
		apple a=  new  apple();//static polymorphism
		a.delicious();
		
		mango ma=new apple();//dynam
		 orange og=new orange();//static 
		 og.delicious();//child
		 og.yellow();//parent
	}

}
