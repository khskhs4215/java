package ex12_abstract;

public class MainClass {

	public static void main(String[] args) {
		
		Shape[] shapes = new Shape[10];
		
		shapes[0] = new Rectangle(3, 4);
		System.out.println(shapes[0].getArea());

	}

}
