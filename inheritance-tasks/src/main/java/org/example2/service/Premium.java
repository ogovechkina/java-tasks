package org.example2.service;

import org.example2.card.Card;

public class Premium extends Service {
    private final String subscriptionType;
    private final Double minimumBalance;

    public Premium(Card card, Double price, String subscriptionType, Double minimumBalance) {
        super(card, price);
        this.subscriptionType = subscriptionType;
        this.minimumBalance = minimumBalance;
    }

    @Override
    public boolean canActivate() {
        if (super.canActivate()) {
            if (getCard().getBalance() >= minimumBalance){
                return true;
            } else {
                System.out.println("Баланс карты меньше минимального требуемого остатка.");
                return false;
            }
        } else {
            return false;
        }
    }

    public String getSubscriptionType() {
        return subscriptionType;
    }

    public Double getMinimumBalance() {
        return minimumBalance;
    }
}
