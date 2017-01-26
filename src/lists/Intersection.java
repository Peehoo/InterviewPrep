package lists;

public class Intersection {
	
	public class Result {
		int size;
		Node tail;
		
		public Result(Node tail, int size){
			this.size=size;
			this.tail=tail;
		}
	}
	
	public Result getLengthAndTail(Node head){
		Node n = head;
		int size =1;
		while(n.next!=null){
			n=n.next;
			size++;
		}
		return new Result(n, size);
	}
	
	public Node getIntersection(Node head1, Node head2){
		Result r1 = getLengthAndTail(head1);
		Result r2 = getLengthAndTail(head2);
		
		if(r1.tail!=r2.tail){
			return null;
		}
		
		int diffInLength = Math.abs(r1.size - r2.size);
		Node shorterList = r1.size > r2.size? head2: head1;
		Node longerList = r1.size > r2.size? head1: head2;
		
		while(diffInLength>0 && longerList!=null){
			longerList = longerList.next;
			diffInLength--;
		}
		while(longerList!=null && shorterList!=null){
			if(longerList!=shorterList){
				longerList = longerList.next;
				shorterList = shorterList.next;
			}
			else {
				break;
			}
		}
		return shorterList;
	}
}
