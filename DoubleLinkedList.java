package bst;

public class DoubleLinkedList 
{
	Node start;
	Node end;
	int length;
	
	DoubleLinkedList()
	{
		start = null;
		end = null;
		length = 0;
	}
	
	DoubleLinkedList(Node obj)
	{
		start = obj;
		length++;
	}
	
	public int length()
	{
		return length;
	}
	
	public void addNode(Node obj)
	{
		Node tmp = start;
		
		while(tmp.right != null)
		{
			tmp = tmp.right;
		}
		
		obj.right = null;
		tmp.right = obj;
		obj.left = tmp;
		length++;
	}
}
