package org.example2.card;

import org.example2.customer.Customer;

public class KidsCard extends Card {

    private final int kidsAge;
    private final Customer parentReference;

    public KidsCard(String cardNum, String cardholder, int kidsAge, Customer parentReference) {
        super(cardNum, cardholder);
        this.kidsAge = kidsAge;
        this.parentReference = parentReference;
    }

    public int getKidsAge() {
        return kidsAge;
    }

    public Customer getParentReference() {
        return parentReference;
    }

    @Override
    public String toString() {
        return "KidsCard{" +
                "cardNum='" + super.getCardNum() + '\'' +
                ", cardholder='" + super.getCardholder() + '\'' +
                ", active=" + super.isActive() +
                ", limit=" + super.getLimit() +
                ", balance=" + super.getBalance() +
                ", kidsAge=" + kidsAge +
                ", parent=" + parentReference.getFullName() +
                "}";
    }
}
