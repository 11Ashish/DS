package com.tree;

import java.util.LinkedList;
import java.util.Queue;

//Java program to find height of tree 

//A binary tree node 

public class HeightBinaryTree {
	Node root;

	/*
	 * Compute the "maxDepth" of a tree -- the number of nodes along the longest
	 * path from the root node down to the farthest leaf node.
	 */
	int maxDepth(Node node) {
		if (node == null)
			return 0;
		else {
			/* compute the depth of each subtree */
			int lDepth = maxDepth(node.left);
			int rDepth = maxDepth(node.right);

			/* use the larger one */
			if (lDepth > rDepth)
				return (lDepth + 1);
			else
				return (rDepth + 1);
		}
	}

	// Find height of tree using queue

	int treeHeightUsingQueue(Node node) {
		// Base Case
		if (node == null)
			return 0;

		// Create an empty queue for level order tarversal
		Queue<Node> q = new LinkedList();

		// Enqueue Root and initialize height
		q.add(node);
		int height = 0;

		while (1 == 1) {
			// nodeCount (queue size) indicates number of nodes
			// at current lelvel.
			int nodeCount = q.size();
			if (nodeCount == 0)
				return height;
			height++;

			// Dequeue all nodes of current level and Enqueue all
			// nodes of next level
			while (nodeCount > 0) {
				Node newnode = q.peek();
				q.remove();
				if (newnode.left != null)
					q.add(newnode.left);
				if (newnode.right != null)
					q.add(newnode.right);
				nodeCount--;
			}
		}
	}

	/* Driver program to test above functions */
	public static void main(String[] args) {
		HeightBinaryTree tree = new HeightBinaryTree();

		tree.root = new Node(1);
		tree.root.left = new Node(2);
		tree.root.right = new Node(3);
		tree.root.left.left = new Node(4);
		tree.root.left.right = new Node(5);

		System.out.println("Height of tree is : " + tree.maxDepth(tree.root));
	}
}


