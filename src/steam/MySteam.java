package steam;

import java.util.Arrays;
import java.util.List;

public class MySteam {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
		int a = 45;
		//gán tất cả giá trị của list bằng a
		list.forEach(System.out::println);
		System.out.println("====================================");
		list.stream().filter((i)->i%2 ==0).forEach(System.out::println);
	}
}
