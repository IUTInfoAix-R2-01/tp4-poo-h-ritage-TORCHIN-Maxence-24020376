package tpexosYaip5;

public class Circle {
	private double radius;
	private String color;
	
	public Circle(double radius, String color) {
		super();
		this.radius = radius;
		this.color = color;
	}
	
	public double getRadius() {
		return radius;
	}
	public void setRadius(double radius) {
		this.radius = radius;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public String toString() {
		return "Circle [radius=" + radius + ", color=" + color + "]";
	}
	
	public static void main(String[] args) {
        Circle c1 = new Circle(5.0, "Rouge");
        Circle c2 = new Circle(7.5, "Bleu");

        System.out.println(c1);
        System.out.println(c2);

        c1.setRadius(6.0);
        c1.setColor("Vert");
        c2.setRadius(8.0);
        c2.setColor("Jaune");

        System.out.println(c1);
        System.out.println(c2);
    }
}
