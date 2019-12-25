package hebbal.ds;

public class QueueDemo1 {
	public static void main(String[] args) {
		QueueDemo q = new QueueDemo();
		q.insert(10);
		q.insert(20);
		q.insert(30);
		q.insert(40);
		q.insert(50);
		q.disp();
		System.out.println();
		System.out.println(q.delete());
		System.out.println(q.delete());
		q.disp();
	}
}
