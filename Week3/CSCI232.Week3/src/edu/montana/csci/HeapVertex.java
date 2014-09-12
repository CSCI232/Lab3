package edu.montana.csci;

public class HeapVertex extends BinaryTreeVertex {
	private int heapIndex;
	
	
	public HeapVertex(int val) {
		super(val);		
	}
	
	public HeapVertex(int val, HeapVertex left, HeapVertex right) {
		super(val);
		this.setLeftChild(left);
		this.setRightChild(right);
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
