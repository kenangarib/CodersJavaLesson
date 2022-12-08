package az.coder.task1.task17.Remove.same.things;

import java.util.LinkedList;

public class mainLinkedList {



    public static void main(String[] args) {

        Methods<Integer> method = new Methods<>();

        LinkedList<Integer> linkedList1 = new LinkedList<>();
        LinkedList<Integer> linkedList2 = new LinkedList<>();

        /*linkedList1.add(5);
        linkedList1.add(2);
        linkedList1.add(4);
        linkedList1.add(1);
        linkedList1.add(0);

        linkedList2.add(6);
        linkedList2.add(9);
        linkedList2.add(8);
        linkedList2.add(7);
        linkedList2.add(10);*/

        for (int i = 1; i <= 10; i++) {
            linkedList1.offer(i);
        }
        for (int i = 6; i <= 14; i++) {
            linkedList2.offer(i);
        }
        method.method1(linkedList1,linkedList2);




    }
}
