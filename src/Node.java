import java.util.ArrayList;

public class Node 
{
	private Node node;
	private int data;
	private ArrayList list;
	
	public Node(int data)
	{
		node = null;
		this.data = data;
		list = new ArrayList<Node>();
	}
	
	public Node getNextNode()
	{
		return node + 1;
	}
}
