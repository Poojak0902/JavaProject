package basicLessons;

import oopsConcepts.ClassA;

public class Datatypes extends ClassA {

	
	public void runjava() {
		
	System.out.println("This is my first program");
		
	}
	public void runjava2() {
		
		System.out.println("This is my 2nd program");
			
		}
	
	//Datatypes>> Primitive datatypes>> Byte, boolean, char, int, Long, Double,short
	 Boolean b = true;
	
	//2.int -2456789765 to 2569474879
	 
	 public  void printint(){
		 int i = 5468565;
		 System.out.println("the vale of int is >>"+ i);
		 System.out.println("the vale of int is >>"+ l);
		 
	 }
	 public double intreturntype(int a, int b, double d, int e) {
		 double  c=a+b+d+e;
		 System.out.println(" the addition is from with in method >> "+ c);
		 return c;
	 }
	 public String stringConcatinate(String str,String str2) {
		 
			String str3 = str.concat(str2);
			System.out.println(str3);
			System.out.println(" this is from child class");
			return  str3;
		}
	//.long 
	 long l = 4379708445L;
	//float
	 float f= 12.3f;
	 //double 
	 double d = 345.7844;
	 
	 //char
	 char c= 'A';
	
	public static void main(String[] args) {
		Datatypes obj = new Datatypes();
		//ClassA classA= new ClassA();
		// ClassA classA= new ClassA();
		obj.stringConcatinate("this is nothing   " , "this is everything ");
		
		obj.intreturntype(10, 20, 30.00, 5);
		
		
		
		  obj.runjava(); 
		  obj.runjava2();
		  System.out.println("print default boolean value>> "+ obj.b);
		  obj.printint();
		  System.out.println("print long datatype value>> "+ obj.l);
		  System.out.println("print float datatype value>> "+ obj.f);
		  System.out.println("print double datatype value>> "+ obj.d);
		  System.out.println("print double datatype value>> "+ obj.c);
	}

}
