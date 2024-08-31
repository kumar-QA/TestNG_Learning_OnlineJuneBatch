package c_compartor;

import java.util.Comparator;

public class Student {

	String name;
	int fee;
	int age;

	Student(String name, int fee, int age) {
		this.name = name;
		this.fee = fee;
		this.age = age;
	}
	
}
class nameCompartor implements Comparator<Student>{
	@Override
	public int compare(Student o1, Student o2) {
		return o1.name.compareTo(o2.name);
	}
	
}

class feeCompartor implements Comparator<Student>{

	@Override
	public int compare(Student o1, Student o2) {
		if(o1.fee==o2.fee) {return 0;}
		else if(o1.fee>=o2.fee){
			return 1;
		}else {
			return -1;
		}
	}
	
}
class ageCompartor implements Comparator<Student>{

	@Override
	public int compare(Student o1, Student o2) {
		if(o1.age==o2.age) {return 0;}
		else if(o1.age>=o2.age){
			return 1;
		}else {
			return -1;
		}
	}
	
}