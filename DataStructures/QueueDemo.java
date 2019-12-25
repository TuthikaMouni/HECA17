class QueueDemo 
{
	private	int f = -1;
	private	int r = -1;
	private	int size;
	private	int q[];
	public QueueDemo()
	{
		size = 5;
		q = new int[size];
	}
	public void insert(int element)
	{
		if(r == size-1)
		{
			System.out.println("Queue is overflow");
		}
		else
		{
			q[++r] = element;
		}
	}
	public int delete()
	{
		if(f == r)
		{
			System.out.println("Queue is empty");
			return 0;
		}
		else
		{
			return q[++f];
		}
	}
	public void disp()
	{
		if(f == r)
		{
			System.out.println("Queue is empty");
		}
		else
		{
			for(int i=f+1; i<=r; i++)
			{
				System.out.print(q[i]+"\t");
			}
		}
	}
}
class QueueDemo1
{
	public static void main(String[] args)
	{
		QueueDemo q = new QueueDemo();
		q.insert(10);
		q.insert(20);
		q.insert(30);
		q.insert(40);
		q.insert(50);
		System.out.println();
		q.disp();
		System.out.println();
		System.out.println(q.delete());
		System.out.println(q.delete());
		System.out.println(q.delete());
		System.out.println();
		q.disp();
	}
}