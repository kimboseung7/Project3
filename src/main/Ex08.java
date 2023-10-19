package main;

public class Ex08 {

	public static void main(String[] args) {
		int motherAge = 47;
		int fatherAge = 50;
		
		String str;
		str = (motherAge > fatherAge)? "엄마" : "아빠"; //문자열 타입으로 변수 저장이 되기 때문에 String 사용 Type 일치 시켜줘야함
		System.out.println(str);
		
		char ch = (motherAge > fatherAge)? 'm' : 'f';//type 일치 char(한글자)
		System.out.println(ch);
		
		int i = (motherAge > fatherAge)? 1 : 2;
		System.out.println(i);
		
		//엄마의 나이가 아빠보다 많으면 true를 변환 그렇지 않으면 false를 변환
		boolean boo1 = (fatherAge > motherAge)? true : false;
		System.out.println(boo1);
	}

}
