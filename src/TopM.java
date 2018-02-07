import edu.princeton.cs.algs4.MinPQ;
import edu.princeton.cs.algs4.Stack;
import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.Transaction;

public class TopM {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//打印输入流中最大的M行
		int M=Integer.parseInt(args[0]);
		MinPQ<Transaction>pq=new MinPQ<Transaction>(M+1);
		//为下一行输入创建一个元素并放入优先队列中
		while(StdIn.hasNextLine()) {
			pq.insert(new Transaction(StdIn.readLine()));
			if (pq.size()>M) {
				//如果优先队列中存在M+1个元素则删除其中最小的元素
				pq.delMin();
			}
		}//最大的M个元素都在优先队列中
		Stack<Transaction>stack=new Stack<Transaction>();
		while(!pq.isEmpty())
			stack.push(pq.delMin());
		for(Transaction transaction:stack) StdOut.print(transaction);
		
	}

}
