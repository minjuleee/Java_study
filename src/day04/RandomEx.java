package day04;

import java.util.Random;

import utils.Mu;

public class RandomEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random rd = new Random();
		
		Mu.p("nextInt() : " + rd.nextInt());
		Mu.p("nextInt(100) : " + rd.nextInt(100));
		Mu.p("nextFloat() : " + rd.nextFloat());
		Mu.p("nextDouble() : " + rd.nextDouble());
		
		// nextInt(N) : 0 ~ N-1까지 중 하나가 나온다는 것을 이용하여
		// 주사위 범위(1 ~ 6) 중 하나가 나오도록 만들보십시오.
		int BASE = 1;
		int result = rd.nextInt(6) + BASE;
		Mu.p("나온 주사위 수는 : " + result);
		
		// Random Alphabet(A-Z)
		// 'A' => 0x41, 65
		char rchar = (char)(rd.nextInt(26) + 65);
		Mu.p("Random Char : " + rchar);
		
		// Random Alphabet(A-Z, a-z)
		// A : 65(0x41), a : 97(0x61)
		rchar = (char)(rd.nextInt(26) + 65 + (32 * rd.nextInt(2)));
		Mu.p("Random Char2 : " + rchar);
		
		String resetPassword = "";
		resetPassword += (char)(rd.nextInt(26) + 65 + (32 * rd.nextInt(2)));
		resetPassword += (char)(rd.nextInt(26) + 65 + (32 * rd.nextInt(2)));
		resetPassword += (char)(rd.nextInt(26) + 65 + (32 * rd.nextInt(2)));
		resetPassword += (char)(rd.nextInt(26) + 65 + (32 * rd.nextInt(2)));
		resetPassword += (char)(rd.nextInt(26) + 65 + (32 * rd.nextInt(2)));
		resetPassword += (char)(rd.nextInt(26) + 65 + (32 * rd.nextInt(2)));
		resetPassword += (char)(rd.nextInt(26) + 65 + (32 * rd.nextInt(2)));
		resetPassword += (char)(rd.nextInt(26) + 65 + (32 * rd.nextInt(2)));
		Mu.p("새로운 패스워드 : " + resetPassword);
	}

}
