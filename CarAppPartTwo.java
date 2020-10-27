package carSales;
import java.util.*;

public class CarAppPartTwo {
	public static Scanner JavaInput = new Scanner(System.in);
	public static List<Car> cars = new ArrayList<>();
	static {
		cars.add(new Car("Subaru", "Impreza", 2020, 24000.000));
		cars.add(new Car("Dodge", "Ram", 2020, 30000.000));
		cars.add(new Car("Ford", "Focus", 2020, 18000.000));
		cars.add(new UsedCar("Toyota", "Prius", 2016, 4500, 56000.000));
		cars.add(new UsedCar("Dodge", "Grand Caravan", 2014, 3000, 88000.000));
		cars.add(new UsedCar("Honda", "Fit", 2018, 12000, 59000.000));
		
	}

	public static void main(String[] args) {
		Scanner JavaInput2 = new Scanner(System.in);
		listCars();
		System.out.println("Which car would you like?");
		int carChoice = JavaInput.nextInt();
		if (carChoice == 0) {
			System.out.println("Subaru Impreza 2020 $24000.00");
		}
		else if (carChoice == 1) {
			System.out.println("Dodge Ram 2020 $30000.00");
		}
		else if (carChoice == 2) {
			System.out.println("Ford Focus 2020 $18000.00");
		}
		else if (carChoice == 3) {
			System.out.println("Toyota Prius 2016 4500 $56000.00");
		}
		else if (carChoice == 4) {
			System.out.println("Dodge Grand Caravan 2014 3000 $88000.00");
		}
		else if (carChoice == 5) {
			System.out.println("Honda Fit 2018 12000 $59000.00");

		}
		else {
			System.exit(0);
		}
		
		System.out.println("Would you like to buy this car? (y/n)");
		String userResponse = JavaInput2.nextLine();
		if (userResponse.contains("y")) {
			System.out.println("Excellent! Our finance deparment will be in touch shortly.");
		}

	}
	public static void listCars() {
		for (int i = 0; i < cars.size(); i++) {
			System.out.println("Car " + (i) + ": " + cars.get(i));
		}
	}
	public static void showCarsById(int id) {
		System.out.println(cars.get(id));
		
	}
	public static void buyCar(int id) {
		cars.remove(id);
		
	}

}
