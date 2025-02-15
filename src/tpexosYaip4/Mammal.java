package tpexosYaip4;

public class Mammal extends Animal {
	public Mammal(String name) {
		super(name);
	}

	@Override
    public String toString() {
        return "Mammal [" + super.toString() + "]";
    }
    
    public static void main(String[] args) {
        Mammal mammal = new Mammal("Chien");
        System.out.println(mammal.toString());
    }
	
}
