package az.coder.task1.task15;

import java.util.ArrayList;
import java.util.List;

public class  Class <T> {

    public void method(List<Integer> a, List<Integer> b){

//        ArrayList<List<Integer>> ab = new ArrayList<>();
//        ab.add(a);
//        ab.add(b);
        //Object[] arr = ab.toArray();
        a.addAll(b);
       // a.sort(null);
        //System.out.println(a);
        Integer temp;

        //a.forEach((System.out::println));

        //Object[] array = a.toArray();
        //System.out.println(a);
        int aa;
        int bb;

//        for (int i = 0; i < array.length; i++) {
//            System.out.println(array[i]);
//            for (int j = 0; j < array.length-1; j++) {
//                if (array[j] > array[j+1]){
//
//
//                }
//            }
//        }
        for (int i = 0; i < a.size(); i++) {
            for (int j = 0; j < a.size()-1; j++) {
                if (a.get(j) > a.get(j+1)){
                    aa= a.get(j);
                    bb = a.get(j+1);
                    temp = aa;
                    aa = bb;
                    bb = temp;
                }
            }
        }


        //System.out.println(ab);
        ArrayList<Object> arr = new ArrayList<>();
        arr.add(a);
        for (Object array:arr) {
            System.out.println(array);
        }

    }

}
