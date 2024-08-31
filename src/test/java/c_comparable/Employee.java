package c_comparable;

public class Employee implements Comparable<Employee> {
	String Empname;
	int Empsal;
	String Empdesignation;
	
	Employee(String Empname,int Empsal,	String Empdesignation){
		this.Empname=Empname;
		this.Empsal=Empsal;
		this.Empdesignation=Empdesignation;	
	}

	@Override
	public int compareTo(Employee o) {
		  return this.Empname.compareTo(o.Empname);
	}
}
