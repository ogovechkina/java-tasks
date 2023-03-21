package org.example2.customer;

import org.example2.card.KidsCard;

public class KidsCustomer extends Customer {

    public KidsCustomer(String fullName, String contractNum, KidsCard card) {
        super(fullName, contractNum, card);
    }

    @Override
    public KidsCard getCard() {
        return (KidsCard) super.getCard();
    }

    @Override
    public String toString() {
        return "KidsCustomer{" +
                "fullName='" + super.getFullName() + '\'' +
                ", contractNum='" + super.getContractNum() + '\'' +
                ", card=" + super.getCard() +
                '}';
    }
}
