
public class PrototypePattern_Demo {
	public static void main(String args[]) {
		Person siva = new Person("Siva", "male", 22);
		Person sivaCopy = new Person(siva);
		sivaCopy.setName("SivaCopy");
		sivaCopy.setAge(21);
		Person sivaClone = (Person)siva.clone();
		sivaClone.setAge(25);
		sivaClone.setName("SivaClone");
		
		System.out.println(siva);
		System.out.println(sivaCopy);
		System.out.println(sivaClone);
	}
	
}
//Implementing cloneable interface and overriding clone method of Object class

class Person implements Cloneable{
	String name,gender;
	int age;
	public Person(String name, String gender, int age) {
		super();
		this.name = name;
		this.gender = gender;
		this.age = age;
	}
	//Copy constructor for deep coping
	public Person(Person person) {
		this(person.name, person.gender, person.age);
	}
	
	
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getGender() {
		return gender;
	}


	public void setGender(String gender) {
		this.gender = gender;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	@Override
	public String toString() {
		return "Person [name=" + name + ", gender=" + gender + ", age=" + age + "]";
	}
	
	@Override
	public Person clone() {
		Person person = null;
		try {
			person = (Person)super.clone();
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return person;
	}

}
