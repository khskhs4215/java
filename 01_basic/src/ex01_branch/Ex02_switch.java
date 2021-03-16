package ex01_branch;

public class Ex02_switch {

	public static void main(String[] args) {
		
int choice = 3;
		
		switch(choice) {
		case 1 : System.out.println("1이다.");
		break;
		
		case 2: System.out.println("2이다.");
		break;
		
		default: System.out.println("1과 2가 아니다.");
		//break; 불필요합니다. 없어도 어차피 switch문은 끝납니다.
		}

	}

}
