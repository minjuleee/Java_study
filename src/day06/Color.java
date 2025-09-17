package day06;

import utils.Mu;

public class Color {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// AA라는 글자를 8색으로 나타내시오. "\033[" + 숫자 + "m"
		// for문을 사용하싱오.
		// 일반 8색을 구현하시오.
		for(int i=30; i<38; i++) {
			System.out.print("\033[" + i + "m" + "AA" + "\033[0m");
		}
		Mu.p("");
		for(int i=90; i<98; i++) {
			System.out.print("\033[" + i + "m" + "AA" + "\033[0m");
		}
		Mu.p("");
		for(int i=40; i<48; i++) {
			System.out.print("\033[" + i + "m" + "  " + "\033[0m");
		}
		Mu.p("");
		for(int i=100; i<108; i++) {
			System.out.print("\033[" + i + "m" + "  " + "\033[0m");
		}
		Mu.p("");
		
		// 실습 : 확장256색을 구현하시오. (바탕색, 글자는 공백1글)
		for(int i=0; i<256; i++) {
			System.out.print("\033[48;5;" + i + "m" + "  " + "\033[0m");
		}
		Mu.p("");
		
	}

}
