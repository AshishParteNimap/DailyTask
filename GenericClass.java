package Test;

import java.util.ArrayList;
//Generic class 
public class GenericClass<T> {
	private T t;
	
	public void addObj(T obj) {
		this.t=obj;
	}
	
	public T getObj() {
		return this.t;
	}
	public static void main(String[] args) {
		
		//no need of typecasting in generic class
		
		GenericClass<String> gen=new GenericClass<>();
		gen.addObj("ashish");
		System.out.println(gen.getObj());
		
		GenericClass<Integer> genInt=new GenericClass<>();
		genInt.addObj(100);
		System.out.println(genInt.getObj());
		
		GenericClass<Character> genChar=new GenericClass<>();
		genChar.addObj('A');
		System.out.println(genChar.getObj());
	}

}
