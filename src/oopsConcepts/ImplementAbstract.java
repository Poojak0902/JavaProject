package oopsConcepts;

public class ImplementAbstract extends AbstractclassExample {

	
	String str ="this is global variable";
	int a=10;
	int b  = 20;
	
	@Override
	void run() {
		System.out.println("this is run");
		
	}

	@Override
	String tyretype(String str) {
		System.out.println(str);
		return str;
	}
	
	
	
	
	
	
	
	public static void main(String[] args) {
		//any variable and method of both child and parent can be used
		ImplementAbstract obj = new ImplementAbstract();
		System.out.println(obj.a);
		obj.tyretype(null);
		obj.enginetype(null);
		
		//while using ref from parent class you can not use the properties of Child class
		
		AbstractclassExample abc = new ImplementAbstract();
		System.out.println(abc.tyretype("30inches"));
		System.out.println(abc.enginetype("basics"));
		
		
		
		
	}

	

}
