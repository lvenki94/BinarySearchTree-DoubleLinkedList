package bst;

import java.io.*;

public class Start
{
	public static void main(String args[])throws IOException
	{
		BufferedReader b = new BufferedReader(new InputStreamReader(System.in));
		
		int in = 0;
		
		BinarySearchTree bSrch = new BinarySearchTree();
		BinarySearchTree tmp = new BinarySearchTree();
		
		do
		{
			in = Integer.parseInt(b.readLine());
			
			
			if(in != 0)
			{
				tmp = new BinarySearchTree(in, null , null);
				
				if(bSrch.getValue() == 0)
				{
					bSrch = tmp;
					System.out.println("Tmp added to bSrch");
				}
				else
				{
					bSrch.addNode(in);
				}
			}
			
		}while(in!=0);
		
		Node node;
		
		System.out.println(bSrch.getValue());
		node = new Node(bSrch.getValue(), null, null);
		BinarySearchTree.dblList.start = node;
		bSrch.treeTraverse();
		
		
		DoubleLinkedList dblList = new DoubleLinkedList();
		dblList = BinarySearchTree.dblList;
		/*node = new Node(10, null);
		
		dblList = new DoubleLinkedList(node);
		node = new Node(20, null, null);
		dblList.addNode(node);
		node = new Node(30, null, null);
		dblList.addNode(node);*/
		
		Node tmp1;
		tmp1 = dblList.start;
		
		while(tmp1.right != null)
		{
			System.out.print(tmp1.getValue()+"<==>");
			tmp1 = tmp1.right;
		}
		
		System.out.println(tmp1.getValue());
	}

}
