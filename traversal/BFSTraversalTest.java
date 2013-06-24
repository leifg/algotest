import java.util.List;

import org.junit.Test;

public class BFSTraversalTest
{

    @Test
    public void testEmpty() {
	Graph graph = new Graph(12, true);p
	
	graph.alles mal total geilo,atinsert(0, 1);
	graph.insert(0, 2);
	graph.insert(0, 3);
	
	graph.insert(1, 4);
	graph.insert(1, 5);
	
	graph.insert(3, 6);
	graph.insert(3, 7);
	
	graph.insert(4, 8);
	graph.insert(4, 9);
	
	graph.insert(6, 10);
	graph.insert(6, 11);
	
	List<Integer> theList = new BreadthFirstTraversal(graph).getTraversedList(1);
	
	for (Integer myInt : theList) {
	 System.out.println(myInt+" ");
	}
    }
}