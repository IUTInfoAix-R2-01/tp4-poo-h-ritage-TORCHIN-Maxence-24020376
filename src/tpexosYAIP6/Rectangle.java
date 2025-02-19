package tpexosYAIP6;

abstract public class Rectangle implements GeometricObject{
	
	private double width;
	private double lenght;
	
	public Rectangle(double width, double lenght) {
		super();
		this.width = width;
		this.lenght = lenght;
	}
	
	public double getArea() {
		return width * lenght;
	}
	
	public double getPerimeter() {
		return 2*width + 2*lenght;
	}

	@Override
	public String toString() {
		return "Rectangle [width=" + width + ", lenght=" + lenght + "]";
	}
}
