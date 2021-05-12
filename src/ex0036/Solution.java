package ex0036;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Solution {

	public static void main(String[] args) {
		Solution m = new Solution();

		char[][] board = { { '5', '3', '.', '.', '7', '.', '.', '.', '.' },
				{ '6', '.', '.', '1', '9', '5', '.', '.', '.' }, { '.', '9', '8', '.', '.', '.', '.', '6', '.' },
				{ '8', '.', '.', '.', '6', '.', '.', '.', '3' }, { '4', '.', '.', '8', '.', '3', '.', '.', '1' },
				{ '7', '.', '.', '.', '2', '.', '.', '.', '6' }, { '.', '6', '.', '.', '.', '.', '2', '8', '.' },
				{ '.', '.', '.', '4', '1', '9', '.', '.', '5' }, { '.', '.', '.', '.', '8', '.', '.', '7', '9' } };

		char[][] board2 = { { '8', '3', '.', '.', '7', '.', '.', '.', '.' },
				{ '6', '.', '.', '1', '9', '5', '.', '.', '.' }, { '.', '9', '8', '.', '.', '.', '.', '6', '.' },
				{ '8', '.', '.', '.', '6', '.', '.', '.', '3' }, { '4', '.', '.', '8', '.', '3', '.', '.', '1' },
				{ '7', '.', '.', '.', '2', '.', '.', '.', '6' }, { '.', '6', '.', '.', '.', '.', '2', '8', '.' },
				{ '.', '.', '.', '4', '1', '9', '.', '.', '5' }, { '.', '.', '.', '.', '8', '.', '.', '7', '9' } };

		boolean ret = m.isValidSudoku(board2);

		System.out.println(ret);

//		System.out.println(m.hash(new String("1..").toCharArray()));
//		System.out.println(m.hash(new String(".1.").toCharArray()));
//		System.out.println(m.hash(new String("..1").toCharArray()));
//		System.out.println(m.hash(new String("123").toCharArray()));
//		System.out.println(m.hash(new char[] { 1, 0, 0 }));
//		System.out.println(m.hash(new char[] { 0, 1, 0 }));
//		System.out.println(m.hash(new char[] { 0, 0, 1 }));
//		System.out.println(Arrays.hashCode(new int[] { 1, 3, 2 }));
	}

	public boolean isValidSudoku(char[][] board) {
		char[] a = new char[9];
		char[] b = new char[9];
		char[] c = new char[9];
		int u = 0, v = 0, w = 0;

		Map<Integer, char[]> columns = new HashMap<>();

		for (int i = 0; i < board.length; i++) {
			char[] cs = board[i];

			if (!isValid(cs)) {
				return false;
			}

			for (int j = 0; j < cs.length; j++) {
				if (j < 3) {
					a[u++] = board[i][j];
				} else if (j < 6) {
					b[v++] = board[i][j];
				} else {
					c[w++] = board[i][j];
				}

				if (columns.get(j) == null) {
					columns.put(j, new char[9]);
				}
				columns.get(j)[i] = board[i][j];
			}

			if (i > 0 && (i + 1) % 3 == 0) {
				System.out.println(i);

				if (!isValid(a) || !isValid(b) || !isValid(c)) {
					return false;
				}

				a = new char[9];
				b = new char[9];
				c = new char[9];

				u = 0;
				v = 0;
				w = 0;
			}

		}

		for (char[] d : columns.values()) {
			if (!isValid(d)) {
				return false;
			}
		}

		return true;

	}

	public boolean isValid(char[] z) {

		boolean primes[] = { false, false, false, false, false, false, false, false, false };

		for (int i = 0; i < z.length; i++) {
			char c = z[i];
			int number = 0;
			if (c != '.') {
				number = c - '0';
			} else {
				continue;
			}

			if (primes[number - 1]) {
				return false;
			} else {
				primes[number - 1] = true;
			}

		}
		return true;

	}

}
