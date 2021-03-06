package ex01_char;

import java.io.FileReader;

/*
 *  FileReader 클래스
 *  1. 문자 기반 + 입력 스트림입니다. (Reader)
 *  2. 문자를 보낼 때 사용합니다.
 *  	1) 통신 : 상대방에게 문자를 받을 때
 *  	2) 파일 : 텍스트 파일을 읽을 때
 *  3. 입력 메소드
 *  	read()
 *  4. 입력 단위
 *  	char[], int
 *  5. 예외처리가 필요합니다. 
 */
public class FileReaderMainClass {

	public static void main(String[] args) {
		
		try (FileReader fr = new FileReader("text1.txt")) {
			
			// read() 메소드를 이용해서 앍기
			/*while (true) {
				int ch = fr.read(); // 읽은 문자 도는 -1이 ch에 저장됩니다.
				if(ch == -1) {
					break;
				}
				System.out.print(ch);
			}*/
			int ch = 0;
			while((ch = fr.read() ) != -1) {
				System.out.print((char)ch);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		

	}

}
