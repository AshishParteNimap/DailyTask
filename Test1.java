package Test;

public class Test1 {

	//primitive datatype
			int a=1;
			String name="Nimap";
	public static void main(String[] args) {
		int b=18;
		String newName="nameOfInstitute";
		System.out.println(b+" primitives "+newName);
		
		
		Test1 primitive=new Test1();
		System.out.println("primitive datatype :"+primitive.a);
		System.out.println("primitive datatype :"+primitive.name);

		//refrence datatype
		Test1 obj1=new Test1();
		
		Test1 refrenceObj=obj1;
		refrenceObj.name="Nimap Infoetch";
		refrenceObj.a=23;
		
		System.out.println("refrence datatype :"+refrenceObj.a);
		System.out.println("refrence datatype :"+refrenceObj.name);
		
		
	}

}
