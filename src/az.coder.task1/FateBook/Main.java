package az.coder.task1.FateBook;

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
        Friends angelina = new Friends("Angelina", "Jolie",45);
        Friends scarlett = new Friends("Scarlett", "Johannson",33);
        Friends galgadot = new Friends("Gal", "Gadot",31);
        Friends robert = new Friends("Robert", "Dawner Junior",55);
        Friends chris = new Friends("Chris", "Evans",40);
        Friends tomhardy = new Friends("Tom", "Hardy",44);
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
                            do {
                                System.out.print("Cinsiyyet: ( K ) Kisi  ( Q ) Qadin: ");
                                user.inputSex = mySc.next().charAt(0);

                                switch (user.inputSex){
                                    case 'k':{
                                        user.sex = "Kisi";
                                    }
                                    break;
                                    case 'q':{
                                        user.sex = "Qadin";
                                    }
                                    break;
                                    default:{
                                        System.out.println("Duzgun secim edin!");
                                    }
                                    break;
                                }


                            }while (!user.inputSex.equals('k') && !user.inputSex.equals('q'));


                            user.name = user.inputName;
                            user.surname = user.inputSurname;
                            user.nickname = user.inputNickname;
                            user.mailAdreess = user.inputMailAdress;
                            user.password = user.inputPassword;
                            user.age = user.inputAge;


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
                do {
                    System.out.print("Cinsiyyet: ( K ) Kisi  ( Q ) Qadin: ");
                    user.inputSex = mySc.next().charAt(0);

                    switch (user.inputSex){
                        case 'k':{
                            user.sex = "Kisi";
                        }
                        break;
                        case 'q':{
                            user.sex = "Qadin";
                        }
                        break;
                        default:{
                            System.out.println("Duzgun secim edin!");
                        }
                        break;
                    }


                }while (!user.inputSex.equals('k') && !user.inputSex.equals('q'));

                user.name = user.inputName;
                user.surname = user.inputSurname;
                user.nickname = user.inputNickname;
                user.mailAdreess = user.inputMailAdress;
                user.password = user.inputPassword;
                user.age = user.inputAge;



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
                    System.out.println(angelina.getName() + " " + angelina.getSurName() + " ( P ) Profiline Bax" );
                    char lookProfile = mySc.next().charAt(0);
                    if (lookProfile == 'p') {
                        //String[] userProfile = new String[]{angelina.name, angelina.surName, angelina.age};
                        Friends[] angelinaarr = new Friends[]{angelina};
                        for (Friends userProfileArr : angelinaarr) {
                            System.out.println(userProfileArr.getName()+" "+userProfileArr.getSurName()+" "+userProfileArr.getAge());
                        }
                    }
                }

                else if (Objects.equals(addFriendLower, "scarlett johannson") || Objects.equals(addFriendLower, "scarlett") || Objects.equals(addFriendLower, "johannson")) {
                    System.out.println(scarlett.getName() + " " + scarlett.getSurName() + " ( P ) Profiline Bax" );
                    char lookProfile = mySc.next().charAt(0);
                    if (lookProfile == 'p') {
                        //String[] userProfile = new String[]{angelina.name, angelina.surName, angelina.age};
                        Friends[] scarlettarr = new Friends[]{scarlett};
                        for (Friends userProfileArr : scarlettarr) {
                            System.out.println(userProfileArr.getName()+" "+userProfileArr.getSurName()+" "+userProfileArr.getAge());
                        }
                    }
                }

                else if (Objects.equals(addFriendLower, "gal gadot") || Objects.equals(addFriendLower, "gal") || Objects.equals(addFriendLower, "gadot")) {
                    System.out.println(galgadot.getName() + " " + galgadot.getSurName() + " ( P ) Profiline Bax" );
                    char lookProfile = mySc.next().charAt(0);
                    if (lookProfile == 'p') {
                        //String[] userProfile = new String[]{angelina.name, angelina.surName, angelina.age};
                        Friends[] galgadotarr = new Friends[]{galgadot};
                        for (Friends userProfileArr : galgadotarr) {
                            System.out.println(userProfileArr.getName()+" "+userProfileArr.getSurName()+" "+userProfileArr.getAge());
                        }
                    }
                }

                else if (Objects.equals(addFriendLower, "robert dawner junior") || Objects.equals(addFriendLower, "robert") || Objects.equals(addFriendLower, "junior") || Objects.equals(addFriendLower, "dawner")) {
                    System.out.println(robert.getName() + " " + robert.getSurName() + " ( P ) Profiline Bax" );
                    char lookProfile = mySc.next().charAt(0);
                    if (lookProfile == 'p') {
                        //String[] userProfile = new String[]{angelina.name, angelina.surName, angelina.age};
                        Friends[] robertarr = new Friends[]{robert};
                        for (Friends userProfileArr : robertarr) {
                            System.out.println(userProfileArr.getName()+" "+userProfileArr.getSurName()+" "+userProfileArr.getAge());
                        }
                    }
                }

                else if (Objects.equals(addFriendLower, "chris evans") || Objects.equals(addFriendLower, "chris") || Objects.equals(addFriendLower, "evans")) {
                    System.out.println(chris.getName() + " " + chris.getSurName() + " ( P ) Profiline Bax" );
                    char lookProfile = mySc.next().charAt(0);
                    if (lookProfile == 'p') {
                        //String[] userProfile = new String[]{angelina.name, angelina.surName, angelina.age};
                        Friends[] chrisarr = new Friends[]{chris};
                        for (Friends userProfileArr : chrisarr) {
                            System.out.println(userProfileArr.getName()+" "+userProfileArr.getSurName()+" "+userProfileArr.getAge());
                        }
                    }
                }

                else if (Objects.equals(addFriendLower, "tom hardy") || Objects.equals(addFriendLower, "tom") || Objects.equals(addFriendLower, "hardy")) {
                    System.out.println(tomhardy.getName() + " " + tomhardy.getSurName() + " ( P ) Profiline Bax" );
                    char lookProfile = mySc.next().charAt(0);
                    if (lookProfile == 'p') {
                        //String[] userProfile = new String[]{angelina.name, angelina.surName, angelina.age};
                        Friends[] tomhardyarr = new Friends[]{tomhardy};
                        for (Friends userProfileArr : tomhardyarr) {
                            System.out.println(userProfileArr.getName()+" "+userProfileArr.getSurName()+" "+userProfileArr.getAge());
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
