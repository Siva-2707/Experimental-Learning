
public class CarBuilder {
	
	private Car car = new Car();
	
	public CarBuilder withName(String name) {
		car.setName(name);
		return this;
	}
	
	public CarBuilder ofType(TYPE type) {
		car.setType(type);
		return this;
	}
	public CarBuilder ofColor(String colour) {
		car.setColor(colour);
		return this;
	}
	
	public Car build() {
		return car;
		
	}
}
