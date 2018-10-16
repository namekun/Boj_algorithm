package baekjoon_I_O;

import java.util.Scanner;

public class b_11718 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String a;
		while (sc.hasNext()) {
			a = sc.nextLine();
			if (!(a.isEmpty()) && a.length() <= 100) {
				System.out.println(a);
			}
		}
	}
}
