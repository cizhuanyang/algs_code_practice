import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdRandom;
import edu.princeton.cs.algs4.ThreeSum;

public class DoublingTest {
	// Ϊ����N���������λ������ThreeSum.count��ʱ
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

	// ��ӡ����ʱ��ı��
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int N = 250; true; N += N) {
			double time = timeTrial(N);
			StdOut.printf("%7d %5.1f\n", N, time);
		}
	}

}
