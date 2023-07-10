import java.util.HashMap;
import java.util.Map;

public class Main {

	public static void main(String[] args) {
		Student student1 = new Student("Siva", 15, new School("AHSS","Pondicherry"));
		Student student2 = new Student("Siva", 15, new School("AHSS","Pondicherry"));
		Student student3 = new Student("Siva", 15, new School("AHSS","Pondicherry"));
		
		Student student4 = new Student("Siva", 15, SchoolFactory.getSchool("AHSS", "Pondicherry"));
		Student student5 = new Student("Siva", 15, SchoolFactory.getSchool("ABSM", "Pondicherry"));
		Student student6 = new Student("Siva", 15, SchoolFactory.getSchool("AHSS", "Pondicherry"));
		
		System.out.println(student1);
		System.out.println(student2);
		System.out.println(student3);
		System.out.println(student4);
		System.out.println(student5);
		System.out.println(student6);
		
		
	}

}

interface Person{
	 public void study();
}

class Student implements Person{
	private final String name;
	private final int age;
	//Flyweight
	private School school;
	
	
	
	public Student(String name, int age, School school) {
		super();
		this.name = name;
		this.age = age;
		this.school = school;
	}



	@Override
	public void study() {
		System.out.println(this.name+" is studing");
	}



	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", school=" + school + "]";
	}
	
	
}

final class School{
	private final String name;
	private final String address;
	
	public School(String name, String address) {
		this.name = name;
		this.address = address;
	}
	
	public String getName() {
		return this.name;
	}
	public String getAddress() {
		return this.address;
	}

	@Override
	public String toString() {
		return "School [ "+super.toString() +" name=" + name + ", address=" + address + "]";
	}
	
}


class SchoolFactory{
	private static Map<String,School> schoolCache = new HashMap<>();
	public static School getSchool(String name, String address) {
		if(!schoolCache.containsKey(name))
			schoolCache.put(name, new School(name,address));
		return schoolCache.get(name);
		
	}
}
