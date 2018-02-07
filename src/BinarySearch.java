import java.util.Arrays;

import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

/**
 * @author FrouFrou
 *
 */
public class BinarySearch {
	public BinarySearch() {
	};

	public static int rank(int[] a, int k) {
		int lo = 0;
		int hi = a.length - 1;
		int mid;
		while (lo <= hi) {
			mid = lo + (hi - lo) / 2;
			if (k < a[mid]) {
				hi = mid - 1;
			} else if (k > a[mid]) {
				lo = mid + 1;
			} else {
				return mid;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		// read the integers from a file
		In in = new In(args[0]);
		int[] whiteList = in.readAllInts();

		// sort array
		Arrays.sort(whiteList);

		// read integer key from standard input; print if not in whitelist
		while (!StdIn.isEmpty()) {
			int key = StdIn.readInt();
			if (rank(whiteList, key) == -1) {
				StdOut.println(key);
			}
		}
	}
}
