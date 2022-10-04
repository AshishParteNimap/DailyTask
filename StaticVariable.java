package Test;
//static variable and method
public class StaticVariable {
	
	//static variable
	static int a=100;
	static int b=123;
	
	//static method
	static int sum(int a,int b) {
		int sum=a+b;
		return sum;
	}
	
	public static void main(String[] args) {
		
		/*can access static method and variable
		* without creating object of class
	    */
		System.out.println(a);
		System.out.println(b);
		System.out.println(sum(123, 345));
	}
}
