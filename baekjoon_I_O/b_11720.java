package baekjoon_I_O;

import java.util.Scanner;

public class b_11720 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		String num = sc.next();
		int sum = 0;

		if ( n < 1 || n > 100|| n != num.length()) {
			System.out.println("Error!");
		} else {
			for (int i = 0; i < n; i++) {
				int a = Character.digit(num.charAt(i), n + 1);
				sum = sum + a;
			}
			System.out.println(sum);
		}
	}
}

// string으로 받고, charAt로 나누고, ParseInt로 int값으로 변환할것!