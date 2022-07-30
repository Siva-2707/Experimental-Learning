import java.util.HashMap;

public class SingletonBasic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		DemoObj obj = DemoObj.getInstance();
//		obj.value = 100;
//		System.out.println(obj);
//		DemoObj obj2 = DemoObj.getInstance();
//		obj2.value += 10;
//		System.out.println(obj2);
		
		
//		StaticBlockSingleton obj = StaticBlockSingleton.getInstance();
//		obj.value=1;
//		System.out.println(obj);
		
//		LazySingleton obj = LazySingleton.getInstance();
//		obj.value=4;
//		LazySingleton obj2 = LazySingleton.getInstance();
//		System.out.println(obj2);
		
		
		//Monostate
		
//		MonoState instance = new MonoState();
//		instance.setAge(29);
//		instance.setName("Siva");
//		System.out.println(instance);
//		MonoState instace2 = new MonoState();
//		System.out.println(instace2);
		
		//Multiton
		
		Printer p1 = Printer.getInstance(Subsystem.PRIMARY);
		Printer p2 = p1.getInstance(Subsystem.SECONDARY);
		System.out.println(p2.getInstanceCount());
		Printer p3 = Printer.getInstance(Subsystem.PRIMARY);
		Printer p4 = Printer.getInstance(Subsystem.TERINARY);
		System.out.println(Printer.getInstanceCount());
		
	}

}

//Basic singleton pattern
class DemoObj {
	int value;
	
	private static final DemoObj INSTANCE = new DemoObj();
	
	private DemoObj(){
		
	}
	
	public static DemoObj getInstance() {
		return INSTANCE;
	}

	@Override
	public String toString() {
		return "DemoObj [value=" + value + "]";
	}	
}





class StaticBlockSingleton{
	int value;
	
	@Override
	public String toString() {
		return "StaticBlockSingleton [value=" + value + "]";
	}

	private StaticBlockSingleton() throws Exception {
		System.out.println("Initilizing static block singleton");
//		throw new Exception();
	}
	private static StaticBlockSingleton instance;
	static {
		try{
			instance = new StaticBlockSingleton();
		}
		catch(Exception e) {
			System.err.println("Error faced while creating singleton object"+"\n"+"Error message: " + e );
		}
	}
	
	public static StaticBlockSingleton getInstance() {
		if(instance == null)
		throw new NullPointerException();
		
		else 
			return instance;
	}
	
}







//Lazy singleton pattern
class LazySingleton {
	int value;
	private static  LazySingleton instance;
	private LazySingleton() {
		
	}
	
	public static synchronized LazySingleton getInstance() {
		if(instance == null)
		instance = new LazySingleton();
		
		return instance;
	}

	@Override
	public String toString() {
		return "LazySingleton [value=" + value + "]";
	}
	
}

//Innner static Singleton
class InnerStaticSingleton{
	private InnerStaticSingleton() {
		
	}
	private static class InnerClass{
		private static final InnerStaticSingleton instance = new InnerStaticSingleton();
	}
	public InnerStaticSingleton getInstance() {
		return InnerClass.instance;
	}
	
}

//Monostate Singleton
class MonoState{
	static private String name;
	static private int age;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		MonoState.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		MonoState.age = age;
	}
	
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "[ Age : "+ age +" Name: " + name +" ]";
	}
}

//Multiton 
enum Subsystem{
	PRIMARY,
	SECONDARY,
	TERINARY
}

//Only 3 instances of Printer Class can be created
class Printer {
	
	private static int instanceCount = 0;
	private Printer() {
	}
	private static HashMap<Subsystem, Printer> instances = new HashMap<>();
	
	public static Printer getInstance(Subsystem s) {
	if(! instances.containsKey(s)) {
		instances.put(s, new Printer ());
		instanceCount++;
	}
	return instances.get(s);	
	}
	public static int  getInstanceCount() {
		return instanceCount;
	}
}

//Singleton with Dependency Injection

