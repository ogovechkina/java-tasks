package org.example2.service;

import org.example2.card.Card;

public abstract class Service {
    private final Card card;
    private final double price;
    private boolean active = false;

    public Service(Card card, double price) {
        this.card = card;
        this.price = price;
    }

    public void activate() {
        if (canActivate()) {
            card.pay(price);
            active = true;
        }
    }

    public boolean canActivate() {
        if (active) {
            System.out.println("Услуга уже активированна.");
            return false;
        } else {
            return card.canPay(price);
        }
    }

    public void deActivate() {
        active = false;
    }

    public boolean isActive() {
        return active;
    }

    public Card getCard() {
        return card;
    }

    public Double getPrice() {
        return price;
    }
}
