package org.example2.card;

public abstract class Card {
    private final String cardNum;
    private final String cardholder;
    private boolean active = true;
    private double limit = 0.;
    private double balance = 0.;

    public Card(String cardNum, String cardholder) {
        this.cardNum = cardNum;
        this.cardholder = cardholder;
    }

    public void activate() {
        this.active = true;
    }

    public void deactivate() {
        this.active = false;
    }

    public void pay(double price) {
        if (canPay(price)) {
            setBalance(getBalance() - price);
            System.out.println("Оплата прошла успешно!");
        }
    }

    public boolean canPay(double price) {
        if (!isActive()) {
            System.out.println("Карта не активна.");
            return false;
        } else if (getBalance() < price) {
            System.out.println("Недостаточно средств на счету.");
            return false;
        } else if (getLimit() > 0 && getLimit() < price) {
            System.out.println("Лимит по карте меньше суммы оплаты.");
            return false;
        } else {
            return true;
        }
    }

    public String getCardNum() {
        return cardNum;
    }

    public boolean isActive() {
        return active;
    }

    public String getCardholder() {
        return cardholder;
    }

    public double getLimit() {
        return limit;
    }

    public void setLimit(double limit) {
        this.limit = limit;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "Card{" +
                "cardNum='" + cardNum + '\'' +
                ", cardholder='" + cardholder + '\'' +
                ", active=" + active +
                ", limit=" + limit +
                ", balance=" + balance +
                '}';
    }
}
