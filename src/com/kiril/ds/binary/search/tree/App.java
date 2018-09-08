package com.kiril.ds.binary.search.tree;

public class App {

	public static void main(String arg[]){
		BinarySearchTree bst = new BinarySearchTree();
		bst.insert(7);
		bst.insert(8);
		bst.insert(1);
		bst.insert(4);
		bst.insert(6);
		bst.insert(2);
		bst.insert(10);
		bst.insert(15);
		bst.insert(11);

		System.out.println("Original Tree : ");
		bst.display(bst.root);		
		
		System.out.println();
		
		bst.deleteLeaf(2);
		
		System.out.println("Tree after deleting a leaf : ");
		bst.display(bst.root);	
	}
}
