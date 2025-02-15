package tpexosYaip5;

public class Cylinder {
	private Circle base;
	private double height;
	
	public Cylinder(Circle base, double height) {
		super();
		this.base = base;
		this.height = height;
	}

	public Circle getBase() {
		return base;
	}

	public void setBase(Circle base) {
		this.base = base;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	@Override
	public String toString() {
		return "Cylinder [base=" + base + ", height=" + height + "]";
	}
	
	public static void main(String[] args) {
        Circle base1 = new Circle(5.0, "Rouge");
        Circle base2 = new Circle(7.5, "Bleu");

        Cylinder cyl1 = new Cylinder(base1, 10.0);
        Cylinder cyl2 = new Cylinder(base2, 15.0);

        System.out.println(cyl1);
        System.out.println(cyl2);

        cyl1.setHeight(12.0);
        cyl2.setBase(new Circle(6.0, "Vert"));

        System.out.println(cyl1);
        System.out.println(cyl2);
    }
}
