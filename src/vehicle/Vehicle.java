package vehicle;

public abstract class Vehicle {

	protected int id; /* 3) Encapsulation */
	private String owner; /* 3) Encapsulation */
	private String brand; /* 3) Encapsulation */
	private double mileage; /* 3) Encapsulation */
	protected int wheels; /* 3) Encapsulation */
	private int year; /* 3) Encapsulation */
	private int capacity; /* 3) Encapsulation */
	
	/* === Constructor === */
	public Vehicle(String owner, String brand, double mileage) {
		this.owner = owner;
		this.brand = brand;
		this.mileage = mileage;
		this.id = (int)(Math.random() * 100000 + 1);
	}
	
	/* === Getters === */
	public int getId() {
		return id;
	}
	
	public String getOwner() {
		return owner;
	}
	
	public String getBrand() {
		return brand;
	}
	
	public double getMileage() {
		return mileage;
	}
	
	public int getWheels() {
		return wheels;
	}
	
	public int getYear() {
		return year;
	}
	
	public int getCapacity() {
		return capacity;
	}
	
	/* === Setters === */
	public void setWheels(int wheels) {
		this.wheels = wheels;
	}
	
	public void setYear(int year) {
		this.year = year;
	}
	
	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

	/* === Overrides === */ /* 4) Polymorphism */
	@Override
	public String toString() {
		return "Vehicle [id=" + id + ", owner=" + owner + ", brand=" + brand + ", mileage=" + mileage + ", wheels=" + wheels + ", year="
				+ year + ", capacity=" + capacity + "]";
	}
	
}
