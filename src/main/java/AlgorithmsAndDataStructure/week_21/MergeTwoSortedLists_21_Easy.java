package AlgorithmsAndDataStructure.week_21;

public class MergeTwoSortedLists_21_Easy {
    public static void main(String[] args) {

    }

    public static ListNode merge(ListNode l1, ListNode l2){
        if (l1 == null) {
            return l2;
        }

        if (l2 == null) {
            return l1;
        }

        if (l1.val <= l2.val) {
            l1.next = merge(l1.next, l2);
            return l1;
        }
        l2.next = merge(l1, l2.next);
        return l2;
    }
}
