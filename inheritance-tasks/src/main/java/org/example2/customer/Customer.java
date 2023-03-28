package org.example2.customer;

import org.example2.card.Card;

import java.util.List;

public class Customer {
    private final String fullName;
    private final String contractNum;
    private final List<Card> cards;

    public Customer(String fullName, String contractNum, List<Card> cards) {
        this.fullName = fullName;
        this.contractNum = contractNum;
        this.cards = cards;
    }

    public String getContractNum() {
        return contractNum;
    }

    public String getFullName() {
        return fullName;
    }

    public List<Card> getCards() {
        return cards;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "fullName='" + fullName + '\'' +
                ", contractNum='" + contractNum + '\'' +
                ", cards=" + cards +
                '}';
    }
}