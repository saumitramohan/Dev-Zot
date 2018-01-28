package org.dev.graph;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

class Neighbor {
		public int vertexNum;
		public Neighbor next;
		public Neighbor (int vertexNum, Neighbor next) {
			this.vertexNum = vertexNum;
			this.next = next;
		}
	}
	
	class Vertex {
		String vertexName;
		Neighbor adjList;
		Vertex(String name, Neighbor neighbours){
			this.vertexName = name;
			this.adjList = neighbours;
		}
	}
	
	public class Graph {
		Vertex[] adjLists;
		public Graph (String file) throws FileNotFoundException{
			Scanner sc = new Scanner(new File(file));
			String graphType = sc.next();
			boolean undirected = true;
			if (graphType.equals("directed")) {
				undirected = false;
			}
			adjLists = new Vertex[sc.nextInt()];
			for (int v = 0; v < adjLists.length; v++) {
				adjLists[v] = new Vertex(sc.next(),null);
			}
			while (sc.hasNext()) {
				int v1 = indexForName(sc.next());
				int v2 = indexForName(sc.next());
				adjLists[v1].adjList = new Neighbor(v2, adjLists[v1].adjList);
				if (undirected){
					adjLists[v2].adjList = new Neighbor(v1, adjLists[v2].adjList);
				}
			}
		}
		private int indexForName(String name) {
			for (int v =0; v <adjLists.length; v++) {
				if (name.equals(adjLists[v].vertexName)) {
					return v;
				}
			}
			return 0;
		}
		
		private void dfs (int v, boolean[] visited) {
			visited[v] = true;
	        System.out.println("visiting " + adjLists[v].vertexName);
	        for (Neighbor nbr = adjLists[v].adjList; nbr!=null; nbr=nbr.next) {
	        	 if (!visited[nbr.vertexNum]) {
	                 System.out.println("\n" + adjLists[v].vertexName + "--" + adjLists[nbr.vertexNum].vertexName);
	                 dfs(nbr.vertexNum, visited);
	             }
	        }

		}
		
		public void dfs() {
			boolean[] visited = new boolean[adjLists.length];
			for (int v = 0; v <adjLists.length; v++) {
				if (!visited[v]) {
					System.out.println("\nSTARTING AT " + adjLists[v].vertexName);
	                dfs(v, visited);
				}
			}
		}
		 public void print() {
		        System.out.println();
		        for (int v=0; v < adjLists.length; v++) {
		            System.out.print(adjLists[v].vertexName);
		            for (Neighbor nbr=adjLists[v].adjList; nbr != null;nbr=nbr.next) {
		                System.out.print(" --> " + adjLists[nbr.vertexNum].vertexName);
		            }
		            System.out.println("\n");
		        }
		    }
		 
		 public static void main(String args[]) throws IOException {
			 Scanner sc = new Scanner(System.in);
		       	System.out.print("Enter graph input file name: ");
		        String file = sc.next();
		        Graph graph = new Graph(file);
		        //graph.print();
		        graph.dfs();
		    }
		 

}
