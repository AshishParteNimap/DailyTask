package Test;

class Student{
	private String name;
	private int id;
	private String standard;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getStandard() {
		return standard;
	}
	public void setStandard(String standard) {
		this.standard = standard;
	}
	
	
	
}
public class Encapsulation {

	public static void main(String[] args) {
		
		Student student=new Student();
		student.setId(1);
		student.setName("ashish");
		student.setStandard("first");
		
		System.out.println("Student id is :"+student.getId());
		System.out.println("Student name is :"+student.getName());
		System.out.println("Student standard is :"+student.getStandard());
	}

}
