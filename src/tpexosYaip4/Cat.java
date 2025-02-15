package tpexosYaip4;

public class Cat extends Mammal{
	public Cat(String name) {
		super(name);
	}
	
	public void greets() {
        System.out.println("Meow");
    }

    @Override
    public String toString() {
        return "Cat [" + super.toString() + "]";
    }
    
    public static void main(String[] args) {
        Cat cat = new Cat("Merlin");
        cat.greets();
        System.out.println(cat.toString());
    }
}
