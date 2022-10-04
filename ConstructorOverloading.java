package Test;

//Constructor overloading
public class ConstructorOverloading {
 String name;
 Object description;
 int id;
 String type;

 
 public ConstructorOverloading(String name){
	 this.name=name;
	 
 }
//constructor overloaded from existing constructor
 public ConstructorOverloading(String name ,String description) {
	this.name=name;
	this.description=description;
}
 //constructor overloaded from overloaded constructor
 public ConstructorOverloading(int id,String type) {
	 this.id=id;
	 this.type=type;
 }

 
 public static void main(String[] args) {
	 //calling constructor
	ConstructorOverloading cons=new ConstructorOverloading("overloading");
	
	//calling overloaded constructor
	ConstructorOverloading cons1=new ConstructorOverloading("overloaded Consructor", "overloaded from existing constructor");
	
	//calling overloaded constructor
	ConstructorOverloading cons2=new ConstructorOverloading(1, "overloaded from overloaded consructor");
	
	
	System.out.println(cons.name);
	System.out.println(cons1.name+" "+cons1.description);
	System.out.println(cons2.id+" "+cons2.type);
}


}
