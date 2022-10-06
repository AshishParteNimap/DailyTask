package Test;

public interface InterfaceExample {
 
//abstract method 
int area(int length, int breadth);
 
}

//implementing abstract class
class rectangleShape implements InterfaceExample{
	int length;
	int breadth;
	
	//abstract method 
	@Override
	public int area(int length,int breadth) {
		int area= length*breadth;
		return area;
	}
}
//implementing abstract class
class circleShape implements InterfaceExample{
	int radius;
	
	//abstract method
	@Override
	public int area(int radius,int pi) {
		
		return (int) (pi*radius*radius);
	}
}
//implementing abstract class
class triangle implements InterfaceExample{
	int breadth;
	int length;
	
	//abstract method
	@Override
	public int area(int length,int breadth) {
		
		
		return (int) (0.5*length*breadth);
	}

}

class interfaceExecution {
public static void main(String[] args) {
	InterfaceExample itr=new rectangleShape();

	System.out.println(itr.area(12, 23));
	
	InterfaceExample itr2=new circleShape();
	System.out.println(itr2.area(12, 23));
	
	InterfaceExample itr3=new triangle();
	System.out.println(itr3.area(10, 34));
}
}
