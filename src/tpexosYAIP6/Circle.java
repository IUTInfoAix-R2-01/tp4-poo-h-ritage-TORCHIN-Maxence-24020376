package tpexosYAIP6;



abstract public class Circle implements GeometricObject{
	
	protected double radius;
	
	public Circle(double radius) {
		this.radius = radius;
	}
	public double getArea() {
		return radius*radius*3.14116 ;
	}
	public double getPerimeter () {
		return 2*radius * 3.14116;
	}
	
	@Override
	public String toString() {
		return "Circle [ raduis = "+ radius +" ]";
	}
}