import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdRandom;
import edu.princeton.cs.algs4.ThreeSum;

public class DoublingTest {
	// 为处理N个随机的六位整数的ThreeSum.count计时
	public static double timeTrial(int N) {
		int MAX = 1000000;
		int[] a = new int[N];
		for (int i = 0; i < N; i++) {
			a[i] = StdRandom.uniform(-MAX, MAX);
		}
		StopWatch stopWatch = new StopWatch();
		int cnt = ThreeSum.count(a);
		double time = stopWatch.elapsedTime();
		return time;
	}

	// 打印运行时间的表格
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int N = 250; true; N += N) {
			double time = timeTrial(N);
			StdOut.printf("%7d %5.1f\n", N, time);
		}
	}

}
