package ex01_branch;

import java.util.Scanner;

public class Quiz01 {

	public static void main(String[] args) {
		
		// 임의의 양수 1개 입력 받아서 "홀수", "짝수", "3의 배수"
		
				Scanner sc = new Scanner(System.in);
				
				System.out.print("숫자를 입력하세요");
				int no = sc.nextInt();
				
				if(no % 2 == 1) {
					System.out.println(no + " (은)는 홀수입니다.");
				}else
					if(no % 2 ==0) {
						System.out.println(no + " (은)는 짝수입니다.");				
					}if(no % 3 ==0) {
						System.out.println(no + " (은)는 3의 배수입니다.");
					}
					sc.close();	

	}

}
