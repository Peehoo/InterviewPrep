package lists;

import java.util.HashSet;

public class RemoveDups {
	public Node removeDups(Node head){
		Node n = head;
		if(n == null){
			return null;
		}
		HashSet<Integer> s = new HashSet<Integer>();
		s.add(n.data);
		while(n.next!=null){
			if(!s.contains(n.next.data)){
				s.add(n.next.data);
				n = n.next;
			}
			else {
				n.next = n.next.next;
			}
		}
		return head;
	}
}
