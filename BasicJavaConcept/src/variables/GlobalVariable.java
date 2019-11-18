package variables;

import javax.swing.plaf.synth.SynthSeparatorUI;

public class GlobalVariable {
	int StationNumber;//this are global varible declare inside the class this is alsoi called instance variable 
	int WorkArea;
	
	public static void main(String[] args)
	{
		//how to acces global variable by crteatinh  tghe object 
GlobalVariable total = new  GlobalVariable();
int c = total.StationNumber=122;
System.out.println(c);
int d = total.WorkArea=45;
System.out.println(d);

	}

}
