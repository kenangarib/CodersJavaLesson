package az.coder.task1.BirBankApp.Card;

import az.coder.task1.BirBankApp.User.UsersList;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Set;
import java.util.TreeSet;

public class CardsList {

    UsersList usersList = new UsersList();

    Card<Object> card1 = new Card<>(usersList.user1.getName().toString().toUpperCase(Locale.ROOT) + " " + usersList.user1.getSurName().toString().toUpperCase(Locale.ROOT), "2145 3659 7845 6547", 196, LocalDate.now().plusYears(4), "AZN", 5400, usersList.user1.getId());
    Card<Object> card2 = new Card<>(usersList.user2.getName().toString().toUpperCase(Locale.ROOT) + " " + usersList.user2.getSurName().toString().toUpperCase(Locale.ROOT), "9874 5689 3145 3942", 547, LocalDate.now().plusYears(4), "AZN", 540, usersList.user2.getId());
    Card<Object> card3 = new Card<>(usersList.user3.getName().toString().toUpperCase(Locale.ROOT) + " " + usersList.user3.getSurName().toString().toUpperCase(Locale.ROOT), "6548 8745 6955 3155", 126, LocalDate.now().plusYears(5), "USD", 300, usersList.user3.getId());
    Card<Object> card4 = new Card<>(usersList.user4.getName().toString().toUpperCase(Locale.ROOT) + " " + usersList.user4.getSurName().toString().toUpperCase(Locale.ROOT), "5473 3336 7789 4444", 956, LocalDate.now().plusYears(4), "AZN", 700, usersList.user4.getId());
    Card<Object> card5 = new Card<>(usersList.user5.getName().toString().toUpperCase(Locale.ROOT) + " " + usersList.user5.getSurName().toString().toUpperCase(Locale.ROOT), "5477 7441 5465 2316", 148, LocalDate.now().plusYears(5), "USD", 1247, usersList.user5.getId());
    Card<Object> card6 = new Card<>(usersList.user6.getName().toString().toUpperCase(Locale.ROOT) + " " + usersList.user6.getSurName().toString().toUpperCase(Locale.ROOT), "4582 3321 2214 7845", 354, LocalDate.now().plusYears(4), "AZN", 652, usersList.user6.getId());
    Card<Object> card7 = new Card<>(usersList.user7.getName().toString().toUpperCase(Locale.ROOT) + " " + usersList.user7.getSurName().toString().toUpperCase(Locale.ROOT), "9514 5778 3115 6545", 478, LocalDate.now().plusYears(5), "USD", 6500, usersList.user7.getId());



}
