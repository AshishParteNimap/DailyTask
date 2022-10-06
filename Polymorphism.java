package Test;

//Parent class
class Area51{
	int area(int dimension) {
		int Area=dimension*dimension;
		return Area;
	}
}

//Sub class
class rectangle2 extends Area51{
	int area(int dimension) {
	int area=dimension*dimension;
	return area;	
	}
	}

//Sub class
class square extends Area51{
	int area(int dimension) {
		int area=dimension*dimension;
		return area;
	}
}
public class Polymorphism {

	public static void main(String[] args) {
		rectangle2 rec=new rectangle2();
		System.out.println(rec.area(12));
		
		square sqr=new square() ;
		System.out.println(sqr.area(34));
		}
		

	}


