package task;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Task3 {
	
	public static void main(String[] args) {

		  ArrayList<Integer> list = new ArrayList<>();  
		  
	        list.add(1);  
	        list.add(4);  
	        list.add(6);  
	        list.add(7);  
	        list.add(2);  
	  Collections.sort(list);
	  list.set(1,5);
	        System.out.println(list.contains(6));
	        
	        Iterator<Integer> it = list.iterator();  
	        while (it.hasNext()) {                   
	Integer value = it.next();              
	            System.out.println("List Value:" + value);  
	            if (value.equals(4))  
	                list.remove(value);  
	        }  
	  
	}

}
