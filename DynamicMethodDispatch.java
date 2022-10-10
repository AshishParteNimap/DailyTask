package Test;

//super class
class Automobile1{
	
	public void Wheel() {
		System.out.println("Wheel on the automobile are: ");
		
	}
	
	public void type() {
		System.out.println("Type of Automobile : ");
	}
}

//sub class
class suv extends Automobile1{
	public void Wheel() {
		System.out.println("Wheel on the automobile are: 4 and 6");
	
	}
	
	public void type() {
		System.out.println("Type of automobile is SUV");
	}
}
	
//sub class
class sedan extends Automobile1{
		
		public void Wheel() {
			System.out.println("Wheel on the automobile are: 4");
		}
		
		public void type() {
			System.out.println("Type of Automobile is : sedan");
		}
		
	}
	
	


public class DynamicMethodDispatch {

	public static void main(String[] args) {
		//Dynamic method dispatch or runtime polymorphism
		//the object creation in these is during run time
		
		//run time object creation
		Automobile1 auto=new suv();
		auto.Wheel();
		auto.type();
		System.out.println(auto);
		
		Automobile1 auto1=new sedan();
		auto1.Wheel();
		auto1.type();
		System.out.println(auto1);
		
		
	}

}
