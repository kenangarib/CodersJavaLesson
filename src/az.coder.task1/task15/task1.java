package az.coder.task1.task15;

import java.util.ArrayList;
import java.util.List;



public class task1 {


    public static void main(String[] args) {

        List<Integer> arrayList1 = new ArrayList<>();
        List<Integer> arrayList2 = new ArrayList<>();

        arrayList1.add(5);
        arrayList1.add(3);
        arrayList1.add(4);
        arrayList1.add(2);
        arrayList1.add(1);
        arrayList2.add(9);
        arrayList2.add(7);
        arrayList2.add(8);
        arrayList2.add(6);
        arrayList2.add(10);

//        arrayList1.addAll(arrayList2);
//        System.out.println(arrayList1);
        Class<ArrayList> class1 = new Class<>();
        class1.method(arrayList1,arrayList2);





//
//        arrayList2.forEach( (n) -> System.out.println(n));


    }
}


