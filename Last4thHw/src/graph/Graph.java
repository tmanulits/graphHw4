package graph;

import java.util.*;

public class Graph {
	class Edge {
		int v,w;
		public Edge(int v, int w) {
			this.v = v;
			this.w = w;
		}
		
		public String toString() {
			return "("+v+","+w+")";
		}
	}

	public static final int MAXIMUM = 0;
	
	List<Edge> G[];
	
	public Graph(int n) {
		G = new LinkedList[n];
		
		for (int i = 0; i < G.length; i++) {
			G[i] = new LinkedList<Edge>();
		}
	}
	@Override
	public String toString() {
		String result = "";
		for (int i = 0; i < G.length; i++) {
			result += i + "=>" + G[i] + "\n";
		}
		return result;
	}
	public Set neighbors(Object object) {
		// TODO Auto-generated method stub
		return null;
	}
	public char[] get_label(int v) {
		// TODO Auto-generated method stub
		return null;
	}
}
