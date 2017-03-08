package zadaci_07_03_2017;

import java.util.ArrayList;
import java.util.Date;

public class Zadatak4ArrayListUse {

	public static void main(String[] args) {
		ArrayList<Object> o = new ArrayList<Object>();
		o.add(new Loan());		
		o.add(new Date());		
		o.add(new String("String class"));	
		o.add(new Circle());	

		// Display all the elements in the list by 
		// invoking the object’s toString() method
		for (int i = 0; i < o.size(); i++) {
			System.out.println((o.get(i)).toString());
		}
	}

}
