public class Node
{

    private Node next;
    private int value;

    public Node getNext()
    {
	return this.next;
    }
    
    public Node(int value) {
	this.value = value;
    }
    
    public int getValue() {
	return value;
    }
    
    public void setNext(Node next) {
	this.next = next;
    }
    
    @Override
    public String toString()
    {
	return "["+value+" -> "+next+" ]";
    }
}