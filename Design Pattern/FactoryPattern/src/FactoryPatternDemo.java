

public class FactoryPatternDemo {
	public static void main(String args[]) {
		ShapeFactory shapeFactory = new ShapeFactory();
		try {
			Circle circle = (Circle)shapeFactory.getShape("circle");
			circle.draw();
			circle.setRadius(10);
			double area = circle.getArea();
			System.out.println(area);
		} catch (Exception e) {

			e.printStackTrace();
		}
	}
}

interface Shape{

	public void draw();
	public double getArea();
	
}
class Square implements Shape {
	private double length;
	private double area;
	public void setLength(double length) {
		this.length = length;
	}
	public void draw() {
		System.out.println("Square");
	}

	@Override
	public double getArea() {

		area = length* length;
		return area;
	}
}
class Rectangle implements Shape{
	private double length, breath;
	private double area;
	public void draw() {
		System.out.println("Rectangle");
	}

	public void setLength(double length) {
		this.length = length;
	}

	public void setBreath(double breath) {
		this.breath = breath;
	}

	@Override
	public double getArea() {
		area = length * breath;
		return area;
	}
}
class Circle implements Shape{
	private double radius;
	private final double PI = 3.14;
	public void setRadius(double radius) {
		this.radius = radius;
	}
	public void draw() {
		System.out.println("Circle");
	}
	@Override
	public double getArea() {
		return PI* radius * radius;
	}
}

class ShapeFactory{
	
	public Shape getShape(String shape) throws Exception {
		
		switch(shape.toLowerCase()){
			
			case "square" : return new Square();
			case "circle" : return new Circle();
			case "rectangle": return new Rectangle();
			default : throw new Exception("Shape not found");
		}
	}
	
}
