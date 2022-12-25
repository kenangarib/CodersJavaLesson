package az.coder.task1.GSMarena;
import java.awt.*;
import java.util.ArrayList;

public class PhoneSearchMethod{
    public String phoneSearchMethod(String searchPhone, ArrayList<Object> phoneList){

        String newPHone = "null";
        switch (searchPhone){

            // Apple Models

            case "iphone 13":
            case "iphone13":{
                for (Object findModel: phoneList) {
                    System.out.println(findModel);
                }
            }
            break;

        }

        return newPHone;
    }


}
