import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdRandom;

/**
 * @author FrouFrou
 *
 */
public class RandomSeq {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int N=Integer.parseInt(args[0]);
		double lo=Double.parseDouble(args[1]);
		double hi=Double.parseDouble(args[2]);
		for(int i=0;i<N;i++) {
			StdOut.printf("%.2f\n", StdRandom.uniform(lo,hi));
		}
	}

}
