package main;

public class Ex02 {

	public static void main(String[] args) {
//		//증감연산자가 변수의 뒤에 있을 때
//		int x = 100; //x에 100 저장
//		int y = x++; //증감연산자 사용, 변수의 뒤에 있으니 다음라인에서 100에서 101로 증가 (+1)
//		int z = x--; // 값 101나옴       if, 다음 라인이 있다고 했을 때 다음라인은 100이됨 (-1)
//		
//		System.out.println(x);  //100
//		System.out.println(y);  //100
//		System.out.println(z);  //101
		
		//증감연산자가 변수의 앞에 있을 때
		int x = 100; // 변수x를 선언하고 값 100 저장
		int y = ++x; // ++증감연산자가 x앞에 있으므로 x에 즉시 +1을 하고 y에 카피 --> y에 101저장
		int z = --x; // --증감연산자가 x앞에 있으므로 x에 즉시 -1을 하고 z에 대입/카피 --> z에 100저장
		
		System.out.println(x);  //100
		System.out.println(y);  //101
		System.out.println(z);  //100
		
		//디버깅으로 봤을 때 x값이 처음에 100, y로 넘어갔을 때 x가 101로 변하고 y값이 카피되어서 101이 된다
		
	}

}
