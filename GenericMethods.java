package Test;

//Generic class
class Credentials<K,V>{
	private K k;
	private V v;

	//Generic methods
	public void setK(K k) {
		this.k=k;
	}
	
	public void setV(V v) {
		this.v=v;
	}
	
	public K getK() {
		return this.k;
	}
	
	public V getV() {
		return this.v;
	}
}


public class GenericMethods {
public static void main(String[] args) {
	
	//creating generic class object 
	Credentials<Integer,String> student=new Credentials();
	
	//invoking generic methods
	student.setK(1);
	student.setV("Ashish");
	System.out.println(student.getK()+" "+student.getV());
	
	student.setK(2);
	student.setV("sandesh");
	System.out.println(student.getK()+" "+student.getV());
}
}
