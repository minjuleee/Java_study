package day15;

import java.util.ArrayList;
import java.util.LinkedList;

public class ListCollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 1. ArrayList
		ArrayList al = new ArrayList();
		
		// (1) 리스트에 요소 추가
		al.add("돈까스");
		al.add("치킨까스");
		al.add("쌀국수");
		al.add("라면");
		System.out.println(al);
		
		for(int i=0; i<al.size(); i++) {
			System.out.println("[" + i + "]" + al.get(i));
		}
		
		// (2) 요소 삭제 : remove()
		al.remove(1);
		System.out.println(al);
		al.remove("돈까스");
		System.out.println(al);
		al.add(1);
		System.out.println(al);
		al.remove(1);	// 숫자는 무조건 인덱스를 의미, int는 Object의 후손이 아님
		System.out.println(al);
		
		// (3) 요소 변경 : set()
		al.set(1, "빠에야");
		System.out.println(al);
		
		// (4) 없는 인덱스로 데이터 얻어오기
		try {
			System.out.print(al.get(100)); 
		}
		catch(Exception e) {
			System.out.print("[메뉴없음] 니가 직접 해먹어\n");
		}
		
		// (5) 요소 개수 구하기 : size()
		System.out.println("총 메뉴의 개수는 " + al.size() + "개 입니다.");
		
		// (6) 요소가 있는지 알아보기 : contains() -> true, false
		System.out.println("쌀국수 있나요? " + al.contains("쌀국수"));
		System.out.println("라면 있나요? " + (al.contains("라면")? "있어" : "없어"));
	
		
		// 2. LinkedList
		LinkedList ll = new LinkedList();
		ll.add("원피스");
		ll.add(0, "폭싹");
		ll.add(1, "사랑의하츄핑");
		System.out.println(ll);
		
		// 3. Performance Test
		ArrayList app1 = new ArrayList();
		LinkedList app2 = new LinkedList();
		
		final int SAMPLES = 10000;
		
		for(int i=0; i<SAMPLES; i++) {
			app1.add(i);
			app2.add(i);
		}
		
		// read test
		long start, mid, end;
		start = System.currentTimeMillis();
		for(int i=0; i<SAMPLES; i++)
			app1.get(i);
		mid = System.currentTimeMillis();
		for(int i=0; i<SAMPLES; i++)
			app2.get(i);
		end = System.currentTimeMillis();
		
		System.out.println("**** Read Cometition ****");
		System.out.println("ArrayList : " + (mid - start));
		System.out.println("LinkedList : " + (end - mid));
		
		// insert test
		start = System.currentTimeMillis();
		for(int i=0; i<SAMPLES; i++)
			app1.add(7000, i);
		mid = System.currentTimeMillis();
		for(int i=0; i<SAMPLES; i++)
			app2.add(7000, i);
		end = System.currentTimeMillis();
		
		System.out.println("");
		System.out.println("**** Insert Cometition ****");
		System.out.println("ArrayList : " + (mid - start));
		System.out.println("LinkedList : " + (end - mid));
			
	}

}
