package finalpack;

//public class FinalMethod_Variable extends ClassFinal{//cannot inherit final class
public class FinalMethod_Variable{
	
	final int a=10;//final variable initialized during declaration, recommended practice
	final int b;//if not initialized here, then value can be initialized only in the constructor
	
	public FinalMethod_Variable(){//constructor			
			System.out.println("In final class constructor");
			//a=20;//not possible as final variable a is initialized during declaration
			b=30;//if not initialized during the declaration, then final variable can be initialized
				 //in the constructor only
			System.out.println("The value of final variable a: "+a);
			System.out.println("The value of final variable b: "+b);
	}
	
	public final void display() {//final method
		System.out.println("In display method of FinalClass");
	}
}
