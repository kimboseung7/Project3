package quiz;

public class qz03 {
/*
 *  변수 num을 선언하고 456을 저장하세요
 *  그리고 백의 자리 이하를 버린 값을 구하세요
 *  만일 변수 num의 값이 '456' 이하면 '400'이 되고, '111'이라면 '100'이 됩니다
 * 
 * */
	public static void main(String[] args) {
		int num = 456;
		int result = num/100 * 100; // 456/100 하면 4.56이 나오는데 int형 함수는 소수점이 안나옴 따라서 num/100 * 100이됨
		int result2 = num - (num%100); // 456 - (456%100) 나머지 56이 나옴 따라서 456-56 = 400
		
		System.out.println("결과:" + result);
		System.out.println("결과:" + result2);
		
		 
		

	}

}
