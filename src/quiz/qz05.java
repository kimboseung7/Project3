package quiz;
/*
 * 비교연산자
 * 1. 본인의 나이가 40세 이하라면 true 출력
 * 2. 본인의 나이가 40세 라면 true 출력
 * 3. 본인의 나이가 40세가 아니라면 true 출력
 * 
 * 
 * */
public class qz05 {

	public static void main(String[] args) {
		int age1 = 17;
		int age2 = 40;
		
		boolean result1 = (age1 <= age2);
		System.out.println(result1);
		boolean result2 = (age1 == age2);
		System.out.println(result2);
		boolean result3 = (age1 != age2);
		System.out.println(result3);
	}

}
