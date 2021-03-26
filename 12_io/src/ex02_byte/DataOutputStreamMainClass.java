package ex02_byte;

import java.io.DataOutputStream;
import java.io.FileOutputStream;

// DataOutputStream 클래스
// 1. 자바의 데이터 타입을 그대로 출력하는 클래스
// 2. 출력 메소드
// 	writeBye(), writeInt(), writeLong(), writeDouble() 등 타입별로 처리
public class DataOutputStreamMainClass {

	public static void main(String[] args) {
		
		DataOutputStream dos = null;
		
		try {
			
			dos = new DataOutputStream(new FileOutputStream("byte3.txt"));
			
			int age = 44;
			double weight = 70.5;
			String name = "민경태";
			
			dos.writeInt(age);
			dos.writeDouble(weight);
			dos.writeUTF(name);
			
		} catch(Exception e) {
			e.printStackTrace();
		}

	}

}
