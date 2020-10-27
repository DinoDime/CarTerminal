package carSales;
import java.util.*;

public class CarApp {
	public static Scanner JavaInput = null; 
	public static List<Car> cars = new ArrayList<>();
	
	public static void main(String[] args) {
		JavaInput = new Scanner(System.in);
		System.out.println("Welcome to Doc's car terminal admin page!");
		System.out.println("How many cars are your entering?");
		int numOfCars = JavaInput.nextInt();
		for (int i = 1; i <= numOfCars; i++) {
			System.out.println("Enter specifications for car " + i + " :");
			addCar();
		}
		JavaInput.close();
		System.out.println("Current Inventory: ");
		listCars();
	}                                                                                                                                                                                                                                             
	public static void addCar() {
		Car car = new Car();
		System.out.println("Make: ");
		JavaInput.next();
		car.setMake(JavaInput.nextLine());
		System.out.println("Model: ");
		car.setModel(JavaInput.nextLine());
		System.out.println("Year: ");
		car.setYear(JavaInput.nextInt());
		System.out.println("Price: ");
		car.setPrice(JavaInput.nextInt());
		JavaInput.nextLine();
		cars.add(car);
		
	}
	public static void listCars() {
		for (int i = 0; i < cars.size(); i++) {
			System.out.println("Car " + (i + 1) + ": " + cars.get(i));
		}
		
	}
}
