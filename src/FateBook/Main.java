package FateBook;

import java.util.Locale;
import java.util.Objects;
import java.util.Scanner;


public class Main {

    public static void SignIn(String nickName, String password) {
//        Scanner mySc = new Scanner(System.in);
//        MainUserData user = new MainUserData();
//        SignInAndSignUp sign = new SignInAndSignUp();
//
//        System.out.print("Istifadeci Adi: ");
//        user.inputNickname = mySc.next();
//        System.out.print("Sifre: ");
//        user.inputPassword = mySc.next();
//
//        nickName = user.inputNickname;
//        password = user.inputPassword;
    }

    public static void main(String[] args) {

        //Class
        Scanner mySc = new Scanner(System.in);
        MainUserData user = new MainUserData();
        SignInAndSignUp sign = new SignInAndSignUp();
        Friends friends = new Friends();
        MainPage mainPage = new MainPage();
        String[] mainPageArray = new String[]{mainPage.mainPage, mainPage.profile, mainPage.friends, mainPage.exit, mainPage.addFriend};

        System.out.println(sign.signIn + "      " + sign.signUp);
        Character inputForSign = mySc.next().charAt(0);
        Character inputForSignToLowerCase = Character.toLowerCase(inputForSign);   //Qabagina Character ile yazmasam qebul etmir

        switch (inputForSignToLowerCase) {
            case 'g': {
                System.out.print("Istifadeci Adi: ");
                user.inputNickname = mySc.next();
                System.out.print("Sifre: ");
                user.inputPassword = mySc.next();
                //SignIn(user.inputNickname, user.inputPassword);

                if (!user.inputNickname.equals(user.nickname) && !user.inputPassword.equals(user.password)) {
                    System.out.println("*********Istifadeci adi veya Sifre yanlisdir*********");
                    System.out.println(sign.signUp);
                    char signUp = mySc.next().charAt(0);
                    char signIn = ' ';
                    char signUpToLowerCase = Character.toLowerCase(signUp);
                    char signInToLowerCase = Character.toLowerCase(signIn);
                    switch (signUpToLowerCase) {
                        case 'q': {
                            System.out.print("Ad: ");
                            user.inputName = mySc.next();
                            System.out.print("Soy Ad: ");
                            user.inputSurname = mySc.next();
                            System.out.print("Istifadeci Adi: ");
                            user.inputNickname = mySc.next();
                            System.out.print("Email: ");
                            user.inputMailAdress = mySc.next();
                            System.out.print("Sifre: ");
                            user.inputPassword = mySc.next();
                            System.out.print("Yas: ");
                            user.inputAge = mySc.nextInt();
                            System.out.print("Cinsiyyet: ");
                            user.inputSex = mySc.next();

                            user.name = user.inputName;
                            user.surname = user.inputSurname;
                            user.nickname = user.inputNickname;
                            user.mailAdreess = user.inputMailAdress;
                            user.password = user.inputPassword;
                            user.age = user.inputAge;
                            user.sex = user.inputSex;

                            System.out.println("Siz artiq qeydiyyatdan kecmisinzi");

                            System.out.println(sign.signIn);
                            signInToLowerCase = mySc.next().charAt(0);
                            if (signInToLowerCase == 'g') {


//                                if (!user.inputNickname.equals(user.nickname) && !user.inputPassword.equals(user.password)){
//                                    System.out.println("Istifadeci Adi veya Sifre yanlisdir");
//                                }

//                                boolean b = !Objects.equals(user.inputPassword, user.password) && !Objects.equals(user.inputNickname, user.nickname);
                                do {
                                    System.out.print("Istifadeci Adi: ");
                                    user.inputNickname = mySc.next();
                                    System.out.print("Sifre: ");
                                    user.inputPassword = mySc.next();
                                    if (!user.inputNickname.equals(user.nickname) && !user.inputPassword.equals(user.password)) {
                                        System.out.println("Istifadeci Adi veya Sifre yanlisdir");

                                    } else {
                                        System.out.println("Giris etdiniz");
                                    }

                                } while (!Objects.equals(user.inputPassword, user.password) && !Objects.equals(user.inputNickname, user.nickname));


                            }

                        }
                        break;
                    }
                } else {


                }

            }
            break;
            case 'q': {

                char signUp = ' ';
                char signIn = ' ';
                char signUpToLowerCase = Character.toLowerCase(signUp);
                char signInToLowerCase = Character.toLowerCase(signIn);

                System.out.print("Ad: ");
                user.inputName = mySc.next();
                System.out.print("Soy Ad: ");
                user.inputSurname = mySc.next();
                System.out.print("Istifadeci Adi: ");
                user.inputNickname = mySc.next();
                System.out.print("Email: ");
                user.inputMailAdress = mySc.next();
                System.out.print("Sifre: ");
                user.inputPassword = mySc.next();
                System.out.print("Yas: ");
                user.inputAge = mySc.nextInt();
                System.out.print("Cinsiyyet: ");
                user.inputSex = mySc.next();

                user.name = user.inputName;
                user.surname = user.inputSurname;
                user.nickname = user.inputNickname;
                user.mailAdreess = user.inputMailAdress;
                user.password = user.inputPassword;
                user.age = user.inputAge;
                user.sex = user.inputSex;


                System.out.println("Siz artiq qeydiyyatdan kecmisinzi");

                System.out.println(sign.signIn);
                signInToLowerCase = mySc.next().charAt(0);
                if (signInToLowerCase == 'g') {


//                                if (!user.inputNickname.equals(user.nickname) && !user.inputPassword.equals(user.password)){
//                                    System.out.println("Istifadeci Adi veya Sifre yanlisdir");
//                                }

//                                boolean b = !Objects.equals(user.inputPassword, user.password) && !Objects.equals(user.inputNickname, user.nickname);
                    do {
                        System.out.print("Istifadeci Adi: ");
                        user.inputNickname = mySc.next();
                        System.out.print("Sifre: ");
                        user.inputPassword = mySc.next();
                        if (!user.inputNickname.equals(user.nickname) && !user.inputPassword.equals(user.password)) {
                            System.out.println("Istifadeci Adi veya Sifre yanlisdir");

                        } else {
                            System.out.println("Giris etdiniz");
                        }

                    } while (!Objects.equals(user.inputPassword, user.password) && !Objects.equals(user.inputNickname, user.nickname));


                }

            }
            break;
            default: {
                System.out.println("duzgun emeliyyat secin!");
            }
            {


            }


        }

        /////

        for (int i = 0; i < mainPageArray.length; i++) {
            System.out.println(mainPageArray[i] + " ");
        }
        mainPage.inputMainPageSelection = mySc.next().charAt(0);
        char inputMainPageSelectionToLowerCase = Character.toLowerCase(mainPage.inputMainPageSelection);
        String userAgeToString = user.age.toString();
        String[] profile = new String[]{user.name, user.inputSurname, user.nickname, user.mailAdreess, userAgeToString};
        char rReturn = ' ';//mySc.next().charAt(0);
        String addFriend = " ";

//        switch (inputMainPageSelectionToLowerCase){
//            case 'p':
//            {
//                for (int i = 0; i < profile.length; i++) {
//                    System.out.println(profile[i]);
//                }
//            }
//        }

//        while (true){
//            if (inputMainPageSelectionToLowerCase == 'p'){
//                for (int i = 0; i < profile.length; i++) {
//                    System.out.println(profile[i]);
//                    System.out.println("( R ) Ana Sehifeye qayit");
//
//                }
//            }
//            rReturn = mySc.next().charAt(0);
//            for (int i = 0; i < mainPageArray.length; i++) {
//                System.out.println(mainPageArray[i] + " ");
//                break;
//            }
//            break;
//
//        }

        do {
            if (inputMainPageSelectionToLowerCase == 'p') {
                for (int i = 0; i < profile.length; i++) {
                    System.out.println(profile[i]);
                }
                System.out.println("( R ) Ana Sehifeye qayit");
            }
            rReturn = mySc.next().charAt(0);
            if (rReturn == 'r') {
                for (String s : mainPageArray) {
                    System.out.println(s + " ");
                }
            }
            rReturn = mySc.next().charAt(0);
            if (rReturn == 'd') {
                System.out.print("Dost Axtar: ");
                addFriend = mySc.next();
                String addFriendLower = addFriend.toLowerCase();
                if (Objects.equals(addFriendLower, "angelina Jolie") || Objects.equals(addFriendLower, "angelina") || Objects.equals(addFriendLower, "jolie")) {
                    Friends.AngelinaJolie angelina = new Friends.AngelinaJolie();
                    System.out.println(angelina.name + " " + angelina.surName + " ( P ) Profiline Bax" );
                    char lookProfile = mySc.next().charAt(0);
                    if (lookProfile == 'p') {
                        String[] userProfile = new String[]{angelina.name, angelina.surName, angelina.age};
                        for (String userProfileArr : userProfile) {
                            System.out.println(userProfileArr);
                        }
                    }
                }

                else if (Objects.equals(addFriendLower, "scarlett johannson") || Objects.equals(addFriendLower, "scarlett") || Objects.equals(addFriendLower, "johannson")) {
                    Friends.ScarlettJohannson scarlett = new Friends.ScarlettJohannson();
                    System.out.println(scarlett.name + " " + scarlett.surName + " ( P ) Profiline Bax" );
                    char lookProfile = mySc.next().charAt(0);
                    if (lookProfile == 'p') {
                        String[] userProfile = new String[]{scarlett.name, scarlett.surName, scarlett.age};
                        for (String userProfileArr : userProfile) {
                            System.out.println(userProfileArr);
                        }
                    }
                }

                else if (Objects.equals(addFriendLower, "gal gadot") || Objects.equals(addFriendLower, "gal") || Objects.equals(addFriendLower, "gadot")) {
                    Friends.GalGadot galgadot = new Friends.GalGadot();
                    System.out.println(galgadot.name + " " + galgadot.surName + " ( P ) Profiline Bax" );
                    char lookProfile = mySc.next().charAt(0);
                    if (lookProfile == 'p') {
                        String[] userProfile = new String[]{galgadot.name, galgadot.surName, galgadot.age};
                        for (String userProfileArr : userProfile) {
                            System.out.println(userProfileArr);
                        }
                    }
                }

                else if (Objects.equals(addFriendLower, "robert dawner junior") || Objects.equals(addFriendLower, "junior") || Objects.equals(addFriendLower, "robert") || Objects.equals(addFriendLower, "dawner")) {
                    Friends.RobertDawnerJunior robert = new Friends.RobertDawnerJunior();
                    System.out.println(robert.name + " " + robert.surName + " ( P ) Profiline Bax" );
                    char lookProfile = mySc.next().charAt(0);
                    if (lookProfile == 'p') {
                        String[] userProfile = new String[]{robert.name, robert.surName, robert.age};
                        for (String userProfileArr : userProfile) {
                            System.out.println(userProfileArr);
                        }
                    }
                }

                else if (Objects.equals(addFriendLower, "chris Evans") || Objects.equals(addFriendLower, "evans") || Objects.equals(addFriendLower, "chris")) {
                    Friends.ChrisEvans evans = new Friends.ChrisEvans();
                    System.out.println(evans.name + " " + evans.surName + " ( P ) Profiline Bax" );
                    char lookProfile = mySc.next().charAt(0);
                    if (lookProfile == 'p') {
                        String[] userProfile = new String[]{evans.name, evans.surName, evans.age};
                        for (String userProfileArr : userProfile) {
                            System.out.println(userProfileArr);
                        }
                    }
                }

                else if (Objects.equals(addFriendLower, "tom hardy") || Objects.equals(addFriendLower, "tom") || Objects.equals(addFriendLower, "hardy")) {
                    Friends.TomHardy tom = new Friends.TomHardy();
                    System.out.println(tom.name + " " + tom.surName + " ( P ) Profiline Bax" );
                    char lookProfile = mySc.next().charAt(0);
                    if (lookProfile == 'p') {
                        String[] userProfile = new String[]{tom.name, tom.surName, tom.age};
                        for (String userProfileArr : userProfile) {
                            System.out.println(userProfileArr);
                        }
                    }
                }

                else {
                    System.out.println("Bele biri yoxdur!");
                }

            }


        } while (rReturn == 'e');


    }


}
