package Test;
 abstract class Automobile{
	String name;
	String Desciption;
	int price;
	public Automobile(String name, String desciption, int price) {
		super();
		this.name = name;
		Desciption = desciption;
		this.price = price;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDesciption() {
		return Desciption;
	}
	public void setDesciption(String desciption) {
		Desciption = desciption;
	}
	public int getPrice(int i) {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}	
	public void Car() {
		System.out.println("name of the car is :"+name+ "\n" +" this car is  :"+Desciption+"\n"+" and it will cost you :"+price+"$");
	}
}

 class LuxaryCar extends Automobile{

	public LuxaryCar(String name, String desciption, int price) {
		super(name, desciption, price);
		
	}
	public void Car() {
		System.out.println(" name of the car is :"+name+ "\n" +" this car is :"+Desciption+"\n"+" and it will cost you :"+price+"$"+"\n");
	}
	 
 }
 
 class Xuv extends Automobile{

	public Xuv(String name, String desciption, int price) {
		super(name, desciption, price);
		
	}
	public void Car() {
		System.out.println(" name of the car is :"+name+ "\n" +" it has :"+Desciption+"\n"+" and it will cost you :"+price+"$");
	}
	 
 }
 
public class AbsractWithInheritance {
public static void main(String[] args) {
	LuxaryCar car1=new LuxaryCar("BMWX5", "best in luxury",100000);
	car1.Car();
	
	Xuv car2=new Xuv("Thar", "best in adventure", 120030);
	car2.Car();
	
	
}
}
