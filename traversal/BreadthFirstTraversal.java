import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BreadthFirstTraversal implements ITraverseAglorithm {
	
	private final Graph graph;
	private final boolean[] visited;
	
	public BreadthFirstTraversal(Graph graph) {
		this.graph = graph;
		visited = new boolean[graph.size()];
	}
	
	public List<Integer> getTraversedList(int startNodeIndex) {
		
		if (startNodeIndex > graph.size()) {
			throw new IllegalArgumentException("Start node exceeds size of graph");
		}
		
		final List<Integer> endList = new LinkedList<Integer>();
		Queue<Node> tmpQueue = new LinkedList<Node>();
		
		Node startNode = graph.getNode(startNodeIndex);
		tmpQueue.offer(startNode);
		visited[startNode.getValue()] = true;
		
		while (!tmpQueue.isEmpty()) {
			
			Node tmpNode = tmpQueue.remove();

			
			System.out.println("outer schleife");
			
			while (tmpNode != null) {
				if (!visited[tmpNode.getValue()]) {
					tmpQueue.offer(tmpNode);
					visited[tmpNode.getValue()] = true;
					endList.add(tmpNode.getValue());
				}
				tmpNode = tmpNode.getNext();
			}
		}
		
		return endList;
	}
}