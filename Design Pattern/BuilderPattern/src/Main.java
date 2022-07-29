
public class Main {
	public static void main(String args[]) {
		CarBuilder builder = new CarBuilder();
		Car car1 = builder.withName("Honda").ofType(TYPE.SEDAN).ofColor("blue").build();
		System.out.println(car1);
		
	}
	
	
}
