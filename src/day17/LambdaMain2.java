package day17;

import java.util.ArrayList;

import utils.Mu;

public class LambdaMain2 {
	static int count = 0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 4. Lambda II : return 값이 있는 메서드인 경
		CalculableReturn c3 = (x) -> { 
			System.out.println("Return???");
			return x * x * 3.14;
		};
		Mu.p("[람다리턴] " + c3.calculate(100));
		
		// 5. 인풋이 1개 뿐이면 괄호도 생략
		CalculableReturn c4 = x -> { 
			System.out.println("Return???");
			return x * x * 3.14;
		};
		Mu.p("[람다리턴] " + c4.calculate(100));
		
		// 6. 리턴이 한 줄만 존재하면 중괄호도 생략
		CalculableReturn c5 = x -> x * x * 3.14;
		Mu.p("[람다리턴] " + c5.calculate(100));
		
		// 7. 인터페이스를 별 의미도 없는데 내가 만들어야 하나???
		// Java가 여러 곳에서 사용될 수 있는 인터페이스(들)을 만들어놓음 
		// UnaryOperator : 1개 입력, 1개 출력
		// BinaryOperator : 2개 입력, 1개 출력
		// Consumer, forEach
		
		// 8. 람다식의 대표적인 예제 -> forEach
		ArrayList<String> al = new ArrayList();
		al.add("Led Zepplin");
		al.add("Metalica");
		al.add("Queen");
		al.add("Stryper");
		al.add("Huntrix");
		
		for(String name : al) {
			Mu.p(name);
		}
		
		al.forEach(name -> System.out.println(name + " : " + name.length()));
		
		
		al.forEach(name -> { 
			count++; 
			System.out.println(count);	// for문처럼 하나씩 수행되는 것을 알 수 있음
		});
		
		// 입력이 들어가서 아무 가공없이 사용될 경우
		al.forEach(System.out::println);
		al.forEach(Mu::p);
	}

}
