public class MergeTwoSortedLists {
    public static void main(String[] args) {
        System.out.println("LetsGo!");
        ListNode list1 = new ListNode(1, new ListNode(2, new ListNode(4)));
        ListNode list2 = new ListNode(1, new ListNode(3, new ListNode(4)));
        ListNode list3 = mergeTwoLists(list1, list2);
    }

    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode newNode = null;
        ListNode newList = newNode;
        ListNode temp = newNode; ;

        if (list1 == null) {
            return list2;
        }

        if (list2 == null) {
            return list1;
        }

        while (list1 != null) {
            if (list2 != null) {
                if (list1.val > list2.val) {
                    newNode = new ListNode(list2.val, null);
                    list2 = list2.next;

                } else {
                    newNode = new ListNode(list1.val, null);
                    list1 = list1.next;
                }

                if (newList == null) 
                {
                	
                	newList = new ListNode(newNode.val);
                	temp = newList;
                   
                } else {
                	temp.next = newNode;
                	temp = temp.next;
                }
            } else {
                newNode = new ListNode(list1.val, null);
                list1 = list1.next;
                temp.next = newNode;
                temp = temp.next;
            }
        }

        while (list2 != null) {
            newNode = new ListNode(list2.val, null);
            temp.next = newNode;
            temp = temp.next;
            list2 = list2.next;
        }

        return newList;
    }

    // Definition for singly-linked list.
    public static class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

}
