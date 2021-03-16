package ex02_method;

public class MainClass {

	public static void main(String[] args) {
		Person p = new Person();
		
		p.set("alice", 30, '여', false, 180.1, 93.1); // 인수가 6개 
		
		p.info(); // 매개변수가 없기 때문에 인수가 0개]
		
		double BMI = p.getBMI();
		System.out.println(BMI);

	}

}
