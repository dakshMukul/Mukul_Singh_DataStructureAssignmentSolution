package com.gl.Question_2;

class Node {
	public int data;
	public Node left, right;

	public Node(int data) {
		this.data = data;
		this.left = this.right = null;
	}
}	

public class TransactionData {

		Node node;
		Node prevNode = null;
		Node skewHead = null;

		public void BstToSkewed(Node curr) {
			if (curr == null) {
				return;
			}

			BstToSkewed(curr.left);

			if (skewHead == null) {

				// update newHead to new Root
				skewHead = curr;
				curr.left = null;
				prevNode = curr;
			} else {
				// update the right of the new Head and Update the PrevNode
				prevNode.right = curr;
				curr.left = null;
				prevNode = curr;
			}
			BstToSkewed(curr.right);
		}

		void Inorder(Node curr) {

			if (curr == null) {
				return;
			}
			System.out.println(curr.data + "");
			Inorder(curr.right);

		}

		public static void main(String[] args) {

		}

	}

