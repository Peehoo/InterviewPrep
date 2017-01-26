package tree;

import junit.framework.Assert;

import org.junit.Test;

public class MaxdepthTest {

	@Test
	public void maxDepth() {
		
		/**
		 *  	3
			   / \
			  9  20
			    /  \
			   15   7
			   		 \
			   		  8
		*/
		
		TreeNode root = new TreeNode(3);
		TreeNode node1 = new TreeNode(9);
		TreeNode node2 = new TreeNode(20);
		TreeNode node5 = new TreeNode(15);
		TreeNode node6 = new TreeNode(7);
		TreeNode node7 = new TreeNode(8);
		root.left = node1;
		root.right = node2;
		node2.left = node5;
		node2.right = node6;
		node6.right = node7;
		
		MaxDepth md = new MaxDepth();
		Assert.assertEquals(4, md.maxDepth(root));
	}
	
	@Test
	public void empty() {
		TreeNode root = null;
		MaxDepth md = new MaxDepth();
		Assert.assertEquals(0, md.maxDepth(root));
	}

}
