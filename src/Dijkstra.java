import edu.princeton.cs.algs4.Stack;
import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

/**
 * @author FrouFrou
 * Dijkstra˫ջ�������ʽ��ֵ�㷨
 */
public class Dijkstra {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Stack<Double> vals = new Stack<>();
		Stack<String> ops = new Stack<>();
		while (!StdIn.isEmpty()) {
			// ��ȡ�ַ�����������������ѹ�����ջ
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
			// ����ǡ��������򵯳�������Ͳ���������������ѹ��ջ
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
			// ��������֣���Ϊdoubleѹ��ջ
			else {
				vals.push(Double.parseDouble(string));
			}

		}
		StdOut.print(vals.pop());
	}

}
