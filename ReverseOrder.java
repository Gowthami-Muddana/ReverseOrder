package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ReverseOrder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> l = new ArrayList<String>();  
        l.add("Mango");  
        l.add("Banana");  
        l.add("Mango");  
        l.add("Apple");  
        
        System.out.println("Before Reversing");  
        System.out.println(l);  
          
        Collections.reverse(l);  
        System.out.println("After Reversing");  
        System.out.println(l);  
	}

}
