package Test;

public class TryCatchFinally {

	public static void main(String[] args) {
		
		//try block 
		try {
			
			//code 
			
			int a=25;
			int b=30;
			int div=a+b/0;
			System.out.println(div);
			
			//catch block
		} catch (ArithmeticException e) {
			//handle exception
			System.out.println(e);
		}
		
		//finally block 
		finally {
			
			//guaranteed of execution even if the we fail to handle the exception
			System.out.println("code executed sucessfully");
		}

	}

}
