package garageSystem;
import vehicle.Car;
import vehicle.Motorcycle;
import vehicle.Vehicle;

public class GarageTest {

	public static void main(String[] args) {
		
		Garage garage = new Garage(5, 100); /* 1) Abstraccion */
		garage.setName("Garage California");
		
		System.out.println("====== Garage Info ======");
		System.out.println(garage);
		System.out.println("");
		
		System.out.println("====== Total the Vehicules ======");
		System.out.println(garage.getTotalVehicles());
		System.out.println("");
		
		// Vehicles Creation
		Car car1 = new Car("Ruben Chirino", "Toyota", 33.000, 4); /* 1) Abstraccion */
		Car car2 = new Car("Maria Murillo", "Nissan", 67.000, 2); /* 1) Abstraccion */
		Car car3 = new Car("Alejandra Rodriguez", "Mercedes Benz", 67.000, 2); /* 1) Abstraccion */
		Car car4 = new Car("Elias Alvarez", "BMW", 1.000, 2); /* 1) Abstraccion */
		Motorcycle motorcycle1 = new Motorcycle("Cesar Hernandez", "Yamaha", 3.000, 998); /* 1) Abstraccion */
		Motorcycle motorcycle2 = new Motorcycle("Valentina Caseres", "Honda", 12.000, 286); /* 1) Abstraccion */
		Motorcycle motorcycle3 = new Motorcycle("Bruno Martinez", "Suzuki ", 99.000, 544); /* 1) Abstraccion */
		
		// The Vehicles enter the garage
		garage.addVehicle(car1);
		garage.addVehicle(motorcycle1);
		garage.addVehicle(car2);
		garage.addVehicle(motorcycle2);
		garage.addVehicle(motorcycle3);
		
		System.out.println("Some Vehicules enter to the garage...");
		System.out.println("");
		
		// Total the Vehicles in the Garage
		System.out.println("====== Total the Vehicules ======");
		System.out.println(garage.getTotalVehicles());
		System.out.println("");
		
		System.out.println("A new Vehicules want to enter to the garage...");
		System.out.println("");
		
		// No Spaces avaibles in the Garage for this Car
		garage.addVehicle(car3);
		
		System.out.println("");
		System.out.println("Some Vehicules leave the garage...");
		
		// A Vehicles leaves the garage
		garage.removeVehicle(car1.getId());
		garage.removeVehicle(motorcycle2.getId()); 
		System.out.println("");
		
		// Total the Vehicles in the Garage
		System.out.println("====== Total the Vehicules ======");
		System.out.println(garage.getTotalVehicles());
		System.out.println("");
		
		// Others Vehicles enter the garage
		garage.addVehicle(car3);
		garage.addVehicle(car4);
		
		System.out.println("And the Garage is full again...");
		System.out.println("");
		
		System.out.println("====== Total the Vehicules ======");
		System.out.println(garage.getTotalVehicles());
		System.out.println("");
		
		System.out.println("******* Print All Info *******");
		
		// Garage
		System.out.println(garage);
		System.out.println("");
		
		// Prices
		System.out.println("== Garage Prices ==");
		System.out.println("Price for change the wheels of all the vehicles: " + garage.getPriceForChangeWheelsOfAllVehicles());
		System.out.println("The average mileage of all vehicles in the garage: " + garage.getAverageMileageOfAllVehicles());
		System.out.println("");
		
		// All the Vehicules in the Garage
		System.out.println("== All the Vehicules in the Garage ==");
		Vehicle[] allVehicules = garage.getVehicles();
		for (Vehicle vehicle : allVehicules) {
			if (vehicle != null) {
				System.out.println(vehicle);
			}
		}
		System.out.println("");
	}

}
