import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdRandom;

/**
 * @author FrouFrou
 *
 */
public class Knuth {
	/**
     * Rearranges an array of objects in uniformly random order
     * (under the assumption that {@code Math.random()} generates independent
     * and uniformly distributed numbers between 0 and 1).
     * @param a the array to be shuffled
     */
	public static void shuffle(Object []a) {
		for (int i = 0; i < a.length; i++) {
			int r=(int)(StdRandom.uniform()*(i+1));
			Object swap=a[i];
			a[i]=a[r];
			a[r]=swap;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String []string=StdIn.readAllStrings();
		Knuth.shuffle(string);
		for(int i=0;i<string.length;i++) {
			StdOut.print(string[i]+" ");
		}
	}

}
