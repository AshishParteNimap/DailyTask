package Test;

//Constructor in java 
public class Constructor {
	String name;
	String description;
	//No-Args constructor
		public Constructor() {
			System.out.println("Default constructor");
			
		}
		//Parameterized Constructor
		public Constructor(String name,String description) {
			this.name=name;
			this.description=description;
		}
		
	public static void main(String[] args) {
		//default constructor is called
		Constructor cons=new Constructor();
		
		Constructor cons2=new Constructor("Parameterized Constructor", "constructor with argument");
		
		//calling default constructor 
		System.out.println(cons);
		
		//calling Parameterized Constructor
		System.out.println(cons2.name+" "+cons2.description);

	}
	
	
	

}