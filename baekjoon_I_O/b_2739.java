package baekjoon_I_O;

import java.util.Scanner;

public class b_2739 {

	public static void main(String[] args) {
		Scanner sc =  new Scanner(System.in);
		int a = sc.nextInt();
		
		for(int b = 1; b <=9; b++) {
			System.out.println(a + " * " + b + " = " + a*b);
		}

	}

}
