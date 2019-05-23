package graph;

import java.util.*;

public class NetworkGraph {
	public void rec_dfs(int v, Graph g, boolean[] marked) {
		
		Set connections = g.neighbors(v);
	    marked[v] = true;  // Mark vertex v
	    System.out.println(g.get_label(v));   //Do work on each vertex here
	    
	    // Traverse all the neighbors, looking for unmarked vertices:
	    for (Integer x: connections) {
	    		if (!marked[x]) //item not marked
	        rec_dfs(x, g, marked);
	    		
	    		} 
	}
	
	void depth_first(Graph g, int start) {
		
	    boolean[] marked = new boolean[g.MAXIMUM];
	    rec_dfs(start, g, marked);
	    
	}
	
	void breadth_first(Graph g, int start) {
		
	    boolean[] marked = new boolean[g.MAXIMUM];
	    Set connections;
	    Queue vertex_queue = new LinkedList();
	    marked[start] = true;
	    System.out.println(g.get_label(start));
	    vertex_queue.add(start);
	    
	    do {
	    		//Do work on first vertex here
	    		connections = g.neighbors(vertex_queue.peek( ));
	    		vertex_queue.remove();
	    		// Mark and process the unmarked neighbors,
	    		// and place them in the queue.
	    		for (Integer x: connections) {
	    			if (!marked[x]) {
	    				marked[x] = true;
	    				System.out.println(g.get_label(x)); //Do work on next vertex here
	    				vertex_queue.add(x);
	    			} 
	    		}
	
	    }
	
	    while (!vertex_queue.isEmpty() );
	} 
	
	public static void main(String[] args) {
		List<Integer> l[] = new LinkedList[10];
	}
}
	 