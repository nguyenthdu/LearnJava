package Collections;

import java.util.*;

public class linkedlist {
	public static void main(String[] args) {
		Set<Integer> n = new HashSet<>();
		HashSet<Integer> n1 = new HashSet<>();
		n.add(1);
		n.add(2);
		n.add(1);
//		n.forEach((i) -> System.out.println(i));
		Map<Integer, String> m = new HashMap<>();
		m.put(1, "Kolkata");
		m.put(2, "Chennai");
		m.put(3, "UK");
//		 m.clear();
		m.forEach((k, v) -> System.out.println(k + " " + v));
		System.out.println("===========================");
		if(m.containsKey(1)) {
			System.out.println("Key is present");
		}
		if(m.containsValue("Kolkata")) {
			System.out.println("Value is present");
		}
		//entrySet() returns a set view of the mappings contained in this map
		m.entrySet().forEach((e) -> System.out.println(e.getKey() + " " + e.getValue()));
		
		
	}
}
