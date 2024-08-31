package c_compartor;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class StudentImp {

	public static void main(String[] args) {
		ArrayList<Student> al = new ArrayList<Student>();
		al.add(new Student("kumar", 10000, 24));
		al.add(new Student("prasanna", 5000, 30));
		al.add(new Student("sai", 3000, 20));
		al.add(new Student("krishna", 11000, 19));

		Collections.sort(al, new nameCompartor());
		Iterator<Student> itr = al.iterator();
		while (itr.hasNext()) {
			Student s=itr.next();
			System.out.println(s.name+" "+s.age+" "+s.fee);
		}

	}

}
