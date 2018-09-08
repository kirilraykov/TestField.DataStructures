package com.kiril.ds.binary.search.tree;

public class BinarySearchTree {

	public Node root;
	
	public BinarySearchTree() {
		// TODO Auto-generated constructor stub
	}
	
	public boolean isEmpty() {
		return root == null;
	}

	/* Insert a node:
	 * 1) Create the node and check if BST is empty(set the root to the new node then)
	 * 2) Create a parent node equals to the current node iterating
	 * 3) If current.data is bigger than x, set the current, to the next left node(current's left child)
	 * and set the parent to the current one(so we can point to the new node after we find place for it)
	 * 4) perform 3) until we find an empty left node and when we find it set the parent to point to 
	 * it's left child(the new node)
	 * 5) return after successful insertion
	 * 6) Analogically if the current.data is smaller than x.
	 */
	public void insert(int x) {
		Node newNode = new Node(x);
		
		if(isEmpty()) {
			root = newNode;
			return;
		}
		
		Node current = root;
		Node parent = null;
		
		while(true) {
			if(x < current.data) {
				parent = current;
				current = current.left;
				if(current == null) {
					parent.left = newNode;
					return;
				}
			}
			else if(x > current.data) {
				parent = current;
				current = current.right;
				if(current == null) {
					parent.right = newNode;
					return;
				}
			}
		}
	}
	
	/*
	 * Find element in the BST 
	 * 1) Start from the root and compare current.data with x 
	 * 2) If current.data is greater than x, we need to go to the left of the root. 
	 * 3) If current.data is smaller than n, we need to go to the right of the root. 
	 * 4) If at any point of time current.data is equal to the n then return true. 
	 * 5) If we reach to the leaves (end of the tree) return false
	 */
	public boolean find(int x) {
		Node current = root;
		
		while(current != null) {
			if(current.data == x)
				return true;
			else if(current.data < x) {
				current = current.left;
			}
			else
				current = current.right;
		}
		return false;
	}
	
	public boolean deleteLeaf(int x) {
		Node current = root;
		Node parent = current;
		
		boolean isLeftChild = false;
		
		while(current.data != x){
			parent = current;
			
			if(current.data > x){
				isLeftChild = true;
				current = current.left;
			}else{
				isLeftChild = false;
				current = current.right;
			}
			if(current ==null){
				return false;
			}
		}
		
		//if i am here that means we have found the node
		//Case 1: if node to be deleted has no children
		if(current.left == null && current.right == null){
			if(current==root){
				root = null;
			}
			if(isLeftChild ==true){
				parent.left = null;
			}else{
				parent.right = null;
			}
		}
		
		return true;
	}
	
	
	public void display(Node root){
		
		Node current = root;
		
		if(current!=null){
			display(current.left);
			System.out.print(" " + current.data);
			display(current.right);
		}
	}
}

