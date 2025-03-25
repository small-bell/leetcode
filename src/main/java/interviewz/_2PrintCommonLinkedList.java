package interviewz;

public class _2PrintCommonLinkedList {


    public static void main(String[] args) {
        ListNode head1 = null, head2 = null;
        while (head1 != null && head2 != null) {
            if (head1.val > head2.val) {
                head2 = head2.next;
            } else if (head1.val < head2.val) {
                head1 = head1.next;
            } else {
                System.out.println(head1.val);
                head1 = head1.next;
                head2 = head2.next;
            }
        }
    }
}
