package interfac;

public class TestClass {
	public static void main(String[] args) {
		//static polymmorphisim or Compile time polymorphisim or early binding polymorphisim
		 Firefox ff=new  Firefox ();
		 ff.click();
		 ff.close();
		 ff.firefoxportal();
		 ff.sendkeys();
		 
		 //Drnamic ploymorphisim or run time polymorphisim or late binding polymorphiim
		 WebDriver wd=new Firefox();
				 wd.click();
				 wd.close();
				 wd.sendkeys();
				 
	}

}
