package vehicle;

public class Motorcycle extends Vehicle { /* 2) Heritage */

	private int displacement; /* 3) Encapsulation */
	
	/* === Constructor === */
	public Motorcycle(String owner, String brand, double mileage, int displacement) {
		super(owner, brand, mileage);
		this.displacement = displacement;
		this.wheels = 2;
	}

	/* === Getters === */
	public int getDisplacement() {
		return displacement;
	}
 
	/* === Overrides === */ /* 4) Polymorphism */
	@Override
	public String toString() {
		return "Motorcycle" + super.toString() + "[displacement=" + displacement + "cc" + "]";
	}
	
}
