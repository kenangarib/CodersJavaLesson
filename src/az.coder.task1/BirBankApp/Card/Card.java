package az.coder.task1.BirBankApp.Card;

import java.time.LocalDate;

public class Card<C> {
    /*private*/ C holderName;
    /*private*/ C cardNumber;
    /*private*/ C cvv;
    /*private*/ LocalDate endTime;
    /*private*/ C currency;
    /*private*/ C balance;
    /*private*/ C cardId;

    public Card(C holderName, C cardNumber, C cvv, LocalDate endTime, C currency, C balance, C cardId) {
        this.holderName = holderName;
        this.cardNumber = cardNumber;
        this.cvv = cvv;
        this.endTime = endTime;
        this.currency = currency;
        this.balance = balance;
        this.cardId = cardId;
    }

    public C getHolderName() {
        return holderName;
    }

    public void setHolderName(C holderName) {
        this.holderName = holderName;
    }

    public C getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(C cardNumber) {
        this.cardNumber = cardNumber;
    }

    public C getCvv() {
        return cvv;
    }

    public void setCvv(C cvv) {
        this.cvv = cvv;
    }

    public LocalDate getEndTime() {
        return endTime;
    }

    public void setEndTime(LocalDate endTime) {
        this.endTime = endTime;
    }

    public C getCurrency() {
        return currency;
    }

    public void setCurrency(C currency) {
        this.currency = currency;
    }

    public C getBalance() {
        return balance;
    }

    public void setBalance(C balance) {
        this.balance = balance;
    }

    public C getCardId() {
        return cardId;
    }

    public void setCardId(C cardId) {
        this.cardId = cardId;
    }

    @Override
    public String toString() {
        return "Card{" +
                "holderName=" + holderName +
                ", cardNumber=" + cardNumber +
                ", cvv=" + cvv +
                ", endTime=" + endTime +
                ", currency=" + currency +
                ", balance=" + balance +
                ", cardId=" + cardId +
                '}';
    }
}
