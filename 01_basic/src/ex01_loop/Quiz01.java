package ex01_loop;

import java.util.Scanner;

public class Quiz01 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		// String city = "";
		String city = null; // city 초기화 시켜놓음
		do {
			if (city != null) {
			System.out.println("오답입니다");}
			System.out.print("대한민국의 수도는 >>> ");
			city = sc.next();
			} while(!city.equals("서울") && !city.equalsIgnoreCase("seoul")); // 틀리면 계속 물어봄
		System.out.println("정답입니다");
		
		sc.close();
	}

}
