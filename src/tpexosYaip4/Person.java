package tpexosYaip4;

public class Person {
	private String name;
	private String address;
	
	public Person(String name, String address) {
		this.name = name;
		this.address = address;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "person [name=" + name + ", address=" + address + "]";
	}
	
	public static void main(String[] args) {
        Person p1 = new Person("Alice", "123 Rue Principale");
        Person p2 = new Person("Bob", "456 Avenue Centrale");

        System.out.println(p1);
        System.out.println(p2);

        p1.setAddress("789 Boulevard Secondaire");
        p2.setName("Charlie");

        System.out.println(p1);
        System.out.println(p2);
    }
}
