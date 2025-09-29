package day15;

import java.util.HashSet;
import java.util.TreeSet;

public class SetCollection {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1. HashSet
		HashSet hs = new HashSet();
		hs.add("매트릭스");
		hs.add("주글래살래");
		hs.add("쇼생크탈출");
		hs.add(new Puppy());	
		System.out.println("HashSet : " + hs);
		
		// 2. TreeSet
		TreeSet ts = new TreeSet();
		ts.add("매트릭스");
		ts.add("주글래살래");
		ts.add("쇼생크탈출");
		ts.add("터미네이터");
		ts.add("다크나이트");
//		ts.add(new Puppy());	// => Comparator 구현 시 가능함
		System.out.println("TreeSet : " + ts);
		
		TreeSet subSet1 = (TreeSet)ts.subSet("매트릭스", "주글래살래");
		System.out.println("TreeSet : " + subSet1);
		TreeSet subSet2 = (TreeSet)ts.subSet("매트릭스", true, "주글래살래", true);
		System.out.println("TreeSet : " + subSet2);
		TreeSet subSet3 = (TreeSet)ts.subSet("매", "주");
		System.out.println("TreeSet : " + subSet3);
	}

}

class Puppy {
	int age;
	String name;	
}
