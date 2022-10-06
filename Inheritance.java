package Test;
//Super Class(Parent)
public abstract class Inheritance {
	int empId;
	String empName;
	int empSalary;
	String profile;
	int bonus;
	
	public int bonus(int bonus) {
		return this.bonus=bonus;
	}
	
	public void empDetails(int id,String name,int salary,String profile) {
		this.empId=id;
		this.empName=name;
		this.profile=profile;
		this.empSalary=salary;
	}
	
}
	//Sub Class(Child)
class developer extends Inheritance{
	public static void main(String[] args) {
		
	
	developer dv=new developer();
	//Method inherited from Parent class
	dv.empDetails(1, "ashish", 10000, "developer");
	dv.bonus(25000);
	
	System.out.println("Employee Id: "+dv.empId+" Employee Name: "+dv.empName+" Employee Salary: "+dv.empSalary+" Employee Profile: "+dv.profile);
	System.out.println("bonus will be :"+dv.bonus);
	}
}

//Sub Class(child)
class accountant extends Inheritance{

	public static void main(String[] args) {
		accountant ac=new accountant();
		
		//Method inherited from Parent class
		ac.empDetails(1, "sandesh", 13000, "mechanic");
		ac.bonus(10000);
		
		System.out.println("Employee Id: "+ac.empId+" Employee Name: "+ac.empName+" Employee Salary: "+ac.empSalary+" Employee Profile: "+ac.profile);
		System.out.println("Bonus for diwali will be :"+ac.bonus);
	}
}
