/**
 * Node Class
 * 
 * A Node consists of three parts.
 * The value to be stored
 * The Left Node
 * The Right Node
 * Mainly used for Double Linked List
 * 
 * Venkatesh L
 */

package bst;


public class Node
{
	int value;
	Node left;
	Node right;

	/**
	 * A parameterized constructor that initializes the Node Object
	 * @param val The value of the Node
	 * @param l The Left Node
	 * @param r The right Node
	 */
	Node(int val, Node l, Node r)
	{
		value = val;
		left = l;
		right = r;
	}
	
	/**
	 * A parameterized constructor that is used to initialize the first node object or the head
	 * @param val The value of the Node
	 * @param r
	 */
	Node(int val, Node r)
	{
		value = val;
		left = null;
		right = r;
	}
	
	public int getValue()
	{
		return value;
	}
	
	public Node getLeft()
	{
		return left;
	}
	
	public Node getRight()
	{
		return right;
	}

}
