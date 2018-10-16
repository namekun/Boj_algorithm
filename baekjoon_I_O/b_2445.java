package baekjoon_I_O;

import java.util.Scanner;

public class b_2445 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			for (int k = (n * 2) - (i * 2); k >= 1; k--) {
				System.out.print(" ");
			}
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

		for (int i = n + 1; i < 2 * n; i++) {
			for (int j = 2 * n - i; j > 0; j--) {
				System.out.print("*");
			}
			for (int k = 2 * i - 2 * n; k > 0; k--) {
				System.out.print(" ");
			}
			for (int j = 2 * n - i; j > 0; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
