package edu.montana.csci;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		
		ArrayList<Integer> listNodes = new ArrayList<Integer>();
		
		listNodes.add(7);
		listNodes.add(2);
		listNodes.add(8);
		listNodes.add(5);
		listNodes.add(4);
		
		
	   Heap myHeap = new Heap(listNodes);

		
		
		Visualizer tree = new Visualizer(myHeap);
		
		tree.treeBuilder();
		tree.viewGraph();
		/**
		*Graph g = new Graph();
		
		*Vertex v1 = new Vertex(100);
		*Vertex v2 = new Vertex(150);
		*Vertex v3 = new Vertex(50);
		*Vertex v4 = new Vertex(25);
		*Vertex v5 = new Vertex(75);
		
		*g.addEdge(new Edge(v1,v2));
		*g.addEdge(new Edge(v1,v3));
		*g.addEdge(new Edge(v3,v4));
		*g.addEdge(new Edge(v3,v5));
		
		*Visualizer tree = new Visualizer(g);
		
		*tree.treeBuilder();
		*tree.viewGraph();	
		*/
	}

}
