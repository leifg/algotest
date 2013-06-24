public class Graph
{

    private final Node[] edges;
    private final boolean directed;
    private final int capacity;

    public Graph(int capacity, boolean directed)
    {
	edges = new Node[capacity];
	this.capacity = capacity;
	this.directed = directed;
    }

    public int size()
    {
	return capacity;
    }

    public Node getNode(int value)
    {
	return edges[value];
    }

    public void insert(int toInsert, int successor)
    {

	insertInternal(new Node(toInsert), new Node(successor), this.directed);
    }

    private void insertInternal(Node toInsert, Node successor, boolean directed)
    {
	int curValue = toInsert.getValue();
	Node tmpValue = edges[curValue];
	successor.setNext(tmpValue);
	toInsert.setNext(successor);
	edges[curValue] = toInsert;

	if (!directed)
	{
	    insertInternal(new Node(successor.getValue()), new Node(toInsert.getValue()), true);
	}
    }
}