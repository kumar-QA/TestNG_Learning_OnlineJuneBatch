package c_comparable;

import java.util.ArrayList;
import java.util.Collections;

public class EmployeeSort {

	public static void main(String[] args) {
	
		ArrayList<Employee>al=new ArrayList<Employee>();
		al.add(new Employee("kumar", 40000, "SDET"));
		al.add(new Employee("kishore", 90000, "developer"));
		al.add(new Employee("sai", 20000, "UITester"));
		al.add(new Employee("amesh", 2000, "manualTester"));
		
		Collections.sort(al);
		
		for (Employee employee : al) {
			System.out.println(employee.Empname+" "+employee.Empsal+" "+employee.Empdesignation);
		}
		
 	}

}
