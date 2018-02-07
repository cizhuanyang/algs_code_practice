import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.Queue;

/**
 * @author FrouFrou
 *
 */
public class QueueUseCase {

	//队列的一种使用用例，In类静态方法readInts的实现
	public static int[] readInts(String name){
		In in=new In(name);
		Queue<Integer> q=new Queue<>();
		while(!in.isEmpty()){
			q.enqueue(in.readInt());
		}
		int N=q.size();
		int []a=new int[N];
		for(int i=0;i<N;i++){
			a[i]=q.dequeue();
		}
		return a;
	}
}
