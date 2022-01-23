package oopsConcepts;

public class EncapsulationExample {

	
private	String airlineName ="Air Canada" ;
//private	String airlineName  ;
private	String destination  ;
private	String departure  ;
	// get and set methods

// when we use only get method mens that is only read property
	public String getAirlinename() {
	return 	airlineName;
	}
	
	// Whenever you will use get & set together it will be read & write 
	public void setdestination (String destination ) {
		this.destination= destination;
	}
	
	public String getDestination() {
		return 	destination;
		}
	
	public void setdeparture (String departure ) {
		this.departure= departure;
	}
	
	public String getdeparture() {
		return 	departure;
		}
	

}
