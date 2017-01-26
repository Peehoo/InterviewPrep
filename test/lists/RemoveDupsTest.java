package lists;

import java.util.LinkedList;

import junit.framework.Assert;

import org.junit.Test;

public class RemoveDupsTest {
	
	@Test
	public void duplicate() {
		LinkedList<Node> l = new LinkedList<Node>();
		Node head = new Node(7);
		Node node1 = head;
		Node node2 = new Node(1);
		Node node3 = new Node(5);
		Node node4 = new Node(6);
		Node node5 = new Node(6);
		Node node6 = new Node(5);
		head.next=node2;
		l.add(node1);
		node1.next=node2;
		l.add(node2);
		node2.next=node3;
		l.add(node3);
		node3.next=node4;
		l.add(node4);
		node4.next=node5;
		l.add(node5);
		node5.next=node6;
		l.add(node6);
		node6.next=null;
		RemoveDups rd = new RemoveDups();
		Assert.assertEquals(head, rd.removeDups(head));
	}
	
	@Test
	public void empty() {
		Node head = null;
		RemoveDups rd = new RemoveDups();
		Assert.assertEquals(null, rd.removeDups(head));
	}

}
