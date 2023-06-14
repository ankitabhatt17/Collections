public class MergeTwoListNode {
    public static void main(String st[]){
        ListNode l1 = new ListNode(1);
        l1.next = new ListNode(2);
        l1.next.next = new ListNode(3);

        ListNode l2 = new ListNode(1);
        l2.next = new ListNode(3);
        l2.next.next = new ListNode(3);

        mergeTwoLists(l1, l2);
    }

    static class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 }
    static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode list = new ListNode();

        while(list1 != null && list2 != null) {
            if(list1.val < list2.val){
                list.next = new ListNode(list1.val);
                list = list.next;
            } else {
                ListNode n2 = new ListNode(list2.val);
                ListNode n1 = new ListNode(list1.val);

                list.next = n2;
                list.next.next = n1;

                list = list.next.next;
            }

            list1 =  list1.next;
            list2 =  list2.next;
        }
        return list;
    }
}
