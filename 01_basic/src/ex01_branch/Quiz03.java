package ex01_branch;

import java.util.Scanner;

public class Quiz03 {

	public static void main(String[] args) {
		
		//switch, 나이 입력 받아서 성인,미성년자 출력
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("나이를 입력해주세요 : ");
		int age = sc.nextInt();
				
		/*
		int state = 0; // 미성년자를 의미
		if(age >= 20) {
		state =1; // 성인을 의미
		}
				
		switch(state) {
		case 0 : System.out.println("미성년자 입니다.");
		break;
		case 1 : System.out.println("성인입니다.");
		}
		*/
				
		switch(age / 10) {			// 몫이 0과 1은 미성년자 
		case 0 : /*System.out.println("미성년자입니다."); -- case 식이 같은 경우 합쳐도 됨*/
		case 1 : System.out.println("미성년자입니다.");
		break;
		default : System.out.println("성인입니다.");
		}
		
		sc.close();

	}

}
