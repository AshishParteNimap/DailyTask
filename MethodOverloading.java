package Test;

class Area{
	int length;
	int breadth;
	int height;
	double radius;
	final double pi=3.14;
	int area;
	
	public int AreaCal(int length,int breadth) {
		area=length*breadth;
		return area;
	}
	
	//Method overloaded by changing parameter
	public int AreaCal(int length,int breadth,int height) {
		area=length*breadth*height;
		return area;
	}
	//Method overloaded by changing datatype
	public double AreaCal(double radius) {
		double area=pi*radius*radius;
		return area;
	}
}
public class MethodOverloading {
public static void main(String[] args) {
	Area rectangle=new Area();
	Area triangle=new Area();
	Area circle=new  Area();
	
	System.out.println(circle.AreaCal(5));
	System.out.println(triangle.AreaCal(12, 23, 34));
	System.out.println(rectangle.AreaCal(12,23));
}
}
