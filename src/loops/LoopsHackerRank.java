package loops;

import java.util.Scanner;

public class LoopsHackerRank {
	//	public static void main(String[] args) throws IOException {
//
//		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//		int N = Integer.parseInt(bufferedReader.readLine().trim());
//		for (int i = 1; i <= 10; i++) {
//			System.out.println(N + " x " + i + " = " + N * i);
//		}
//
//		bufferedReader.close();
//	}
//	public static void main(String[] args) throws IOException {
//		BufferedReader bufferedReader = new BufferedReader(new java.io.InputStreamReader(System.in));
//		int N = Integer.parseInt(bufferedReader.readLine().trim());
//		while(N >= 0) {
//			//đọc 3 số trên 1 dòng lưu vào 3 biến
//			String[] arr = bufferedReader.readLine().trim().split(" ");
//			int a = Integer.parseInt(arr[0]);
//			int b = Integer.parseInt(arr[1]);
//			int n = Integer.parseInt(arr[2]);
//			int sum = a;
//			for(int i = 0; i < n; i++) {
//				sum += Math.pow(2, i) * b;
//				System.out.print(sum + " ");
//			}
//			System.out.println();
//			N--;
//		}
//		bufferedReader.close();
//	}
	public static void main(String[] argh) {
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		int x;
		for(int i = 0; i < t; i++) {
			int a = in.nextInt();
			int b = in.nextInt();
			int n = in.nextInt();
			for(int j = 0; j < n; j++) {
				x = a;
				for(int k = 0; k <= j; k++) {
					x = x + (int) Math.pow(2, k) * b;
				}
				System.out.print(x + " ");
			}
			System.out.println();
		}
		in.close();
	}
}
