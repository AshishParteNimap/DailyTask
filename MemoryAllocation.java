package Test;


 class memory{
	 //primitive and refrence variable store in stack
	String memoryName;
	int space;
		
	}

public class MemoryAllocation {
	public static void main(String[] args) {
		
		//object store in heap memory
		memory mem=new memory();
		
		//refrence store in stack memory
		memory newMem=mem;
		newMem.memoryName="heap";
		mem.space=100;
		
		System.out.println(newMem.memoryName);
		
		System.out.println(mem.space);
		
	}
}