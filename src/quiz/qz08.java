package quiz;
/*
 * 비교연산자와 논리연산자
 * */
public class qz08 {

	public static void main(String[] args) {
//	(1) int형변수 i를 선언하고 80을 대입
//		논리연산자를 사용하여 i가 50<i<100 범위에 속해있다면 true를 출력하세요
//		
//	(2) int형변수 i2를 선언하고 5을 대입하세요
//	논리연산자를 사용하여 i2가 10보다 작거나 30보다 크면 true를 출력하세요
		
		int i = 80;
		boolean result1 = (50<i) && (100>i); //범위니까(and) 논리 곱을 사용하여 50<i<100을 표현
		System.out.println(result1); //*출력 코드 까먹음
		
		int i2 = 5;
		boolean result2 = (i2<10) || (i2>30);//or이니까 논리 합을 사용하여 표현
		System.out.println(result2);//*출력 코드 까먹음
	}

}
