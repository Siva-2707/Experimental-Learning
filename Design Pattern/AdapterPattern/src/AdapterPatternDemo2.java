
public class AdapterPatternDemo2 {

	public static void main(String[] args) {
	
		Square square = new Square(5);
		Rectangle rectangle = new SquareAdapter(square);
		
		System.out.println("Height: "+ rectangle.getHeight());
		System.out.println("Width: "+ rectangle.getWidth());
		System.out.println("Area: "+ rectangle.getArea());
		
		
	}

}
interface Rectangle{
	int getHeight();
	int getWidth();
	
	default int getArea() {
		return getHeight()* getWidth();
	}
}

class Square{
	private int area;
	private int sideLength;
	public Square(int sideLength) {
		this.sideLength = sideLength;
		area = sideLength * sideLength;
	}
	public int getSideLength() {
		return sideLength;
	}
	public int getArea() {
		return area;
	}
}

class SquareAdapter implements Rectangle{
	
	Square square;
	public SquareAdapter(Square square) {
		this.square = square;
	}

	@Override
	public int getHeight() {
		// TODO Auto-generated method stub
		return square.getSideLength();
	}

	@Override
	public int getWidth() {
		// TODO Auto-generated method stub
		return square.getSideLength();
	}
	
	
}
