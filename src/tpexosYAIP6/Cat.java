package tpexosYAIP6;

public class Cat extends Animal {
    public Cat(String name) {
        super(name);
    }

    public void greets() {
        System.out.println("Meow");
    }

    @Override
    public String toString() {
        return "Cat [name=" + super.toString() + "]";
    }

    public static void main(String[] args) {
        Cat cat = new Cat("Merlin");
        cat.greets();
        System.out.println(cat.toString());
    }
}
