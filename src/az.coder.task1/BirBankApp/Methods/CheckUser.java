package az.coder.task1.BirBankApp.Methods;

import az.coder.task1.BirBankApp.Exceptions.UserNotFoundException;
import az.coder.task1.BirBankApp.User.User;

import java.util.List;


public class CheckUser {
    public static void CheckUserMethod(Integer idInput, List<User<Object>> list) {
        for (User<Object> user : list) {
            if (user.getId() == idInput) {
                System.out.println("Var");
            } else throw new UserNotFoundException();
        }


    }


}








