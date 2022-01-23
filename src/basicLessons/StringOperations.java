package basicLessons;

public class StringOperations {

	//String is a class in java immumtable, 
	
	
	
	
	//2. with class
	String strobj= new String("This is String with class obj");
	
	
	public void StringExamples() {
		//1. declaration
		
		String s = "This is String datatype expample ";
		String s2="This is String datatype expample ";
		String s3= "with concatinate";
		String s4= "UPPERCASE";
		System.out.println(s.length());
		System.out.println(s.charAt(15));
		System.out.println(s.substring(15));
		System.out.println(s.substring(8, 15));
		//boolean return
		System.out.println(s.contains("datatype"));
		System.out.println(s.equals(s2));
		System.out.println(s.equalsIgnoreCase("this is String Datatype Expample "));
		System.out.println(s.isEmpty());
		System.out.println(s.concat(s3));
		System.out.println(s.replace('S', 'p'));
		//System.out.println(s.split(s, 5));
		System.out.println(s3.toUpperCase());
		System.out.println(s4.toLowerCase());
		
	}
	
	
	
	
	public static void main(String[] args) {
		StringOperations obj = new StringOperations();
		obj.StringExamples();
		//System.out.println(obj.s.substring(8, 15));

	}

}
