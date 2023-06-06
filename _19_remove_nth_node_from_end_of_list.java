package Algorithm_I;


public class _19_remove_nth_node_from_end_of_list {
	
	 
	
	  
	  public static ListNode removeNthFromEnd(ListNode head, int n) {
		  ListNode temp = head;
		  int size = 0 , i = 0;
		  while(temp!=null) {
			  temp = temp.next;
			  size++;
		  }
		  i = size;
		  temp = head;
		  i -= n+1;
		  while(i>0) {
			  temp = temp.next;
			  i--;
		  }
		   if (size == 1) {
			  head = null;
			  
		  }
		   else if(size == n) {
			 return temp.next;
		  }
		
		  else {
			  temp.next = temp.next.next;
		  }
		return head;
	        
	    }
	  static class ListNode {
	        int val;
	        ListNode next;
	        ListNode(int val) {
	            this.val = val;
	            this.next = null;
	        }
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode node1 = new ListNode(1);
		ListNode node2 = new ListNode(2);
		//ListNode node3 = new ListNode(3);
		//ListNode node4 = new ListNode(4);
	//	ListNode node5 = new ListNode(5);

		node1.next = node2;
		//node2.next = node3;
		//node3.next = node4;
		//node4.next = node5;
		
		removeNthFromEnd(node1,2);

	}

}
