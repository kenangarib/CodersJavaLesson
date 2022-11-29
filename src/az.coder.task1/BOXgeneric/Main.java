package az.coder.task1.BOXgeneric;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {


        BoxGeneric gtx = new GTX1660ti(4,6);
        BoxGeneric rtx = new RTX3060(5,8);

        BoxGeneric[] arr = new BoxGeneric[]{gtx,rtx};
        for (BoxGeneric arr2 : arr){
            System.out.println(arr2);
        }

    }
}
