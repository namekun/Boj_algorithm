package baekjoon_I_O;

import java.util.Scanner;

public class b_2439 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();

		for (int i = 1; i < a + 1; i++) {
			for (int j = 0; j < a - i; j++) {
				System.out.print(" ");
			}
			for (int z = 0; z < i; z++) {
				System.out.print("*");
			}
			System.out.println("");
		}

	}

}
