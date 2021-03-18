package ex12_abstract;

public class Circle extends Shape {
	// field
		private int width;
		private int height;
		
		// constructor
		public Circle(int width, int height) {
			super();
			this.width = width;
			this.height = height;
		}
	

	@Override
	public double getArea() {
		
		return 0;
	}

}
