package inheritance;

public class M {
	
	public static void main(String[] args) {
		HighLander H=new HighLander();
//method overridding (if the child class and parent class have same method name and signature then child class overridden the parent class)
				H.start();
				H.brek();
		H.newfeature();
	Hond h=new Hond();
	h.brek();
	h.smokeengine();
	//method overridding
	h.start();
	h.mirror();
	
	
		//Dynamic polymorpisim(in dynamic polymorphisim the parent class doesn't have access to the property of child class)
	Car c=new Hond();
	c.brek();
	c.start();
			
		
	}

	
}

