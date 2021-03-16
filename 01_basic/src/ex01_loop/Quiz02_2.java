package ex01_loop;

public class Quiz02_2 {

	public static void main(String[] args) {
		
		// 1부터 시작하는 모든 정수를 더합니다.
				// 합계가 3000이 넘을 때 까지 계속합니다.
				// 실행 예 ) 1부터 77까지 더하면 3003입니다.
				
			int total = 0;
			int n = 1;
			while(true) {
				total += n;
				if(total > 3000) {
					break;
				}
				n++;
			}
			System.out.println("1부터 " + n + "까지 합계는" + total + "입니다");
	}

}
