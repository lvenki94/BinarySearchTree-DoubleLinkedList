package bst;

public class BinarySearchTree 
{

	int value;
	BinarySearchTree left;
	BinarySearchTree right;
	
	static DoubleLinkedList dblList = new DoubleLinkedList();
	
	BinarySearchTree()
	{
		value = 0;
		left = null;
		right = null;
	}
	
	BinarySearchTree(int val, BinarySearchTree l, BinarySearchTree r)
	{
		value = val; 
		left = l;
		right = r;
	}
	
	public void addLeft(BinarySearchTree nodeLeft)
	{
		left = nodeLeft;
	}
	
	public void addRight(BinarySearchTree nodeRight)
	{
		right = nodeRight;
	}
	
	public BinarySearchTree getLeft(BinarySearchTree bst)
	{
		return bst.getCurrentLeft();
	}
	
	public BinarySearchTree getRight(BinarySearchTree bst)
	{
		return bst.getCurrentRight();
	} 
	
	public BinarySearchTree getCurrentLeft()
	{
		return left;
	}
	
	public BinarySearchTree getCurrentRight()
	{
		return right;
	}
	
	public int getValue()
	{
		return value;
	}
	
	public void addNode(int val)
	{
		
		BinarySearchTree tmp = new BinarySearchTree(val, null, null);
		
		int tmpValue = getValue();
		BinarySearchTree tmpLeft = getCurrentLeft();
		BinarySearchTree tmpRight = getCurrentRight();
		
		if(val < tmpValue)
		{
			if(tmpLeft == null)
			{
				addLeft(tmp);
			}
			else
			{
				tmpLeft.addNode(val);
			}
		}
		else if(val > tmpValue)
		{
			if(tmpRight == null)
			{
				addRight(tmp);
			}
			else
			{
				tmpRight.addNode(val);
			}
		}
			
	}
	
	public void treeTraverse()
	{
		Node node;
		
		BinarySearchTree tmpLeft = getCurrentLeft();
		BinarySearchTree tmpRight = getCurrentRight();
		
		if(tmpLeft != null)
		{
			System.out.println(tmpLeft.getValue());
			node = new Node(tmpLeft.getValue(), null, null);
			if(dblList.start == null)
			{
				dblList.start = node;
			}
			else
			{
				Node tmp1 = dblList.start;
				while(tmp1.right != null)
				{
					tmp1= tmp1.right;
				}
				
				node.right = null;
				node.left = tmp1;
				tmp1.right = node;
			}
		}
		
		if(tmpRight != null)
		{
			System.out.println(tmpRight.getValue());
			
			node = new Node(tmpRight.getValue(), null, null);
			if(dblList.start == null)
			{
				dblList.start = node;
			}
			else
			{
				Node tmp1 = dblList.start;
				while(tmp1.right != null)
				{
					tmp1 = tmp1.right;
				}
				
				node.right = null;
				node.left = tmp1;
				tmp1.right = node;
			}
		}
		
		if(tmpLeft != null)
		{
			tmpLeft.treeTraverse();
		}
		if(tmpRight != null)
		{
			tmpRight.treeTraverse();
		}
		
	}
}
