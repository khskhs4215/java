package ex01_loop;

public class Ex03_for {
public static void main(String[] args) {
		
		//for문
		// 1. 반복의 횟수나 범위가 명확할 때 사용
		// 2. 배열이나 리스트와 같은 반복가능객체(iterable)에서 사용
		// 3. 동작순서
		// for ( ① ; ② ; ④ ) { ③ }
		// 1번은 최초 1회만 동작합니다.
		// 2,3,4는 반복합니다.
		
		// 1 ~ 10 출력
		/*for (int n = 1; n <= 10; n++) {
			System.out.println(n);
		}*/
		
		// 10 ~ 1 출력
		/*for (int n = 10; n >= 1; n--) {
			System.out.println(n);
		}*/
		
		// 3번 "Hello Java"를 출력하는 for문을 작성해 봅니다.
		
		for (int n = 0; n < 3; n++) {
			// 사용되는 n : 0 ,1 ,2
			System.out.println("Hello Java");
		}
}}
