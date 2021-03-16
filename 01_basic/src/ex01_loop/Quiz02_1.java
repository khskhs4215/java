package ex01_loop;

import java.util.Scanner;

public class Quiz02_1 {

	public static void main(String[] args) {

Scanner sc = new Scanner(System.in);
		
		
		int grade = 0; // 평점
		do {
			System.out.println("평점을 입력하세요");
			grade = sc.nextInt();			
		} while (grade < 1 || grade > 5);
		
		String stars = ""; // 문자열
		for (int n = 0; n<grade; n++) { // grade만큼 반복된다
			stars += "*";
		}
		System.out.println("평점 : " + grade + "(" + stars + ")");
		sc.close();

	}

}
