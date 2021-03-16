package ex07_recursive;

public class Adder {
	private int total; // 초기값 0입니다. 필드는 0이다. =0; 이런거 말고
	
	public void calculate(int n) {
		if(n == 0) {
			return; // 결과타입이 void!! 이 때만 return을 통해서 메소드를 종료합니다 (break;)
		}
		total += n;
		calculate(n - 1);
	}

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

}
