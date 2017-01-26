package tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import junit.framework.Assert;

import org.junit.Test;

public class LevelOrderBottomTest {

	@Test
	public void test() {
	/**
	 *  	3
		   / \
		  9  20
		    /  \
		   15   7
	*/
		
		TreeNode root = new TreeNode(3);
		TreeNode node1 = new TreeNode(9);
		TreeNode node2 = new TreeNode(20);
		TreeNode node5 = new TreeNode(15);
		TreeNode node6 = new TreeNode(7);
		root.left = node1;
		root.right = node2;
		node2.left = node5;
		node2.right = node6;
		
		List<List<Integer>> lists = new ArrayList<List<Integer>>();
		LinkedList<Integer> l1 = new LinkedList<Integer>();
		l1.add(15); l1.add(7);
		LinkedList<Integer> l2 = new LinkedList<Integer>();
		l2.add(9); l2.add(20);
		LinkedList<Integer> l3 = new LinkedList<Integer>();
		l3.add(3);
		lists.add(l1);
		lists.add(l2);
		lists.add(l3);
		
		LevelOrderBottom lob = new LevelOrderBottom();
		Assert.assertEquals(lists, lob.levelOrderBottom(root));
	}

}
