package quiz04;

public class KoreanFighter extends Fighter {
	
	
	
	// field
	
	// constructor
	public KoreanFighter(String name) {
		super(name, (int)(Math.random() * 100 + 1,(int)(Math.random() * 10 + 1));
	}
	
	// method
	// attack() : 20% 확률로 한 방에 KO시킬 수 있습니다.
	@Override
	public void attack(Fighter fighter) {
		
	}

}
