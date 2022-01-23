package oopsConcepts;

public class ClassA extends EncapsulationExample{

	/// Object , class, Inheritence , polymorphism, Abstraction, Encapsulations
	int rollnumber;
	String name;
	int marks ;

	// constructor: Default , Parameterised
	
	  public ClassA() { 
		  System.out.println("this is class A"); 
		  }
	 

	 ClassA(int r, String n) {
		rollnumber = r;
		name = n;
		System.out.println(" this is rollnumber >> " + r + "  " + "this is name of student   " + name);
	}
	ClassA(int r, String n, int m) {
		rollnumber = r;
		name = n;
		marks = m;
		System.out.println(" this is rollnumber >> " + r + "  " + "this is name of student   " + name + " These are the marks  "+ m);
	}
	//Method with different parameter
	public void studentrecord(int r, String n) {

		rollnumber = r;
		name = n;
		System.out.println(" this is rollnumber >> " + r + "  " + "this is name of student   " + name);

	}
	
	//Method with returntypes with parameter
	
	public String stringReturntype(String str) {
		System.out.println(str);
		
		return str;
		
	}
	// without parameter now converted to parameter
	public String stringConcatinate(String str,String str2) {
		 
		String str3 = str.concat(str2);
		System.out.println(str3);
		return  str3;
	}
	 public int intreturntype(int a, int b) {
		 int c=a+b;
		 System.out.println(" the addition is from with in method >> "+ c);
		 return c;
	 }

	 
	 //poly >> multi morphism>> shapes >> overloading & overriding 
	 //method over loading 
	 public int intreturntype(int a, int b, int d) {
		 int c=a+b+d;
		 System.out.println(" the addition is from with in method >> "+ c);
		 return c;
	 }
	 public long intreturntype(int a, int b, int d,int e) {
		 long c=a+b+d+e;
		 System.out.println(" the addition is from with in method >> "+ c);
		 return c;
	 }
	 public void intreturntype() {
		 System.out.println("this is without parameter");
		// int c;
			/*
			 * long c=int a+b+d+e;
			 * System.out.println(" the addition is from with in method >> "+ c);
			 */
		 //return c;
	 }
	 
	 
	 
	 
	 
	 
//}

//class ClassB{
	public static void main(String[] args) {
		ClassA obj = new ClassA();
		/*
		 * obj.stringReturntype("This is java"); obj.stringReturntype("this is c++");
		 * obj.stringConcatinate("this is Pooja " ,"She is QE" ); obj.intreturntype(100,
		 * 200); int z = obj.intreturntype(10, 20);
		 * System.out.println(" the addition is >> "+ z);
		 */
		//I am getting Airlines
		System.out.println(obj.getAirlinename());
		
		//I am settimg & getting destination
		obj.setdestination("Europe");
		System.out.println(obj.getDestination());
		
		//I am settimg & getting destination
		obj.setdeparture("YYZ");
		System.out.println(obj.getdeparture());
		
		
		
		//String str =  obj.stringConcatinate("this is Pooja " ,"She is QE" );
		//obj.stringConcatinate();
		
		
		/*
		 * ClassA obj2 = new ClassA(56, "Ajay"); obj2.studentrecord(987,"sim"); ClassA
		 * obj3 = new ClassA(57, "Anu"); new ClassA(76, "Pooja", 10);
		 * 
		 * 
		 * System.out.println(obj); System.out.println(obj2); System.out.println(obj3);
		 */
		
		/*
		 * System.out.println(obj.rollnumber=43546);
		 * System.out.println(obj.name="Ajay");
		 * 
		 * obj.studentrecord(75849, "Ajay");
		 * 
		 * ClassA obj2 = new ClassA(); obj2.studentrecord(6574, "Anu");
		 * 
		 * 
		 * obj2.rollnumber=43547; obj2.name="Anu";
		 * System.out.println(obj2.rollnumber=43547);
		 * System.out.println(obj2.name="Anu");
		 * 
		 * 
		 * //}
		 */
	}

}
