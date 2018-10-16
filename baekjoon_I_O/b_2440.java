package baekjoon_I_O;

import java.util.Scanner;

public class b_2440 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		if (a > 0 && a < 101) {
			for (int i = 1; i < a + 1; i++) {
				for (int j = 0; j <= a - i; j++) {
					System.out.print("*");
				}
				/*for (int z = 0; z < i-1; z++) {
					System.out.print(" ");
				}*/
				System.out.println("");
			}

		}
	}
}
