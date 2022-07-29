import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class SerializationDemo {

	public static void main(String[] args) throws Exception {
//		ClassA obj = new ClassA();
		ClassB obj = new ClassB();
		obj.a=1;
		obj.b=2;
		System.out.println(obj);
		
		FileOutputStream file = new FileOutputStream("file.ser");
		ObjectOutputStream oos = new ObjectOutputStream(file);
		oos.writeObject(obj);
		oos.close();
		file.close();
		
		System.out.println("Object serialized");
		
		FileInputStream inputFile = new FileInputStream("file.ser");
		ObjectInputStream ois = new ObjectInputStream(inputFile);
//		ClassA obj1 = (ClassA)ois.readObject();
		ClassB obj1 = (ClassB)ois.readObject();
		ois.close();
		inputFile.close();
		
		System.out.println("Object deserialized");
		System.out.println(obj1);
		obj1.a = 3;
		obj1.b= 2;
		System.out.println(obj1);
	}
	

}

class ClassA implements Serializable{
	
	int a,b;

	@Override
	public String toString() {
		return "ClassA [a=" + a + ", b=" + b + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}
	
}

class ClassB extends ClassA{
	
	static int a,b;
//    int a,b;

	@Override
	public String toString() {
		return "ClassB [a=" + a + ", b=" + b + "]";
	}
	
	
}
