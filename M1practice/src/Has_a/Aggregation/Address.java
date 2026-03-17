package Has_a.Aggregation;

public class Address {
	String city;
    String state;
    String country;
    
    public Address(String city, String state, String country){
        this.state  =state;
        this.city=city;
        this.country=country;
    
    }
    public void display(){
        System.out.println("Country is: "+country+" State is: "+state+" City is: "+city);
    }
}
