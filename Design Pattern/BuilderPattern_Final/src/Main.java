
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PersonBuilder buildPerson = new PersonBuilder();
		Person person = buildPerson.ofAge(20).ofName("Siva").ofGender("Male")
		.lives().at("Pondicherry").withPincode(605010)
		.works().at("TCS").as("AST").withSalary(20000).build();
		System.out.println(person);
		
	}

}

class Person{
	//Personal details
	String name, gender;
	int age;
	//Address details
	String streetAddress, city;
	int pincode;
	
	//Employment details
	String companyName, postition;
	int salary;
	
	@Override
	public String toString() {
		return "Person [name=" + name + ", gender=" + gender + ", age=" + age + ", streetAddress=" + streetAddress
				+ ", city=" + city + ", pincode=" + pincode + ", companyName=" + companyName + ", postition="
				+ postition + ", salary=" + salary + "]";
	}
}

class PersonBuilder{
	protected Person person = new Person();
	public PersonBuilder ofName(String name) {
		person.name = name;
		return this;
	}
	public PersonBuilder ofAge(int age) {
		person.age = age;
		return this;
	}
	public PersonBuilder ofGender(String gender) {
		person.gender = gender;
		return this;
	}
	public PersonAddressBuilder lives() {
		return new PersonAddressBuilder(person);
	}
	public PersonJobBuilder works() {
		return new PersonJobBuilder(person);
	}
	public Person build() {
		return this.person;
	}
}

class PersonAddressBuilder extends PersonBuilder{

	public PersonAddressBuilder(Person person) {
		this.person = person;
	}
	
	public PersonAddressBuilder at(String address) {
		person.streetAddress = address;
		return this;
	}
	public PersonAddressBuilder in(String city) {
		person.city = city;
		return this;
	}
	public PersonAddressBuilder withPincode(int pincode) {
		person.pincode = pincode;
		return this;
	}
}

class PersonJobBuilder extends PersonBuilder{

	public PersonJobBuilder(Person person) {
		this.person = person;
	}
	
	public PersonJobBuilder as(String position) {
		person.postition = position;
		return this;
	}
	public PersonJobBuilder at(String company) {
		person.companyName = company;
		return this;
	}
	public PersonJobBuilder withSalary(int salary) {
		person.salary = salary;
		return this;
	}
	
	
	
	
}