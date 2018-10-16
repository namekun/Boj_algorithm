package baekjoon_I_O;

import java.util.Calendar;
import java.util.Scanner;

public class b_1924_UseCalendar{

	private static Scanner sc;

	public static void main(String[] args) {

		Calendar c = Calendar.getInstance();
		sc = new Scanner(System.in);

		int a = sc.nextInt();
		int b = sc.nextInt();

		c.set(2007, a - 1, b);//set�Լ��� ��(mon)�κ��� 1�̾ƴ� 0���� ����.

		final String[] week = { " ", "SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT" };
		//day_of_week�� ��¥�� 1�� �Ͽ����̶� �տ� �����ϳ��� ���־���.
		System.out.println(week[c.get(c.DAY_OF_WEEK)]);

	}

}
