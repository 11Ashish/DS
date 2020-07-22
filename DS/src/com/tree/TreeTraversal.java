package com.tree;

public class TreeTraversal {
	public static void main(String[] args) {
		CreateTreeClass ct = new CreateTreeClass();
		BinaryTreeNode root = ct.createTree();
	//	System.out.println(root.getData());
		inorderTraversal(root);
	}

	private static void inorderTraversal(BinaryTreeNode root) {
		if (root!= null)
		{
		inorderTraversal(root.getLeft());
		System.out.println(root.getData());
		inorderTraversal(root.getRight());
		}

	}

}
