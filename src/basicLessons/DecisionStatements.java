package basicLessons;

public class DecisionStatements extends Datatypes{
	//global declaration
	static char [] ch = {'a','b','c','d','e','f','g','h','g'};
	
	public void ifelse() {
		String s ="comparison java";
		int i = 10;
		int b= 20;
		int c= i+b;
		
		if (s.contains("not")) {
			System.out.println("this is correcrt condition");
			
		}else if (s.contains("oct")) {
			System.out.println("this is correcrt condition with else if ");
		}
		else if (c==30 && c == 40) {
			System.out.println("this is 2nd if else with int ");
		}else {
			System.out.println("This is not correct");
		}
		
	}
	public void nestedif() {
		String str = "This is str";
		int a = 10;
		int b=20;
		if (str.equalsIgnoreCase("pooja")) {
			System.out.println("this is first if and code is entering into loop");
			System.out.println("this is the addition of int variables >>> "+ (a+b));
		if (a+b<40) {
			System.out.println("this is first nested  if and code is entering into loop");
			if (str.contains("pooja")) {
				System.out.println("this is 2nd nested  if and code will not entering into loop");
			}
		}else {
			System.out.println("this is else of nested ");
		}	
		}else {
			System.out.println("This is parent if . ");
		}
		
	}
	
	//Switch statement conditional statement
	public void switchcase() {
		String str = "Friday";
		
		switch (str) {
		case "Monday": {
			
			System.out.println("Its blue day");
			break;
		}
		case "Tuesday": {
			
			System.out.println("Its fine day");
			break;
			
		}
		case "Friday": {
			
			System.out.println("Its Party day");
			break;
		}
		default:
			System.out.println("its no switch day ");
			//throw new IllegalArgumentException("Unexpected value: " + str);
		}
		//System.out.println("Out of switch");
	}
	//Loop Statement
	public void forloop() {
		int a= 5;
		for (int i = 0; i < a; i++) {
			System.out.println("this is the index>> "+ i +" "+ a);
			
		}
		
	}
	
	public void forexamplewithArray() {
		//array created for for loop 
		char [] ch = {'a','b','c','d','e','f','g','h','g'};
		int [] in = {11,12,13};
		for (int i = 0; i < ch.length; i++) {
			System.out.println("this is the index>> "+ i +"Value if ch "+ ch[i]);
			for (int j = 0; j < in.length; j++) {
				System.out.println("this is the index>> "+ j +"Value if in "+ in[j]);
			}
			
		}
	}
	//for each
	public void foreachexample() {
		int [] in = {11,12,13};
		for (int i : in) {
			System.out.println("Print the value of i "+ i);
		}
	}
	//while 
	
	public void Whileloopeample() {
		int i = 5;
		
		while (i==5) {
			
			System.out.println("this is correct condition");
			i++;
		}
		System.out.println("while is not executomg ");
	}
	public static void main(String[] args) {
		DecisionStatements obj = new DecisionStatements();
		obj.printint();
		obj.intreturntype(10, 200);
		//obj.nestedif();
		//obj.ifelse();
		//obj.switchcase();
		//obj.forloop();
		//obj.forexamplewithArray();
		//obj.foreachexample();
		//obj.Whileloopeample();

	}

}
