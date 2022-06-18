package garageSystem;

import java.util.Arrays;

import vehicle.Vehicle;

public class Garage {

	private String name; /* 3) Encapsulation */
	private int maxCapacity; /* 3) Encapsulation */
	private double priceByWheelChange; /* 3) Encapsulation */
	private int totalVehicles = 0; /* 3) Encapsulation */
	private Vehicle[] vehicles; /* 3) Encapsulation */
	
	/* === Constructor === */
	Garage(int maxCapacity, double priceByWheelChange) {
		this.maxCapacity = maxCapacity;
		this.priceByWheelChange = priceByWheelChange;
		this.vehicles = new Vehicle[this.maxCapacity];
	}

	/* === Getters === */
	public String getName() {
		return name;
	}

	public int getMaxCapacity() {
		return maxCapacity;
	}

	public double getPriceByWheelChange() {
		return priceByWheelChange;
	}
	
	public double getPriceForChangeWheelsOfAllVehicles() {
		double value = 0;
		for (Vehicle vehicle : vehicles) {
			if (vehicle != null) {
				value += priceByWheelChange * vehicle.getWheels();
			}
		}
		return value;
	}
	
	public double getAverageMileageOfAllVehicles() {
		double value = 0;
		for (Vehicle vehicle : vehicles) {
			if (vehicle != null) {
				value += vehicle.getMileage();
			}
		}
		return value / totalVehicles;
	} 

	public Vehicle[] getVehicles() {
		return vehicles;
	}
	
	public int getTotalVehicles() {
		return totalVehicles;
	}
	
	public Vehicle getVehicle(int id) {
		Vehicle value = null;	
		for (int i = 0; i < vehicles.length; i++) { 
			if (vehicles[i] != null && id == vehicles[i].getId()) {			
				value = vehicles[i];
			}
		}
		if (value == null) {
			System.out.println("The Vehicule with the provided ID was not found.");
		}
		return value;
	}
	
	/* === Setters === */
	public void setName(String name) {
		this.name = name;
	}
	
	/* === Functions === */
	public boolean addVehicle(Vehicle vehicle) {
		boolean isAdded = false;
		for (int i = 0; i < vehicles.length; i++) {
			if (vehicles[i] == null) {
				vehicles[i] = vehicle;
				isAdded = true;
				totalVehicles += 1;
				return isAdded;
			}
		}
		
		if (!isAdded) {
			System.out.println("The Garage has no available space at this time. Capacidad maxima: " + maxCapacity + "." + "(AVISO)");
		}
	
		return isAdded;
	}
	
	public boolean removeVehicle(int id) {
		Vehicle[] value = new Vehicle[this.maxCapacity];
		boolean isRemoved = false;
		for (int i = 0; i < vehicles.length; i++) { 
			if (vehicles[i] != null && id == vehicles[i].getId()) {			
				vehicles[i] = null;
				totalVehicles -= 1;
				isRemoved = true;
			}
			value[i] = vehicles[i];
		}
		
		if (!isRemoved) {
			System.out.println("The Vehicule to remove with the provided ID was not found.");
		}

		return isRemoved;
	}

	/* === Overrides === */ /* 4) Polymorphism */
	@Override
	public String toString() {
		return "Garage [name=" + name + ", maxCapacity=" + maxCapacity + ", priceByWheelChange=" + priceByWheelChange
				+ ", vehicles=" + Arrays.toString(vehicles) + "]";
	}
	
}
