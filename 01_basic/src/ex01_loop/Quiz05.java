package ex01_loop;

import java.util.Scanner;

public class Quiz05 {

	public static void main(String[] args) {

		// 10000원 모두 사용하기
				// 현재 10000원이 있습니다.
				// 결제금액 - 5000원
				// 현재 5000원이 있습니다.
				// 결제금액 >>> -100원
				// -100원은 결제할 수 없습니다.
				// 결제 금액 >>> 10000원
				// 5000원이 부족합니다.
				// 현재 5000원이 있습니다.
				// 결제 금액 5000원
				// 현재 0원이 있습니다.
				
				Scanner sc = new Scanner(System.in);
				int a = 10000; //초기 자본
				
				while(true) {
					System.out.println("현재" + a + "원이 있습니다.");
					if(a == 0) {
						break;
					}
					System.out.println("결제금액은 : ");
					int b = sc.nextInt();
					if(b < 0) {
						System.out.println(b + "원은 결제할 수 없습니다.");
					}else if(b > a) {
						System.out.println((b - a) + "원이 부족합니다.");
					}else {
						a-=b;
					}
				}
				sc.close();

	}

}
