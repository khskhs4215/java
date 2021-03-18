package ex07_override;

public class GogumaPizza extends Pizza{
	
	private String goguma;
	
	public GogumaPizza(String dough, int cheese, String goguma) {
		super(dough, cheese);
		this.goguma = goguma;
	}
	
	// method
	// 고구마 정보의 출력을 위해서 Pizza의 info()를 다시 만들어야합니다.
	@Override
	public void info() {
		System.out.println("원산지 : " + goguma);
		super.info();
		
	}
	

}
