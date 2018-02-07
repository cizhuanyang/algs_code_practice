import edu.princeton.cs.algs4.Stack;
import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

/**
 * @author FrouFrou
 * Dijkstra双栈算数表达式求值算法
 */
public class Dijkstra {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Stack<Double> vals = new Stack<>();
		Stack<String> ops = new Stack<>();
		while (!StdIn.isEmpty()) {
			// 读取字符，如果是运算符，则压入符号栈
			String string = StdIn.readString();
			if (string.equals("("))
				;
			else if (string.equals("+"))
				ops.push(string);
			else if (string.equals("-"))
				ops.push(string);
			else if (string.equals("*"))
				ops.push(string);
			else if (string.equals("/"))
				ops.push(string);
			// 如果是“）”，则弹出运算符和操作数，将计算结果压入栈
			else if (string.equals(")")) {
				String op = ops.pop();
				double caculateValue = vals.pop();
				if (op.equals("+"))
					caculateValue = caculateValue + vals.pop();
				else if (op.equals("-"))
					caculateValue = caculateValue - vals.pop();
				else if (op.equals("/"))
					caculateValue = vals.pop() / caculateValue;
				else if (op.equals("*"))
					caculateValue = caculateValue * vals.pop();
				vals.push(caculateValue);
			}
			// 如果是数字，作为double压入栈
			else {
				vals.push(Double.parseDouble(string));
			}

		}
		StdOut.print(vals.pop());
	}

}
