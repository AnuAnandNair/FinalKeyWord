package finalpack;

public class Bike11{  
	public int cube(final int n){  
  		//n=n+2;//can't be changed as n is final  
  		return n*n*n;  
 	}  

 	public static void main(String args[]){  
   		Bike11 b=new Bike11();  
   		b.cube(5);  
	}  
}

