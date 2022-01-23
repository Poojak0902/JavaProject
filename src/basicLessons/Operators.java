package basicLessons;

public class Operators extends DecisionStatements{

	//operators of airthmetic >> +-*/%
	
	int a = 10;
	int b=20;
	int c;
	
	public  void Addition() {
		System.out.println("This is my addition function  "+(c=a+b));
		
	}
	
	public void mulitplication() {
		System.out.println("This is my multiplication function  "+(c=a*b));
		
	}
	
	
	//urnary operators>> int a=10 a++,a--,++a,--a
	public void urnaryOperators() {
		int i = 10;
		int f=2;
		System.out.println("i:>> "+ (i++ + f));
		System.out.println("i:>> "+(i+f));
		System.out.println("Value of i afte i++>> "+ i );
		System.out.println("i:>> "+ i--);
		System.out.println("i:>> newvalue of i with i--"+ i);
		
		//--i,++i
		System.out.println("Value of i afte ++i>> "+ ++i );
		System.out.println("Value of i afte --i>> "+ --i );
		}
	
	
	//logical &&, bit &  true false
	public void andOperator() {
		int a =10;
		int b = 7;
		int c=11;
	//in logical && if first is flase it is not going to 2nd	
	System.out.println("This is logical && >> "+ (a>b && a++>c));
	//in logical & regradless of first condition true of false if is going to check both
	System.out.println("This is logical && >> "+ (a<b & ++a==c));
	
	// logical || bit |
	System.out.println("This is logical or >> "+ (a>b || a>c));
	//in logical & regradless of first condition true of false if is going to check both
	System.out.println("This is logical or >> "+ (a<b | a==c));
	}
	
	
	
	public static void main(String[] args) {
		//object of the class
		Operators obj = new Operators();
		//obj.urnaryOperators();
		obj.andOperator();
		
		/*
		 * obj.Addition();
		 * System.out.println("This is my subtraction>>>"+(obj.c=obj.a-obj.b));
		 * obj.mulitplication();
		 * System.out.println("This is my division>>>"+(obj.c=obj.a/obj.b));
		 * System.out.println("This is my moduldu>>"+(obj.c=obj.a%obj.b));
		 */
	}

}
