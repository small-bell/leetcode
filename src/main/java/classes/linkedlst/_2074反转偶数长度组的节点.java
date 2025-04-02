package classes.linkedlst;

public class _2074反转偶数长度组的节点 {
//    public ListNode reverseEvenLengthGroups(ListNode head) {
//        int idx = 1;
//        ListNode dummy = new ListNode(0), pre = dummy, curr = head;
//        dummy.next = head;
//
//        while (curr != null) {
//
//            if (idx % 2 == 0) {
//                // reverse
//                ListNode ppre = pre;
//                for (int i = 0; i < idx && curr != null; i++) {
//                    ListNode nxt = curr.next;
//                    curr.next = pre;
//                    pre = curr;
//                    curr = nxt;
//                }
//                ListNode tail = ppre.next;
//                tail.next = curr;
//                ppre.next = pre;
//                pre = tail;
//            } else {
//                // keep
//                for (int i = 0; i < idx && pre.next != null; i++) {
//                    pre = pre.next;
//                }
//                curr = pre.next;
//            }
//            idx ++;
//        }
//        return dummy.next;
//    }

    public ListNode reverseEvenLengthGroups(ListNode head) {
        ListNode temp = head;
        int count = 0;
        int base = 1;
        ListNode pre = head;
        ListNode start = head;
        ListNode next = head;
        while(temp!=null){
            count++;
            if(count==base){
                if(base%2==0){
                    next=temp.next;
                    temp.next=null;
                    start=pre.next;
                    pre.next=reverse(start);
                    start.next=next;
                    temp=start;
                }
                pre=temp;
                base++;
                count=0;
            }
            temp=temp.next;
        }
        if(count%2==0){
            pre.next=reverse(pre.next);
        }
        return head;
    }

    ListNode reverse(ListNode node){
        ListNode pre = null;
        ListNode temp = node;
        while(node!=null){
            node=node.next;
            temp.next=pre;
            pre=temp;
            temp=node;
        }
        return pre;
    }



}
