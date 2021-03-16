package ex01_branch;

import java.util.Scanner;

public class Quiz05 {

	public static void main(String[] args) {
		// 점수를 입력 받아서 해당하는 학점을 출력하시오.
				// char grade : s, a, b, c, f
				// char point : +, 0, -, ' '
				
				Scanner sc = new Scanner(System.in);
				
				System.out.println("점수를 입력하세요 : ");
				int score = sc.nextInt();
				
				
				char point = '-'; // 초기 값으로 -를 준 거임
				switch (score % 10) { // 나머지로 +. - 0 계산
				case 9 : case 8 : case 7:
					point = '+';
					break;
				case 6 : case 5 : case 4:
					point = '0'; // 초기값이 - 이기 때문에 -값들은 계산 안함
				}
				
				char grade = 'F'; //초기값으로 F 로 시작
				switch(score / 10) {
				case 10 :
					grade = 'S';
					point = ' ';
					break;
				case 9 :
					grade = 'A';
					break;
				case 8 :
					grade = 'B';
					break;
				case 7 :
					grade = 'C';
					break;
				default : point = ' ';
				}
				
				System.out.println("" + grade + point); // grade + point하면 문자값이 더해지기 때문에 "" 를 붙혀야 올바른 계산 가능
				
				sc.close();		
	}

}
