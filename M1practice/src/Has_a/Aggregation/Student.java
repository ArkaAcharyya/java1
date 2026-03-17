package Has_a.Aggregation;

public class Student {
	Address address;
    String name;
    int roll;
    public Student(Address address, String name, int roll){
        this.address=address;
        this.name=name;
        this.roll=roll;
    }
    public void print(){
        System.out.println("Name is: "+name +" Roll is:"+ roll);
        address.display();
    }
}
