package main;

public class Ex07 {

	public static void main(String[] args) {
		
		int x = 10;
		
		x += 10;
		System.out.println(x); //20
		x -=  5;
		System.out.println(x);//20-5 = 15
		x *= 10;
		System.out.println(x);//15*10 = 150
		x /= 10;
		System.out.println(x);//150/10 = 15
		x %= 10;
		System.out.println(x);//15%10 = 5
		//원본값이 계속해서 변경됨 Original value keeps changing
		
		
		
	}
}
