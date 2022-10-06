package Test;

//interface
public interface TestInterface {
	//Abstract method delaration only no implementation
String Shape(String nameOfShape);
public int area(int dimension1,int dimension2);

}

//Abstrsact class
abstract class TestAbstract{
	String name;
	 String test(String name) {
		return this.name=name;
	}
	 
	 public int AbstractArea(int dimension1,int dimension2) {
		 int area=dimension1*dimension2;
		 return area;
	 }
}

//main class for Abstract class
public class Main extends TestAbstract{
public static void main(String[] args) {
	

	Main main=new Main();
	System.out.println(main.test("square"));
	
	System.out.println(main.AbstractArea(10, 10));
}	

}
//main class for interface
class newMain implements TestInterface{
	String name;
	@Override
	public String Shape(String nameOfShape) {
		return this.name=nameOfShape;
	}

	@Override
	public int area(int dimension1, int dimension2) {
		int area=dimension1*dimension2;
		return area;
	}
	public static void main(String[] args) {
		newMain main=new newMain();
		System.out.println(main.Shape("rectangle"));
		
		System.out.println(main.area(20, 20));
	}
	
	
}


