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

		c.set(2007, a - 1, b);//set함수의 월(mon)부분은 1이아닌 0부터 시작.

		final String[] week = { " ", "SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT" };
		//day_of_week의 날짜는 1이 일요일이라서 앞에 공백하나를 더주었음.
		System.out.println(week[c.get(c.DAY_OF_WEEK)]);

	}

}
