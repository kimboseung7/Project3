package quiz;

public class qz07 {

	public static void main(String[] args) {

		boolean result1 = (1 == 2) || (1 < 2); // 논리 합에서는 하나만 참이여도됨 그러므로 false || true 여서 -> true
		boolean result2 = true && false; // 논리 곱 이므로 둘의 값이 같아야됨 따라서 -> false
		boolean result3 = !false;// 논리 부정 연산자 !가 있으므로 -> true

		int x = 1;
		int y = 5;
		boolean result4 = (x < y) || (x == y); // 논리 합 true || false 이므로 논리 합에서는 하나만 참이여도됨 ->true
		System.out.println(result4);
	}

}
