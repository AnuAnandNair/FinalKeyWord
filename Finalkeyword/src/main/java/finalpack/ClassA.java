package finalpack;

public class ClassA extends FinalMethod_Variable{
	//can't override  final methods
	/*public final void display() {//final method
		System.out.println("In display method of ClassA");
	}*/
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassA a1=new ClassA();
		a1.display();
		
		//can inherit final variable from parent class and accessed using child class object
		System.out.println("Final variable a of Parent Class accessed using child class object: "+a1.a);
		System.out.println("Final variable b of Parent Class accessed using child class object: "+a1.b);
	}
}
