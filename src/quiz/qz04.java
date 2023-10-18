package quiz;

public class qz04 {
	/*
	 * 산술연산자 수학점수 mathScore 90 영어점수 engScore 70 국어점수 korScore 100 점수의 총점과 평균을 구하세요
	 * 
	 */
	public static void main(String[] args) {
		int mathScore = 90;
		int engScore = 70;
		int korScore = 100;
		int totalScore = mathScore + engScore + korScore;
		System.out.println("총점수:" + totalScore);
		
		double avgScore = (totalScore /3.0);
		System.out.println("평균:" + avgScore);
		

	}

}
