import java.util.ArrayList;

public class java_basics {

	public static void main(String args[]) {
		String[] arr = {"varun","Bhardwaj","Selenium","Trainer"};
		for(String a:arr) {
			System.out.println(a);
		}
		ArrayList a = new ArrayList();
		a.add(2);
		a.add("Selenium");
		System.out.println(a.get(1));
		String s = "Rahul is a boy";
		String b = "Thankyou";
		String[] splittedarray = s.split(" ");
		
		for(String ar:splittedarray) {
			System.out.println(ar);
		}
	}
	
	
}


/*
 * Strings
 * String s = "Varun";
 * String b = "Varun";
 * Only 1 object is created as s and b have same value
 * but different objects are created if we declare as:
 * String s = new String("Varun");
 * String b = new String("Varun");*/

//Static keyword gives access throughout the class(no need to create object)