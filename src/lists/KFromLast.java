package lists;

public class KFromLast {
	public Node getKFromLast(Node head, int k){
		if(head == null){
			return null;
		}
		Node p=head;
		while(k>1){
			p=p.next;
			k--;
		}
		Node q=head;
		while(p.next!=null){
			p=p.next;
			q=q.next;
		}
		return q;
	}
}
