package ex01_loop;
/*
 * 아래와 같은 모습으로 출력해보기
 * 2*1=2 3*1=3 ... 9*1=9
 * 2*2=4 3*2=6 ... 9*2=18
 * */
public class Quiz04 {

	public static void main(String[] args) {
		
		for (int n = 1; n <= 9; n++){
			for(int dan = 2; dan <= 9; dan++) {
				System.out.print(dan + "*" + n + "=" + (dan*n) + "\t");
			}
			System.out.println(); // 줄 바꿈
		}

	}

}
