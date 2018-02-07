import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.Out;

/**
 * @author FrouFrou
 *
 */
public class Cat {
	/**
	 * Reads in a sequence of text files specified as the first command-line
	 * arguments, concatenates them, and writes the results to the file specified as
	 * the last command-line argument.
	 *
	 * @param args
	 *            the command-line arguments
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Out out = new Out(args[args.length-1]);
		for (int i = 0; i < args.length - 1; i++) {
			In in = new In(args[i]);
			String string = in.readAll();

			out.println(string);
		}
		out.close();
	}
}
