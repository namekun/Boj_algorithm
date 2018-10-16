package baekjoon_I_O;

import java.util.Scanner;

public class b_2438 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();

		for (int i = 0; i < a; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
	}
}
