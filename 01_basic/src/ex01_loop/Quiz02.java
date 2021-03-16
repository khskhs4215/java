package ex01_loop;

import java.util.Scanner;

public class Quiz02 {
	/*
	 * 영화 평점을 입력받아서 *을 출력
	 * 평점은 1~5사이의 정수이고, 잘못된 평점은 다시 입력 받습니다.
	 * */
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("평점을 입력하세요");
		int star = sc.nextInt();
		switch(star) {
		case 1 : System.out.println("*");
		break;
		case 2 : System.out.println("**");
		break;
		case 3 : System.out.println("***");
		break;
		case 4 : System.out.println("****");
		break;
		case 5 : System.out.println("*****");
		default : System.out.println("평점을 다시 입력하세요");
		
		}
		sc.close();
	}

}
