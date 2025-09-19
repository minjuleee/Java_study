package day06;

import java.util.Random;

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
		
		// True Color
		// Red, Green, Blue를 각각 0~255 중 랜덤으로 뽑는다.
		// 위 과정을 256번 반복하여 출력한다.
		Random rd = new Random();
		int r, g, b;
		
		for(int i=0; i<256; i++) {
			r = rd.nextInt(256);
			g = rd.nextInt(256);
			b = rd.nextInt(256);
			System.out.print("\033[48;2;" + r + ";" + g + ";" + b + "m" +"\033[0m");	
		}
		Mu.p("");
		
		
		// 0~255 중 한 숫자를 랜덤으로 뽑는다.
		// Red, Green, Blue에 위 숫자를 똑같이 넣는다.
		// 위 과정을 256번 반복하여 출력한다.
		for(int i=0; i<256; i++) {
			r = rd.nextInt(256);
			g = r;
			b = r;
			System.out.print("\033[48;2;" + r + ";" + g + ";" + b + "m" +"\033[0m");	
		}
		Mu.p("");
	}

}
