package company;

import java.util.ArrayList;
import java.util.Scanner;

public class CountQuery {

	static int count;
	static int updateCount;
	static int queryCount;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int k = sc.nextInt();
		ArrayList<Character> sb = new ArrayList();
		for (int i = 0; i < k; i++)
			sb.add('0');

		int t = sc.nextInt();
		char[] ch = new char[t];
		for (int i = 0; i < t; i++) {
			ch[i] = sc.next().charAt(0);
			m1(sb, ch[i]);
		}
		System.out.println(count);
	}

	private static void m1(ArrayList<Character> ch, char k) {
		if (k == '0') {
			update(ch);
		} else {
			query(ch);
		}
	}
	private static void query(ArrayList<Character> ch) {
		if (queryCount == 0) {
			for (int i = 1; i <= 2; i++) {
				if (ch.get(i) == '1') {
					count++;
				}
			}
		} else {
			for (int i = 3; i <= 4; i++) {
				if (ch.get(i) == '1') {
					count++;
				}
			}
		}
		queryCount++;
		System.out.println("Printing in query" + count);

		System.out.println(ch);

	}

	private static void update(ArrayList<Character> ch) {
		if (updateCount == 0) {
			for (int i = 1; i <= 3; i++) {

				int c1 = (ch.get(i) ^ 1);
				ch.set(i, (char) c1);
			}
		} else {
			for (int i = 0; i <= 4; i++) {

				int c1 = (ch.get(i) ^ 1);
				ch.set(i, (char) c1);
			}
		}
		updateCount++;
		System.out.println(ch);
	}
}
