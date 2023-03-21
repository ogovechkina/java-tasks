package org.example2.customer;

import org.example2.card.Card;
import org.example2.service.Service;

public class Customer {
    private final String fullName;
    private final String contractNum;
    private final Card card;

    public Customer(String fullName, String contractNum, Card card) {
        this.fullName = fullName;
        this.contractNum = contractNum;
        this.card = card;
    }

    public String getContractNum() {
        return contractNum;
    }

    public String getFullName() {
        return fullName;
    }

    public Card getCard() {
        return card;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "fullName='" + fullName + '\'' +
                ", contractNum='" + contractNum + '\'' +
                ", card=" + card +
                '}';
    }
}