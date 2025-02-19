package tpexosYAIP6;

public class ResizableCircle extends Circle implements Resizable {

	public ResizableCircle(double radius) {
		super(radius);
	}

	@Override
	public String toString() {
		return "ResizableCircle[" + super.toString() + "]";
	}
	
	public void resize(int percent) {
		System.out.println(radius *= percent/100.0);
	}
	
	public static void main(String[] args) {
        ResizableCircle c1 = new ResizableCircle(10.0);
        System.out.println("Avant resize : " + c1);

        c1.resize(50);
        System.out.println("Après réduction de 50% : " + c1);

        c1.resize(200);
        System.out.println("Après augmentation de 200% : " + c1);
    }
}
