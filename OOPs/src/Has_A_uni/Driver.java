package Has_A_uni;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Engine e=new Engine();
//		System.out.println(e.noOfCyl);
		Engine engine=new Engine();
		Car car=new Car();
		//fixing engine inside car
		car.engine=engine;
		System.out.println("Car.col: "+ car.col);
		System.out.println("Car.engine: "+car.engine);
	}

}
