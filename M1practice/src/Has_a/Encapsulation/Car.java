package Has_a.Encapsulation;

public class Car {
	private Engine engine= new Engine();
	void print() {
		engine.display();
		System.out.println("Car is running");
	}
}
