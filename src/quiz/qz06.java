package quiz;
/*
 * 1. 7이 홀수라면 true 출력하세요
 * 2. 10이 짝수라면 ture 출력하세요
 * */
public class qz06 {

	public static void main(String[] args) {
	int a = 7%2;
	int b = 10%2;
	
	boolean result1 = (a == 1);
	System.out.println(result1);
	boolean result2 = (b == 0);
	System.out.println(result2);

	}

}
