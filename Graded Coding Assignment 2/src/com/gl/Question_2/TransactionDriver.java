package com.gl.Question_2;


public class TransactionDriver {

	public static void main(String[] args) {
		
		TransactionData tree = new TransactionData();
		tree.node = new Node(50);
		tree.node.left = new Node(30);
		tree.node.right = new Node(60);
		tree.node.left.left = new Node(10);
		tree.node.right.left = new Node(55);
		tree.BstToSkewed(tree.node);
		tree.Inorder(tree.skewHead);

	}

}
