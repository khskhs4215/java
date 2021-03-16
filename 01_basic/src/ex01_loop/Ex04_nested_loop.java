package ex01_loop;

public class Ex04_nested_loop {

	public static void main(String[] args) {
		
		for (int out = 1; out <= 10; out ++) {
			for (int in = 10; in <= 50; in += 10) {
				System.out.println(out + "," + in);
			}
		}
		
		// 1주차 1일차 1교시입니다.
		// 1주차 1일차 2교시 입니다.
		// ...
		// 총 3주차, 5일차, 총 8교시
		
		for (int week = 1; week <=3; week ++) {
			for (int day = 1; day <= 5; day++) {
				for (int c= 1; c <= 8; c++)
					System.out.println(week + "주차 " + day + "일차 " + c +"교시입니다.");
			}
		}		

	}

}
