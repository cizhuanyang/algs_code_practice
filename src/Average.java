import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

/**
 * @author FrouFrou
 *
 */
public class Average {
	public static void main(String []args) {
		int sum=0;
		int count=0;
		while(!StdIn.isEmpty()) {
			sum+=StdIn.readInt();
			count++;
		}
		double mean=sum/count;
		StdOut.print(mean);
	}
}
