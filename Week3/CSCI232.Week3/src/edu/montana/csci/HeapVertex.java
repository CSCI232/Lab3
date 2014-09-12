package edu.montana.csci;

public class HeapVertex<E> extends BinaryTreeVertex {
	private int heapIndex;
	
	
	public HeapVertex(int val) {
		super(val);		
	}
	
	public int getHeapIndex() {
		return this.heapIndex;
	}
	
	public void setHeapIndex(int index) {
		this.heapIndex = index;
	}
	
	public String toString() {
		return "("+heapIndex+")"+this.getValue();
	}
}
