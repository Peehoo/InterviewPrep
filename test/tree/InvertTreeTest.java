package tree;

import junit.framework.Assert;

import org.junit.Test;

public class InvertTreeTest {

	@Test
	public void test() {
		
		/**
		 *       4								4
			   /   \						  /   \
			  2     7          ->            7     2
			 / \   / \						/ \   / \
			1   3 6   9					   9   6 3   1
		 */
			
		TreeNode root = new TreeNode(4);
		TreeNode node1 = new TreeNode(2);
		TreeNode node2 = new TreeNode(7);
		TreeNode node3 = new TreeNode(1);
		TreeNode node4 = new TreeNode(3);
		TreeNode node5 = new TreeNode(6);
		TreeNode node6 = new TreeNode(9);
		root.left = node1;
		root.right = node2;
		node1.left = node3;
		node1.right = node4;
		node2.left = node5;
		node2.right = node6;
		InvertTree it = new InvertTree();
		Assert.assertEquals(node1, root.left);
		Assert.assertEquals(node2, it.invertTree(root).left);
	}

}
