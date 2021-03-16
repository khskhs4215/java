package quiz02;

public class Coord  { // 좌표
	
	// field
	private int x;
	private int y;
	
	// constructor
	public Coord (int x, int y) {
		this.x = x;
		this.y = y;
	}
	public void info() {
		System.out.print("[" + x + "," + y + "]");
	}
	
	//

}
