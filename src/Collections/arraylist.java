package Collections;

import java.util.ArrayList;

public class arraylist {
	public static void main(String[] args) {
		ArrayList<String> city = new ArrayList<>();
		ArrayList<String> country = new ArrayList<>();
		city.add("Kolkata");
		city.add("Chennai");
		country.add("UK");
		country.add("Australia");
		city.addAll(country);
//		city.subList(1, 3).clear();
		city.removeAll(country);
		city.forEach((n) -> System.out.println(n));
		System.out.println("===========================");
		for (String c : country) {
			System.out.println(c);
		}

	}
}
