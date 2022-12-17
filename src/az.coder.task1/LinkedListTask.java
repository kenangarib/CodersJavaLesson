package az.coder.task1;

import java.util.LinkedList;

public class LinkedListTask {

    public static class Solution {

        public ListNode reverse(ListNode head) {

            ListNode prev = null;
            ListNode current = head;


            while (current != null) {
                ListNode next = current.next;
                current.next = prev;
                prev = current;
                current = next;
            }
            return prev;


        }
    }

    class ListNode {
        int val;
        ListNode next;

//        ListNode(int val) {
//            this.val = val;
//        }

        ListNode(ListNode next) {
            this.next = next;
        }

        public ListNode() {

        }
    }

    public void main(String[] args) {

        ListNode list = new ListNode();

        for (int i = 0; i < 5; i++) {

        }


    }
}