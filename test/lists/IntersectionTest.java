package lists;

import java.util.LinkedList;

import junit.framework.Assert;

import org.junit.Test;

public class IntersectionTest {

	@Test
	public void test() {
		LinkedList<Node> l = new LinkedList<Node>();
		Node head1 = new Node(1);
		Node node1 = head1;
		Node node2 = new Node(2);
		Node node3 = new Node(3);
		Node node4 = new Node(4);
		Node node5 = new Node(8);
		Node node6 = new Node(9);
		head1.next=node2;
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
		
		Node head2 = new Node(5);
		head2.next=node4;
		
		Intersection i = new Intersection();
		Assert.assertEquals(node4, i.getIntersection(head1, head2));
		
	}

}
