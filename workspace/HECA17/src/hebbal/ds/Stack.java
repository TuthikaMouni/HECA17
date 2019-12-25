package hebbal.ds;

public class Stack {
	private int top = -1;
	private int size;
	private int s[];
	public Stack()
	{
		size = 5;
		s = new int[size];
	}
	public Stack(int size)
	{
		s = new int[size];
	}
	public void push(int element)
	{
		if(top == size-1)
		{
			System.out.println("Stack Overflow");
		}
		else
		{
			s[++top] = element;
		}
	}
	public int pop()
	{
		if(top == -1)
		{
			System.out.println("Stack underflow");
			return 0;
		}
		else
		{
			return s[top--];
		}
	}
	public void disp()
	{
		if(top == -1)
		{
			System.out.println("Stack underflow, can't print disp");
		}
		else
		{
			for(int i=top; i>=0; i--)
			{
				System.out.println(s[i]);
			}
		}
		
	}
	public boolean isEmpty()
	{
		return top == -1?true:false;
	}
	public int peek()
	{
		return s[top];
	}
	public String toString()
	{
		String st = "";
		for(int i=top; i>=0; i--)
		{
			st = st+s[i]+"\n";
		}
		return st;
	}
}
