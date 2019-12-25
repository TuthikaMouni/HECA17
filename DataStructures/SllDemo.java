import java.util.Scanner;
class Block
{
	int data;
	Block link;
}
class SinglyLinkedList
{
	private Block first = null;
	public Block createNode()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter an element to insert : ");
		Block temp = new Block();
		temp.data = sc.nextInt();
		temp.link = null;
		return temp;
	}
	public void insertFront()
	{
		Block temp = createNode();
		if(first == null)
		{
			first = temp;
		}
		else
		{
			temp.link = first;
			first = temp;
		}
	}
	public void insertRear()
	{
		Block temp = createNode();
		if(first == null)
		{
			first = temp;
		}
		else
		{
			Block current = first;
			while(current.link != null)
			{
				current = current.link;
			}
			current.link = temp;
		}
	}
	public void deleteFront()
	{
		if(first == null) // no object
		{
			System.out.println("List is empty, can't delete");
		}
		else if(first.link == null) // one object
		{
			System.out.println("Deleted data = "+first.data);
			first = null;
		}
		else // >1 object
		{
			System.out.println("Deleted data = "+first.data);
			first = first.link;
		}
	}
	public void deleteRear()
	{
		if(first == null) // no object
		{
			System.out.println("List is empty, can't delete");
		}
		else if(first.link == null) // one object
		{
			System.out.println("Deleted data = "+first.data);
			first = null;
		}
		else // >1 object
		{
			Block current = first;
			while(current.link.link != null)
			{
				current = current.link;
			}
			System.out.println("Deleted data = "+current.link.data);
			current.link = null;
		}
	}
	public void insertAtAnyPosition()
	{
		Block temp = createNode();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the position : ");
		int position = sc.nextInt();
		if(position == 0)
		{
			insertFront();
		}
		else if(position == getCount())
		{
			insertRear();
		}
		else if(position<0 || position>getCount())
		{
			System.out.println("Invalid position");
		}
		else
		{
			Block current = first;
			for(int i=0; i<position-1; i++)
			{
				current = current.link;
			}
			temp.link = current.link;
			current.link = temp;
		}
	}
	public int getCount()
	{
		int count = 0;
		Block current = first;
		while(current != null)
		{
			current = current.link;
			count++;
		}
		return count;
	}
	public void dispList()
	{
		if(first == null)
		{
			System.out.println("List is empty");
		}
		else
		{
			Block current = first;
			while(current != null)
			{
				System.out.print(current.data+" ");
				current = current.link;
			}
			System.out.println();
		}
	}
}
class SllDemo 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		SinglyLinkedList sll = new SinglyLinkedList();
		for(;;)
		{
			System.out.println("1.Insert Front\n2.Insert Rear\n3.Delete Front\n4.Delete Rear\n5.Insert at any position\n6.Display\n7.exit");
			System.out.println("Enter your choice : ");
			int ch = sc.nextInt();
			switch(ch)
			{
				case 1:sll.insertFront();
					   break;
				case 2:sll.insertRear();
					   break;
				case 3:sll.deleteFront();
					   break;
				case 4:sll.deleteRear();
					   break;
				case 5:sll.insertAtAnyPosition();
					   break;
				case 6:sll.dispList();
					   break;
				case 7:System.exit(0);
					   break;
			}
		}
	}
}
