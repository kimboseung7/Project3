package quiz;
/*
 * 삼항연산자
 * 1. 숫자5가 숫자3보다 크면, 문자 '오'아니면 문자 '삼' 출력하세요
 * 2. 코드를 보고 예상 결과와 풀이과정을 주석으로 작성하세요
 * */
public class qz09 {

	public static void main(String[] args) {
	char ch = (5>3)? '오' : '삼'; // String 쓸려면 큰 따움표 써야함
	System.out.println(ch);
	
	//2.
	int x =10;
	int y =20;
	int result = (x>10)? y+10: y-10; // x = 10 따라서 x>10 조건식이 false 이므로 값2 출력 따라서 y-10(20-10) = 10 출력됨
	}

}
