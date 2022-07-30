package vehicle;

public class Car extends Vehicle { /* 2) Heritage */

	private int doors; /* 3) Encapsulation */
	
	/* === Constructor === */
	public Car(String owner, String brand, double mileage, int doors) {
		super(owner, brand, mileage);
		this.doors = doors;
		this.wheels = 4;
	}
	
	/* === Getters === */
	public int getDoors() {
		return doors;
	}

	/* === Overrides === */ /* 4) Polymorphism */
	@Override
	public String toString() {
		return "Car" + super.toString() + "[doors=" + doors + "]";
	}
	
}
