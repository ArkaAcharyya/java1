package Has_a.Composition;

public class Car {
	Engine engine;
	public Car() {
		engine=new Engine();
	}
	public void print() {
		engine.display();
		System.out.println("Car is running");
	}
}
