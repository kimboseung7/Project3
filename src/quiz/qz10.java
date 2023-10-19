package quiz;
/*
 * 연산자 우선순위
 * 코드를 보고 예상결과와 풀이과정을 주석으로 작성하세요
 * 
 * */
public class qz10 {

	public static void main(String[] args) {
		
		int result1 = -5 + 3 * 10 /2; // 곱-나누기-합 순 --> 10
		int x = 1;
		int result2 = (x++) + 5;// 단항--산술 순  --> 7 (++x를 사용) 다음라인으로 넘어가는 순간 x가 2로 변함
		System.out.println();
		System.out.println();
	}

}
