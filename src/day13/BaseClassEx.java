package day13;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import utils.Mu;

public class BaseClassEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 1. System
		long currentTime = System.currentTimeMillis();
		Mu.p("Current Time : " + currentTime);
		
		long point1, point2;
		long elapsedTime;
		
		point1 = System.currentTimeMillis();
		
		for(int i=0; i<1000000000; i++) {
			;
		}
		
		point2 = System.currentTimeMillis();
		elapsedTime = point2 - point1;
		Mu.p("for 1억번 수행 시간 : " + elapsedTime + "(ms)");
		
		// 2. StringBuffer
		StringBuffer sb = new StringBuffer();
		sb.append("Eriks SteakHouse");
		System.out.println(sb);
		sb.insert(6, "(Famous) ");
		System.out.println(sb);
//		sb.insert(100, "I am genius"); // 인덱스 범위(문장려의 길이)를 넘어감
		sb.delete(1, 10);
		System.out.println(sb);
		sb.delete(3, 100000);	// delete는 종료 인덱스를 큰 숫자를 넣어도 동작
		System.out.println(sb);
		
		// String과 StringBuffer의 Performance Contest
		String app1 = "";
		StringBuffer app2 = new StringBuffer();
		
		final int SAMPLE_CNT = 10000;
		long elaspedTime1, elaspedTime2;
		
		point1 = System.currentTimeMillis();
		for(int i=0; i<SAMPLE_CNT; i++) {
			app1 = app1 + i;	//0 01 012 0123
		}
		point2 = System.currentTimeMillis();
		elaspedTime1 = point2 - point1;
		
		point1 = System.currentTimeMillis();
		for(int i=0; i<SAMPLE_CNT; i++) {
			app2.append(i);	//0 01 012 0123
		}
		point2 = System.currentTimeMillis();
		elaspedTime2 = point2 - point1;
		
		Mu.p("*** Performance Contest Result ***");
		Mu.p("String : " + elaspedTime1 + "(ms)");
		Mu.p("StringBuffer : " + elaspedTime2 + "(ms)");
		
		// 3. Math
		// getRound라는 메서드를 만든다. getRound(double a, int b)
		// a를 b자리에서 반올림 => getRound(100.38, 1) => 100.4
		// Math.round(100.38) => 100을 이용하시오.
		
		Mu.p("getRound : " + getRound(100.3872, 3));
		
		// 4. Date & Calendar
		Date d = new Date();	// 현재 시간
		Mu.p("현재 시간 : " + d);
		
		// format이 심하게 맘에 들지 않을 경우 => SimpleDateFormat
		SimpleDateFormat f1 = new SimpleDateFormat("yyyyMMdd");
		Mu.p("현재 시간 : " + f1.format(d));
		SimpleDateFormat f2 = new SimpleDateFormat("yyyy-MM-dd");
		Mu.p("현재 시간 : " + f2.format(d));
		SimpleDateFormat f3 = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		Mu.p("현재 시간 : " + f3.format(d));
		
		// Calendar
		Calendar c = Calendar.getInstance();
		
		// get 메서드로 내가 원하는 달력의 값을 얻어낼 수 있음
		Mu.p("오늘의 요일 : " + c.get(Calendar.DAY_OF_WEEK));
		Mu.p("오늘의 연도 : " + c.get(Calendar.YEAR));
		Mu.p("오늘의 월 : " + (c.get(Calendar.MONTH) + 1));	// month는 1더해야함
		Mu.p("오늘의 일 : " + c.get(Calendar.DAY_OF_MONTH));
		Mu.p("오늘의 이번 연도의 몇 번째 날이냐? : " + c.get(Calendar.DAY_OF_YEAR));
		Mu.p("오늘의 이번 연도의 몇 번째 날이냐? : " + c.get(6));
		Mu.p("오늘의 이번 연도의 몇 번째 주냐? : " + c.get(Calendar.WEEK_OF_YEAR));
		
		
	}
	public static double getRound(double a, int b) {
		double result = a;
		
		// 10을 b의 회수만큼 곱한다.
		for(int i=0; i<b; i++) {
			result = result * 10;
		}
		
		// Math.round - 소수점 이하를 버리면서 반올림
		result = Math.round(result);
		
		// 10을 b의 회수만큼 나눈다.
		for(int i=0; i<b; i++) {
			result = result / 10;
		}
		
//		double res1 = a * (10 ^ b);
//		double res2 = Math.round(res1);
//		result = res2 / (10 ^ b);
		return result;
	}

}
