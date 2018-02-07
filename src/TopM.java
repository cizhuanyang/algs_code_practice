import edu.princeton.cs.algs4.MinPQ;
import edu.princeton.cs.algs4.Stack;
import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.Transaction;

public class TopM {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//��ӡ������������M��
		int M=Integer.parseInt(args[0]);
		MinPQ<Transaction>pq=new MinPQ<Transaction>(M+1);
		//Ϊ��һ�����봴��һ��Ԫ�ز��������ȶ�����
		while(StdIn.hasNextLine()) {
			pq.insert(new Transaction(StdIn.readLine()));
			if (pq.size()>M) {
				//������ȶ����д���M+1��Ԫ����ɾ��������С��Ԫ��
				pq.delMin();
			}
		}//����M��Ԫ�ض������ȶ�����
		Stack<Transaction>stack=new Stack<Transaction>();
		while(!pq.isEmpty())
			stack.push(pq.delMin());
		for(Transaction transaction:stack) StdOut.print(transaction);
		
	}

}
