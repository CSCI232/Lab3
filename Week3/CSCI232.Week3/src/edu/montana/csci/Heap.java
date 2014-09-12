package edu.montana.csci;


import java.util.ArrayList;
import java.util.List;



public class Heap extends Graph{
	
	
	private List<Integer> heapList = new ArrayList<Integer>();
	
	public Heap(ArrayList<Integer> list) {	
		
	}
	
	public void heapify(ArrayList<Integer> array, int parent, int n) {
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
	}
	
	public void swap(ArrayList<Integer> array, int i,int j) {
		int temp = array.get(i);
		array.set(i, array.get(j));
		array.set(j, temp);
	}
	
	public void buildHeap(ArrayList<Integer> array, int n) {		
		for (int i=(n>>1)-1; i>=0; i--)
			heapify(array, i, n);
	}
	
	public void heapsort(ArrayList<Integer> array, int n) {
		buildHeap(array, n);
		for (int t=n-1; t>0; t--) {
			swap(array, array.get(0), array.get(t));
			heapify(array, 0, t);
		}
	}
}
