package Test;

public abstract class AbstractShape {
	private String shape;
	abstract void  shape();
	public int Area(int dimension1,int dimension2) {
	 int area=dimension1*dimension2;
	 return area;
	}
}

class rectangle extends AbstractShape{
	

	@Override
	void shape() {
	 System.out.println("rectangle");
	 }
	
	public static void main(String[] args) {
		rectangle rec=new rectangle();
		rec.shape();
		System.out.println(rec.Area(12, 10));
	}
	
}
