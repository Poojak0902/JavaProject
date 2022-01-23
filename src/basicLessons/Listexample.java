package basicLessons;

import java.util.ArrayList;
import java.util.List;

public class Listexample {
	
	
	public void listexample() {
		List<String> lst = new ArrayList<String>();
		//List<Integer> lst2 = new ArrayList<Integer>();
		lst.add("Pooja");
		lst.add("Ajay");
		lst.add("Anu");
		lst.add("Java");
		System.out.println(lst.get(0));
		lst.set(0, "Java");
		System.out.println(lst.size());
		for (int i = 0; i < lst.size(); i++) {
			System.out.println(i + lst.get(i));
			// use if statement
		}
		/*
		 * for (String str: lst) { System.out.println("this is for each loop>>> "+str );
		 * }
		 */
		
	}
	// create more List types
	
	public static void main(String[] args) {
		Listexample listeample = new Listexample();
		listeample.listexample();
	}

}
