package edu.montana.csci;

public class Main {

	public static void main(String[] args) {
		
		
		
		BinaryTree myTree = new BinaryTree();
		
		BinaryTreeVertex v1 = new BinaryTreeVertex(6);
		BinaryTreeVertex v2 = new BinaryTreeVertex(3);
		BinaryTreeVertex v3 = new BinaryTreeVertex(7);
		BinaryTreeVertex v4 = new BinaryTreeVertex(1);
		BinaryTreeVertex v5 = new BinaryTreeVertex(5);
		BinaryTreeVertex v6 = new BinaryTreeVertex(4);
		BinaryTreeVertex v7 = new BinaryTreeVertex(9);
		BinaryTreeVertex v8 = new BinaryTreeVertex(8);
		
		
		
		myTree.treeInsert(v8);
		myTree.treeInsert(v7);
		myTree.treeInsert(v6);
		myTree.treeInsert(v5);
		myTree.treeInsert(v4);
		//myTree.treeInsert(v4);
		//myTree.treeInsert(v3);
		myTree.treeInsert(v1);
		myTree.treeInsert(v2);
		
		
		System.out.println(myTree.treeSearch(myTree.getRoot(),3 ));
		myTree.treeDelete(v2);	
		System.out.println(myTree.iterativeTreeSearch(myTree.getRoot(),3 ));
		
	   
		//myTree.treeDelete(myTree.treeSearch(myTree.getRoot(),3));
		
		//myTree.treeDelete(myTree.treeSearch(myTree.getRoot(),3));
		//myTree.updateEdges();
		
		
		//myTree.treeInsert(v7);
		
		Visualizer tree = new Visualizer(myTree);
		
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
