package day02;

public class VariableEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		p("Variable Example");
		p("\033[1m" + "Variable Example" + "\033[0m"); // 굵은 글자
		
		// 1. int, long, float, double
		int var1 = 30;	// 정수를 정수에 넣음
		long var2 = 30;	// 정수를 정수보다 더 큰 곳에 넣음
		
		double var3 = 3.1;	// double을 double에 넣음
		// float var4 = 3.1;	// 넓은 곳에서 좁은 곳으로는 못감
		float var4 = (float)3.1;	// 캐스팅, 명시적 형변
		
		int var5 = (int)3.1; // 소수점 버리
		p("var5 = " + var5);
		
		double var6 = var5;
		p("var6 = " + var6);
		
		float var7 = 3.1F;
		long var8 = 3L;
		
		// 2. char : 문자로 입력하더라도 숫자로 저장됨
		char ch1 = 'a';	// ASCII, 큰 따옴표 하면 안됨!
		char ch2 = 97;	
		char ch3 = 0x61;	// 16진수
		char ch4 = 'A';	// 0x41, 65
		p("ch1, ch2, ch3 : " + ch1 + ch2 + ch3);
		
		// 3. String
		String myName = "K-POP Demon Hunters";
		p("Our name is " + "\"" + myName + "\"");
		
		// 4. boolean : true or false
		boolean b1 = true;
		boolean b2 = 3 < 5;
		p("b1, b2 = " + b1 + ", " + b2);
		
	}
	
	public static void p(String str) {
		System.out.println(str);
	}

}
