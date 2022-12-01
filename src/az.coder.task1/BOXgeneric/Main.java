package az.coder.task1.BOXgeneric;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {


        BoxGeneric<GTX1660ti> gtx =new BoxGeneric(new GTX1660ti("GTX1660ti")) ;
        BoxGeneric<RTX3060> rtx = new BoxGeneric(new RTX3060("RTX3060")) ;

        BoxGeneric[] arr = new BoxGeneric[]{gtx,rtx};
        for (BoxGeneric arr2 : arr){
            System.out.println(arr2);
        }

    }
}
