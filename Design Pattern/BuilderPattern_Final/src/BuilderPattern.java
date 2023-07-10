class BuilderPattern{
	public static void main(String[] args) {
		Thread t1 = new CarThread(Car.getBuilder("Waganor", 2017).build());
//		Thread t2 = new CarThread(Car.getBuilder().ofName("I20").ofType(Type.HASHBACK).ofYear(2015).build());
		t1.start();
//		t2.start();
		
	}
}

class CarThread extends Thread{
	
	private Car car;
	
	public CarThread(Car car) {
		this.car = car;
	}
	
	
	@Override
	public void run() {
		System.out.println(car);
	}
}

class Car{
	private String name;
	private int year;
	private Type type;
	private Dimension dimension;
	
	public static Car getInstance() {
		return new Car();
	}
	public static Builder getBuilder() {
		return new Car().new Builder(null, 0);
	}
	public static Builder getBuilder(String name, int year) {
		return new Car().new Builder(name, year);
	}
	public final String getName() {
		return name;
	}
	public final void setName(String name) {
		this.name = name;
	}
	public final int getYear() {
		return year;
	}
	public final void setYear(int year) {
		this.year = year;
	}
	public final Type getType() {
		return type;
	}
	public final void setType(Type type) {
		this.type = type;
	}
	public final Dimension getDimension() {
		return dimension;
	}
	public final void setDimension(Dimension dimension) {
		this.dimension = dimension;
	}

	@Override
	public String toString() {
		return "Car [name=" + name + ", year=" + year + ", type=" + type + ", dimension=" + dimension + "]";
	}
	
	protected class Builder{
		
		public Builder(String name, int year) {
			Car.this.name = name;
			Car.this.year = year;
		}
		
		public Builder ofType(Type type) {
			setType(type);
			return this;
		}
		
		public Builder ofDimension(float length, float width, float height) {
			setDimension(new Dimension(length,width,height));
			return this;
		}
		
		public Car build() {
			return Car.this;
		}
	}
	
	
	
	
}

class Dimension{
	private float length;
	private float width;
	private float height;
	
	
	
	public Dimension(float length, float width, float height) {
		super();
		this.length = length;
		this.width = width;
		this.height = height;
	}
	public final float getLength() {
		return length;
	}
	public final void setLength(float length) {
		this.length = length;
	}
	public final float getWidth() {
		return width;
	}
	public final void setWidth(float width) {
		this.width = width;
	}
	public final float getHeight() {
		return height;
	}
	public final void setHeight(float height) {
		this.height = height;
	}
	
	
}
enum Type{
	SEDAN,HASHBACK,SUV
}