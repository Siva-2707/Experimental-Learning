
public class Car {
	private String name;
	private String color;
	private TYPE type;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public TYPE getType() {
		return type;
	}
	public void setType(TYPE type) {
		this.type = type;
	}
	@Override
	public String toString() {
		return "Car [name=" + name + ", color=" + color + ", type=" + type + "]";
	}
	
	
	
	
	
	
}
