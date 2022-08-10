

public class BridgeDesignPatternDemo2 {

	public static void main(String[] args) {
		Shape square = new Square(new Blue());
		square.getPropeties();
	}

}

abstract class Shape{
	
	private Color color;
	
	public Shape(Color color) {
		this.color = color;
	}
	
	abstract int getArea();
	String fillColor() {
		return color.addColor();
	}
	abstract void getPropeties();
	
}

interface Color{
	String addColor();
}

class Square extends Shape{

	public Square(Color color) {
		super(color);
	}

	@Override
	public int getArea() {
		return 0;
	}

	@Override
	public void getPropeties() {
		System.out.println("This is a square of color "
				+ ""+fillColor()+" and of area " + getArea());
	}
	
}

class Red implements Color{

	@Override
	public String addColor() {
		return "Red";
	}
	
}

class Blue implements Color{

	@Override
	public String addColor() {
		return "Blue";
	}
	
}