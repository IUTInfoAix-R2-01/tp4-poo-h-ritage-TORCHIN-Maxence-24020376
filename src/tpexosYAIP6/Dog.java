package tpexosYAIP6;

public class Dog extends Animal{
	public Dog(String name) {
		super(name);
	}
	
	public void greets() {
        System.out.println("Woof");
    }

    public void greets(Dog another) {
        System.out.println("Woooof");
    }

    @Override
    public String toString() {
        return "Dog [" + super.toString() + "]";
    }
    
    public static void main(String[] args) {
        Dog dog1 = new Dog("Laika");
        Dog dog2 = new Dog("Kiba");

        dog1.greets();
        dog1.greets(dog2);
        System.out.println(dog1.toString());
    }
}