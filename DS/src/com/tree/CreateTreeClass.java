package com.tree;

public class CreateTreeClass {
	public static BinaryTreeNode  createTree() {
		BinaryTreeNode root=new BinaryTreeNode(1);
		BinaryTreeNode rootl1=new BinaryTreeNode(2);
		BinaryTreeNode rootr1=new BinaryTreeNode(3);
		BinaryTreeNode rootll2=new BinaryTreeNode(4);
		BinaryTreeNode rootrr2=new BinaryTreeNode(5);
		BinaryTreeNode rootll3=new BinaryTreeNode(6);
		BinaryTreeNode rootlr3=new BinaryTreeNode(7);
		root.setLeft(rootl1);
		root.setRight(rootr1);
		rootl1.setLeft(rootll2);
		rootl1.setRight(rootrr2);
		rootr1.setLeft(rootll3);
		rootr1.setRight(rootlr3);
	
		return root;
	}
}
