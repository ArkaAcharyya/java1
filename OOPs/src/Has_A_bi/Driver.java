package Has_A_bi;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Engine engine = new Engine();
		Car car = new Car();
		car.engine=engine;//engine assigned to car
		engine.car=car;//car assigned to engine
		//System.out.println(engine.car.color);
		Engine yehCarMeinJoEngineHain=car.engine;
		Car car2=yehCarMeinJoEngineHain.car;
		Engine e3=car2.engine;
		//System.out.println(e3==yehCarMeinJoEngineHain);
		

	}

}
