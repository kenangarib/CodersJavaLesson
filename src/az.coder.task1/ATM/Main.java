package az.coder.task1.ATM;


import java.util.Scanner;

public class Main {
    //ATM app


    public static void main(String[] args) {

        //Variables

        Scanner mySc = new Scanner(System.in);
        ATMinformation atmInfo = new ATMinformation();
        CardInformation cardInfo = new CardInformation();
        String userSelectLang;
        Integer userCardCode, makeAdraft;
        Long userCardNumber;
        Character a, b, c, d, userSelectOPeration;
        Integer wrongCount = 0, wrongCountTotal = 3;

        //Array for Languages

        Character eng, aze;
        String[] language = new String[]{"( E ) English", "( A ) Azerbaycan dili", ": "};

        //Array for operation

        String[] operation = new String[]{"( C ) Check your balance", "( M ) Make a draft"};


        System.out.println("*******************  Select Language  *******************");

        for (int i = 0; i < language.length; i++) {
            System.out.print(language[i] + " ");
        }

        atmInfo.atmLang = mySc.next().charAt(0);

        switch (atmInfo.atmLang) {
            case 'e':
            case 'E': {
                System.out.println("*********  Welcome to Kenan Bank  ***********");
                System.out.println("Please, insert your card");

                userCardNumber = mySc.nextLong();

                if (!userCardNumber.equals(cardInfo.cardNumber)) {
                    System.out.println("There is no card like this in the system! Take your card back.");
                } else {


                    System.out.println("Enter the 4 digit code: ");
                    OUT:
                    while (true) {
                        userCardCode = mySc.nextInt();
                        Integer[] digitArray = new Integer[]{};
                        if (!userCardCode.equals(cardInfo.cardCode)) {
                            wrongCount++;
                            System.out.println("Digit code is wrong!!");
                            if (wrongCount.equals(wrongCountTotal)) {
                                System.out.println("You tried " + wrongCount + " times wrong code.Your card is blocked!");
                                break OUT;
                            }
                        } else {
                            System.out.println("Yor're ready for operations, Mr." + cardInfo.cardName);
                        }


                        System.out.print("Select operation: ");
                        for (int i = 0; i < operation.length; i++) {
                            System.out.print(operation[i] + " ");
                        }
                        userSelectOPeration = mySc.next().charAt(0);
                        switch (userSelectOPeration) {
                            case 'c':
                            case 'C': {
                                System.out.println("Your balannce: " + cardInfo.cardBalance);
                                System.out.println("( M ) For making a draft" + "( C ) for canceling operation");
                                userSelectOPeration = mySc.next().charAt(0);
                                switch (userSelectOPeration) {
                                    case 'm':
                                    case 'M': {
                                        System.out.print("Type the number you want to enter: ");
                                        while (true) {                         // Iki defe donguye girir
                                            makeAdraft = mySc.nextInt();
                                            if (makeAdraft > cardInfo.cardBalance) {
                                                System.out.println("You don't have that much money in your account. Input less ");
                                            } else {
                                                if (makeAdraft > atmInfo.atmBalance) {
                                                    System.out.println("Sorry, there is no money as you wanted.Try again.");
                                                } else {
                                                    cardInfo.totalCardBalance = cardInfo.cardBalance - makeAdraft;
                                                    System.out.println(makeAdraft + " manat has been withdrawn from your account. Your balance is: " + cardInfo.totalCardBalance + " manat.");
                                                    break;
                                                }
                                            }
                                            break;
                                        }
                                    }

                                }
                            }
                            case 'm':
                            case 'M': {
                                System.out.print("Type the number you want to enter: ");
                                while (true) {
                                    makeAdraft = mySc.nextInt();
                                    if (makeAdraft > cardInfo.cardBalance) {
                                        System.out.println("You don't have that much money in your account. Input less ");
                                    } else {
                                        if (makeAdraft > atmInfo.atmBalance) {
                                            System.out.println("Sorry, there is no money as you wanted.Try again.");
                                        } else {
                                            cardInfo.totalCardBalance = cardInfo.cardBalance - makeAdraft;
                                            System.out.println(makeAdraft + " manat has been withdrawn from your account. Your balance is: " + cardInfo.totalCardBalance + " manat.");
                                            break;
                                        }
                                    }
                                    break;
                                }
                                break;
                            }
                        }
                    } // Dongunun sonu





                }
            }
            break;


            case 'a':
            case 'A': {
                System.out.println("*********  Kenan Bank'a xos geldiniz  ***********");
                System.out.println("Zehmet olmasa kartinizi aparata daxil edin.");

                userCardNumber = mySc.nextLong();

                if (!userCardNumber.equals(cardInfo.cardNumber)) {
                    System.out.println("Bele bir kart sistemde yoxdur. Kartinizi geri goturun.");
                } else {
                    System.out.println("Sifrenizi daxil edin: ");
                    while (true) {
                        userCardCode = mySc.nextInt();
                        Integer[] digitArray = new Integer[]{};
                        if (!userCardCode.equals(cardInfo.cardCode)) {
                            wrongCount++;
                            System.out.println("Sifre yanlisdir!!");
                            if (wrongCount == wrongCountTotal) {
                                System.out.println("Siz " + wrongCount + " defe yanlis sifre girdiniz.Buna gore kartiniz bloklandi");
                                break;
                            }
                        } else {
                            System.out.println("Artiq emeliyyat etmeye hazirsinzi." + cardInfo.cardName + " " + cardInfo.cinsiyyetKisi);
                            System.out.print("Emeliyyat secin: ");
                            for (int i = 0; i < operation.length; i++) {
                                System.out.print(operation[i] + " ");
                            }
                            userSelectOPeration = mySc.next().charAt(0);
                            switch (userSelectOPeration) {
                                case 'c':
                                case 'C': {
                                    System.out.println("Balansiniz: " + cardInfo.cardBalance);
                                    System.out.println("( M ) Pul cekmek ucun" + "( C ) Emeliyyati legv etmek ucun");
                                    userSelectOPeration = mySc.next().charAt(0);
                                    switch (userSelectOPeration) {
                                        case 'm':
                                        case 'M': {
                                            System.out.print("Cekmek istediyiniz mebleg daxil edin: ");
                                            while (true) {
                                                makeAdraft = mySc.nextInt();
                                                if (makeAdraft > cardInfo.cardBalance) {
                                                    System.out.println("Hesabinizdan kifayet qeder mebleg yoxdur.Daha az mebleg daxil edin ");
                                                } else {
                                                    if (makeAdraft > atmInfo.atmBalance) {
                                                        System.out.println("Uzr isteyirik, Aparatda kifayet qeder mebleg yoxdur.Daha sonra tekrar yoxlayin.");
                                                    } else {
                                                        cardInfo.totalCardBalance = cardInfo.cardBalance - makeAdraft;
                                                        System.out.println(makeAdraft + " manat hesabinizdan cekildi. Hal hazirda balansizniz: " + cardInfo.totalCardBalance + " manat.");
                                                        break;
                                                    }
                                                    break;
                                                }
                                            }
                                        }
                                        break;
                                    }
                                }
                                case 'm':
                                case 'M': {
                                    System.out.print("Cekmek istediyiniz mebleg daxil edin: ");
                                    while (true) {
                                        makeAdraft = mySc.nextInt();
                                        if (makeAdraft > cardInfo.cardBalance) {
                                            System.out.println("Hesabinizdan kifayet qeder mebleg yoxdur.Daha az mebleg daxil edin ");
                                        } else {
                                            if (makeAdraft > atmInfo.atmBalance) {
                                                System.out.println("Uzr isteyirik, Aparatda kifayet qeder mebleg yoxdur.Daha sonra tekrar yoxlayin.");
                                            } else {
                                                cardInfo.totalCardBalance = cardInfo.cardBalance - makeAdraft;
                                                System.out.println(makeAdraft + " manat hesabinizdan cekildi. Hal hazirda balansizniz: " + cardInfo.totalCardBalance + " manat.");
                                                break;
                                            }
                                            break;
                                        }
                                    }
                                }
                            }
                        }

                    }

                }

            }
        }


    }


}
