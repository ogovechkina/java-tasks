package org.example2.customer;

import org.example2.card.KidsCard;

import java.util.Arrays;

public class KidsCustomer extends Customer {

    public KidsCustomer(String fullName, String contractNum, KidsCard card) {
        super(fullName, contractNum, Arrays.asList(card));
    }

    @Override
    public String toString() {
        return "KidsCustomer{" +
                "fullName='" + super.getFullName() + '\'' +
                ", contractNum='" + super.getContractNum() + '\'' +
                ", cards=" + super.getCards() +
                '}';
    }
}
