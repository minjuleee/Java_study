package day14;

public class MyExceptionTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			sendReceipt(12000);
//			sendReceipt(4000000000);
//			sendReceipt(300);
			
			System.exit(0);
		} catch(Exception e) {
			e.printStackTrace();
			
			// 예외가 발생하면 예외 통계DB에 입력
			try {
				// 데이터베이스에 기록
				// 기록하다가 접속이 안되거나 disk full 이면 또 예외 가능
			} catch (Exception e2) {
				// 파일 처리
			}
		}
		finally {	// 무조건 실행되는 부분
			System.out.println("[finally] 오류가 나던지 말던지 나는 실행해라");
		}
		
		System.out.println("[회계 프로그램] 완전히 정상 종료되었습니다.");

	}
	
	public static void sendReceipt(int amt) throws MyException {
		if(amt > 100000000)
			throw new MyException("[B001] 과도한 금액 청구 넌 백퍼 사기");
		else if(amt < 1000) {
			throw new MyException("[B002] 금액 " + amt + "원 정도는 좀 니돈주고 사먹어");
		}
		System.out.println("[sendReceipt()] " + amt + "원 정상처리");
	}
}

class MyException extends Exception {
	
	MyException(String msg){
		super(msg);
		System.out.println("[My Exception] 경찰서 고발");
		System.out.println("[My Exception] 메시지 로그 기록");
		System.out.println("[My Exception] 모든 전원 오프");
		System.out.println("[My Exception] 관련자 모두 무급 출근");
	}
}
