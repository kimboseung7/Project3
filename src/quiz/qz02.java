package quiz;

public class qz02 {

	public static void main(String[] args) {
		int x = 10; //
		int y = 20; //
		int result = (x++) + (--y); // 일단 x++니까 그대로 10이 나오고 --y니까 -1해서 19가 나온다 따라서 값은 29
		// 다음라인에 넘어가는 x가 +1증가해서 11이 된다 result 결과값은 8번째 줄 그 당시를 나타내므로 30이 아닌 29가 나온다
		System.out.println();
	}

}
