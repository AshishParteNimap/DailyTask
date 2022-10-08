package Test;

public class Test1 {

	//primitive datatype
			int a=1;
			long l=100;
	//reference datatype
			String name="hello";
	public static void main(String[] args) {
		int b=18;
		long d=2089;
		
		String newName="nameOfInstitute";
		System.out.println("primitive datatypes :"+b+" "+d);
		
		
		Test1 primitive=new Test1();
		System.out.println("primitive datatype :"+primitive.a);
		System.out.println("primitive datatype :"+primitive.l);

		//reference datatype
		Test1 obj1=new Test1();
		
		Test1 refrenceObj=obj1;
		refrenceObj.name="Nimap Infoetch";
		refrenceObj.a=23;
		
		System.out.println("reference datatype :"+refrenceObj.a);
		System.out.println("reference datatype :"+refrenceObj.name);
		
		
	}

}
