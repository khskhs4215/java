package ex07_override;

public class Pizza {
	
	// field
	private String dough; // 도우
	private int cheese; // 치즈
	
	
	// constructor
	public Pizza(String dough, int cheese) {
	super(); // 있어도되고 없어도됨.
	this.dough = dough;
	this.cheese = cheese;
	}
		
		// method
		public void info() {
			System.out.println(dough + "(" + cheese + ")");
		}
	}
	


