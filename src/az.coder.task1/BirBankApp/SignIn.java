package az.coder.task1.BirBankApp;

import az.coder.task1.BirBankApp.Methods.CheckUser;
import az.coder.task1.BirBankApp.User.User;
import az.coder.task1.BirBankApp.User.UsersList;

import java.util.ArrayList;
import java.util.Scanner;

public class SignIn {

    public static void SignMethod() {
        Scanner sc = new Scanner(System.in);

        UsersList userList = new UsersList();

        ArrayList<User<Object>> listForUsers = new ArrayList<>();
        listForUsers.add(userList.user1);
        listForUsers.add(userList.user2);
        listForUsers.add(userList.user3);
        listForUsers.add(userList.user4);
        listForUsers.add(userList.user5);
        listForUsers.add(userList.user6);
        listForUsers.add(userList.user7);

        System.out.print("Enter user ID: ");
        Integer idInput = sc.nextInt();

        CheckUser.CheckUserMethod(idInput, listForUsers);


    }


}
