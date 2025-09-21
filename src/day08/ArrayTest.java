package day08;

import java.util.Random;

import utils.Mu;

public class ArrayTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 열 개의 이름, 열 개의 임의의 점수(소수점 1자)
		// 점수 중 최고점과 최저점을 찾은 후
		// 그에 해당하는 이름과 점수를 출력
		
		// 1. 10개의 이름 설정하기
		String[] names = {"가", "나", "다", "라", "마", "바", "사", "아", "자", "차"};
		
		
		// 2. 10개의 임의의 점수(소수점1자리) 생성하기 - float[] scores
		Random rd = new Random();
		float[] scores = new float[10];
		
		// (1) 0 ~ 1 사이의 소수를 뽑은 후 만드는 방법
		float score1 = rd.nextFloat();
		Mu.p("" + score1);
		score1 = score1 * 1000;	// score1 : 0 ~ 1000사이의 소수
		score1 = (int)score1; // score1 : 0 ~ 1000사이의 정수
		score1 = score1 / 10;
		
		// (2) 0 ~ 1000 사이의 정수를 뽑은후 만드는 방법
		float score2 = rd.nextInt(1001) / 10F;
		
		for(int i=0; i<scores.length; i++) {
			scores[i] =rd.nextInt(1001) / 10F;
		}
		
		// 3. 최고점과 최저점, 최고점의 인덱스, 최저점의 인덱스 변수 생성
		int indexTop = 0, indexBottom = 0;
		float scoreTop = 0, scoreBottom = 100;
		
		// 4. 최고점과 최저점 찾기(핵심)
		for (int i=0; i<scores.length; i++) {
			if(scoreTop <= scores[i]) {
				scoreTop = scores[i];
				indexTop = i;
			}
			if(scoreBottom >= scores[i]) {
				scoreBottom = scores[i];
				indexBottom = i;
			}
		}
		
		
		// 5. 출력하기
		// Top Score : XX.X(이름)
		// Bottom Score : XX.X(이름)
		Mu.p("Top Score : " + scoreTop + "(" + names[indexTop] + ")");
		Mu.p("Bottom Score : " + scoreBottom + "(" + names[indexBottom] + ")");

	}

}
