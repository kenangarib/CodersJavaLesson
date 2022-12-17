package az.coder.task1.task17.Remove.same.things;

import java.util.LinkedList;

public class Methods<T> {
    public T method1(LinkedList<T> link1, LinkedList<T> link2) {
        link1.addAll(link2);
        LinkedList<T> newList = new LinkedList<>(link1);
        System.out.println("Original Version: " + newList);
        return method2(newList);
    }

     public T method2(LinkedList<T> newList) {

        //newList.toArray();
        LinkedList<Integer> newList2 = new LinkedList<>();

        for (int i = 0; i < newList.size(); i++) {
            for (int j = i+1 ; j < newList.size(); j++) {
                if (newList.get(i).equals(newList.get(j))){
                    newList2.add(i+1);
                    newList.remove(j);

                    j--;
                }
            }
        }
        System.out.println("Removed Version: " + newList);
        System.out.println("New List: " + newList2);
        return null;
     }
}
