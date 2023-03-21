package org.example2.service;


import org.example2.card.KidsCard;

public class CardManagement extends Service {
    public CardManagement(KidsCard card, Double price) {
        super(card, price);
    }

    @Override
    public KidsCard getCard() {
        return (KidsCard) super.getCard();
    }
}
