package tpexosYaip4;

public class Animal {
	private String name;

	public Animal(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Animal [name = " + name + "]";
	}
	
	
	public static void main(String[] args) {
        Animal Animal1 = new Animal("Tortue");
        Animal Animal2 = new Animal("Chat");

        System.out.println(Animal1);
        System.out.println(Animal2);
    }
}
