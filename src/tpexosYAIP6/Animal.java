package tpexosYAIP6;

public abstract class Animal {
	private String name;

	public Animal(String name) {
		super();
		this.name = name;
	}
	
	public abstract void greets();

	@Override
	public String toString() {
		return "Animal [name=" + name + "]";
	}
	
	// On ne peut pas faire de test avec un main car la class est instanciée
}
