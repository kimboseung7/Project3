package main;

public class Ex04 {

	public static void main(String[] args) {
		
		int mathScore = 93; //수학점수
		int engScore = 70; //영어점수
		
		int totalScore = mathScore + engScore; //총점 구하기
		System.out.println(totalScore);
		
		//평균점수를 정확하게 구하는 방법은 무엇일까? -> 총점수 / 과목수
		
		// 1. int형 변수에 결과 저장, 점수 2로 나누기 실수 안나옴 실수 저장x
		int avgScore1 = totalScore / 2; // int/int
		System.out.println(avgScore1);
		
		//2. double형 변수에 결과 저장, 정수 2로 나누기, 첫째자리 날라감(int)
		double avgScore2 = totalScore /2; // int/int  -->int로 나옴
		System.out.println(avgScore2);
		
		//3. double형 변수에 결과 저장, 실수 2.0으로 나누기 *정답
		double avgScore3 = totalScore / 2.0; // int/double double/double --> 2.0사용으로 int가 실수 타입으로 변경할 수 있게됨
		System.out.println(avgScore3);//자동형변환이 일어남
		
		// 정확한 점수를 구할려면 실수로 나누어야된다 double형 함수사용 + 실수 사용 ex) 2.0
	}
}
