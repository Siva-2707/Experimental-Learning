
public class StatePatternDemo {

	public static void main(String[] args) {
		ToolFactory toolFactory = new ToolFactory();
		Tool tool = toolFactory.getTool(Tools.ZOOM);
		Operator operate = new Operator(tool);
		operate.arrowDown();
		operate.arrowUp();
				
				
	}

}

enum Tools{
	SCROLL,
	ZOOM
}

//Implementing the state pattern making Each tool independent
class Operator{
	private Tool currentTool;

	public Operator(Tool tool) {
		this.currentTool = tool;
	}
	
	public Tool getCurrentTool() {
		return currentTool;
	}
	public void arrowUp() {
		currentTool.arrowUp();
	}
	public void arrowDown() {
		currentTool.arrowDown();
	}
	
}

abstract class Tool{
	public abstract void arrowUp();
	public abstract void arrowDown();
	
	public void close() {
		System.out.println("Close the application");
	}
}

class Scroll extends Tool{

	@Override
	public void arrowUp() {
		System.out.println("Scroll up");
	}

	@Override
	public void arrowDown() {
		System.out.println("Scroll down");
	}
	
}

class Zoom extends Tool{

	@Override
	public void arrowUp() {
		System.out.println("Zoom in");
	}

	@Override
	public void arrowDown() {
		System.out.println("Zoom out");
	}
	
}
// Implementing Factory design pattern
class ToolFactory{
	public Tool getTool(Tools tool) {
		if(tool == Tools.SCROLL)
			return new Scroll();
		else if (tool == Tools.ZOOM)
			return new Zoom();
		return null;
	}
}
