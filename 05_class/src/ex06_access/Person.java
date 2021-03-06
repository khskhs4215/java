package ex06_access;
/*
 * 접근제어자(access modifier)
 * 1. private : 클래스 내부에서만 볼 수 있습니다.
 * 2. default : 같은 패키지에서만 볼 수 있습니다. access modifier를 지정하지않으면 default입니다.
 * 3. protected : 같은 패키지 또는 상속 관계에 있는 다른 패키지에서만 볼 수 있습니다.
 * 4. public : 어디서든볼 수 있습니다.
 * 
 * 지정하는 방법
 * 1. 필드는 private 합니다.
 * 2. 메소드(생성자, 일반메소드)는 public합니다.
 * */


public class Person {
	// field
	private String name;
	private int age;
	private boolean isKorean;
	
	// method
	
	// name에 접근할 수 있는 메소드
	// 1. name에 값을 전달하는 메소드
	public void setName(String name) {
		this.name = name;
	}
	// 2. name을 반환하는 메소드
	public String getName() {
		return name;
	}

	// age에 접근할 수 있는 메소드
	public void setAge(int age) {
		this.age = age;	
	}
	// age를 반환하는 메소드
	public int getAge() {
		return age;
	}
	// isKorean에 접근할 수 있는 메소드
	public void setIsKorean(boolean isKorean) {
		this.isKorean = isKorean;
	}
	// isKorean을 반환하는 메소드
	public boolean getIsKorean() {
		return isKorean;
	}
	
	}
	
		
	

