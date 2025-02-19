package tpexosYAIP6;

public class BigDog extends Dog {
	public BigDog(String name) {
		super(name);
	}

	public void greets() {
		System.out.println("Wooow");
	}
	
	public void greets(Dog another) {
		System.out.println("Woooooow");
	}
	
	public void greets(BigDog another) {
		System.out.println("Wooooooooow");
	}

	@Override
	public String toString() {
		return "BigDog [toString()=" + super.toString() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ "]";
	}
	
	public static void main(String[] args) {
        Dog dog = new Dog("Rex");
        BigDog bigDog1 = new BigDog("Max");
        BigDog bigDog2 = new BigDog("Titan");

        System.out.println(dog);
        System.out.println(bigDog1);
        System.out.println(bigDog2);

        dog.greets();
        bigDog1.greets();
        bigDog1.greets(dog);
        bigDog1.greets(bigDog2);
    }
}
