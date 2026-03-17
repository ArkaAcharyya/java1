package Car_Example;

import java.util.Scanner;

public class Driver_class {

	static Scanner userInput = new Scanner(System.in);
    
    public static void main(String[] args) {
        Car car = new Car();
        System.out.println("Which Engine to fit?");
        System.out.println("1. Petrol engine");
        System.out.println("2. Diesel engine");
        System.out.print("Enter your choice: ");
        byte userChoice = userInput.nextByte();
        userInput.nextLine();
        switch (userChoice) {
        case 1:
            PetrolEngine petrolEngine = new PetrolEngine();
            car.engine = petrolEngine;
            break;
        case 2:
            DieselEngine dieselEngine = new DieselEngine();
            car.engine = dieselEngine;
            break;
            
        default:
            PetrolEngine petrolEngine1 = new PetrolEngine();
            car.engine = petrolEngine1;
            break;
        }
        switch (userChoice) {
		case 1:
			PetrolEngine petrolEngine=(PetrolEngine) car.engine;
			petrolEngine.startEngine();
			break;
		case 2:
			DieselEngine dieselEngine=(DieselEngine) car.engine;
			dieselEngine.startEngine();
			break;

		default:
			PetrolEngine petrolEngine1=(PetrolEngine) car.engine;
			petrolEngine1.startEngine();
			break;
		}
    }

}
