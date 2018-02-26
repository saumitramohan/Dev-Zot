package org.dev.graph;

import java.util.Iterator;
import java.util.LinkedList;

public class BaseGraph {

	private int V;
	private LinkedList<Integer> adjList[];
	BaseGraph(int v){
		this.V = v;
		adjList = new LinkedList[v];
		for (int i = 0; i < v; i++ )
		adjList[i] = new LinkedList<Integer>();
	}
	
	void addEdge(int v, int w) {
		adjList[v].add(w);
		//direcdt
		adjList[w].add(v);
	}
	
	Boolean isCyclic() {
		Boolean visited[] = new Boolean[this.V];
		for (int i=0;i < this.V; i++) {
			visited[i] = false;
		}
		for (int u =0; u < this.V;u++) {
			if (!visited[u]) {
				if (isCyclicUtil(u, visited, -1))
                    return true;
			}
		}
		return false;
		
	}
	Boolean isCyclicUtil(int v, Boolean visited[], int parent) {
		visited[v] = true;
		Iterator<Integer> it;
		it = adjList[v].listIterator();
		while (it.hasNext()) {
			Integer i = it.next();
			if (!visited[i]) {
				if (isCyclicUtil(i, visited, v)) {
					return true;
				}
				
			}
			else if (i != parent) {
				return true;
			}
		}
		return false;
		
	}
	
	 public static void main(String args[])
	    {
	        // Create a graph given in the above diagram
	        BaseGraph g1 = new BaseGraph(5);
	        g1.addEdge(1, 0);
	        g1.addEdge(0, 2);
	        g1.addEdge(2, 0);
	        g1.addEdge(0, 3);
	        g1.addEdge(3, 4);
	        if (g1.isCyclic())
	            System.out.println("Graph contains cycle");
	        else
	            System.out.println("Graph doesn't contains cycle");
	 
	        BaseGraph g2 = new BaseGraph(3);
	        g2.addEdge(0, 1);
	        g2.addEdge(1, 2);
	        if (g2.isCyclic())
	            System.out.println("Graph contains cycle");
	        else
	            System.out.println("Graph doesn't contains cycle");
	    }
	}
	

