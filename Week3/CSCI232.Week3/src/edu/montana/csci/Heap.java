package edu.montana.csci;


import java.util.ArrayList;

public class Heap extends BinaryTree{
		
	private ArrayList<HeapVertex> heap = new ArrayList<HeapVertex>();
	
	public Heap(ArrayList<Integer> list) {	
		for (Integer value:list) {
			addVertex(new HeapVertex(value));
		}
		
		for (int a=0; a < heap.size(); a++) {
			if ((a*2) + 1 < heap.size()) {
				(heap.get(a)).setLeftChild(heap.get((a*2) + 1));
			}
			if ((a*2) +2 < heap.size()) {
				(heap.get(a)).setRightChild(heap.get((a*2) + 2));
			}
		}
		
		this.setRoot(heap.get(0));	
		
	}
	
	public void addVertex(HeapVertex vertex) {		
		heap.add(vertex);
		vertices.add(vertex);
		if (heap.size() != 1) {
			heapify(vertex);
		}
	}
	
	public void heapify(HeapVertex vertex) {
		if ((heap.indexOf(vertex) + 2) % 2== 1 && heap.indexOf(vertex) > 0 ) {
			if (heap.get((heap.indexOf(vertex)-1)/2).getValue() < vertex.getValue()) {
				int temp = heap.indexOf(vertex);
				heap.set(temp, heap.get((heap.indexOf(vertex) - 1)/2));
				heap.set((temp - 1)/2, vertex);
				heapify(vertex);
			}
		}
		else if ((heap.indexOf(vertex) + 2) % 2 == 0 && heap.indexOf(vertex) > 1) {
			if (heap.get((heap.indexOf(vertex) - 2)/2).getValue() < vertex.getValue()) {
				int temp = heap.indexOf(vertex);
				heap.set(temp, heap.get((heap.indexOf(vertex) - 2)/2));
				heap.set((temp - 2)/2, vertex);
				heapify(vertex);
			}
		}
		
	}

	
	

	
	
	
	/*public void heapify(ArrayList<Integer> array, int parent, int n) {
		int left, right, imax=0;		
		while (true) {
			left = (imax<<1) +1;
			right = left +1;
			if ((left<n) && (array.get(left)>array.get(parent))) imax = right;
			else imax = parent;
			if ((right<n) && (array.get(right)>array.get(imax))) imax=right;
			if (imax != parent) {
				swap(array, array.get(parent), array.get(imax));
				parent = imax;
			}
			else break;
		}		
	}*/
	
/*	public void swap(ArrayList<Integer> array, int i,int j) {
		int temp = array.get(i);
		array.set(i, array.get(j));
		array.set(j, temp);
	}
	
	public void buildHeap(ArrayList<Integer> array, int n) {		
		for (int i=(n>>1)-1; i>=0; i--)
			heapify(array, i, n);
	}
	
	public void heapsort(ArrayList<Integer> array) {
		int n = array.size();
		buildHeap(array, n);		
		for (int t=n-1; t>0; t--) {
			swap(array, array.get(0), array.get(t));
			heapify(array, 0, t);
		}
	}*/
}
