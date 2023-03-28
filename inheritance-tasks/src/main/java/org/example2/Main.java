package org.example2;

import org.example2.card.Card;
import org.example2.card.CreditCard;
import org.example2.card.DebitCard;
import org.example2.card.KidsCard;
import org.example2.customer.Customer;
import org.example2.customer.KidsCustomer;
import org.example2.service.Premium;
import org.example2.service.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class Main {

    public static void main(String[] args) {

        List<Card> cardsOfIvanovIvan = new ArrayList<>(Arrays.asList(
                new CreditCard("2200 0000 0000 0001", "IVANOV IVAN"),
                new DebitCard("2200 0000 0000 0002", "IVANOV IVAN"),
                new CreditCard("2200 0000 0000 0003", "IVANOV IVAN")
        ));



        Customer ivanovIvan = new Customer("Ivanov Ivan", "B-19032023", cardsOfIvanovIvan);

        System.out.println(ivanovIvan);
        Card ivanovCard1 = ivanovIvan.getCards().get(0);
        System.out.println("Set balance and limit:");
        ivanovCard1.setBalance(3000);
        ivanovCard1.setLimit(5000);
        System.out.println(ivanovCard1);
        System.out.println("Deactivate card:");
        ivanovCard1.deactivate();
        System.out.println(ivanovCard1);

        Card ivanovCard2 = ivanovIvan.getCards().get(1);
        Service service1 = new Premium(ivanovCard2, 200.00, "Премиум", 5000.00);
        service1.activate();
        ivanovCard2.setBalance(30000);
        service1.activate();
        System.out.println("-------------------");


        KidsCard cardOfIvanovVasya = new KidsCard("2200 0000 1111 0001", "IVANOV VASYA", 14, ivanovIvan);
        KidsCustomer ivanovVasechka = new KidsCustomer(
                "Ivanov Vasya Jn.", "B-111222333", cardOfIvanovVasya);

        System.out.println(ivanovVasechka);
        System.out.println("Set balance and limit:");
        ivanovVasechka.getCards().get(0).setBalance(5000);
        ivanovVasechka.getCards().get(0).setLimit(250);
        System.out.println(ivanovVasechka.getCards().get(0));
        System.out.println("-------------------");


        List<Card> cardsOfPetrovPetr = new ArrayList<>(Arrays.asList(
                new CreditCard("2200 0000_0000 0004", "PETROV PETR"),
                new DebitCard("2200 0000 0000 0005", "PETROV PETR"),
                new CreditCard("2200 0000 0000 0006", "PETROV PETR")
        ));
        Customer petrovPetr = new Customer(
                "Petrov Petr", "B-19032024", cardsOfPetrovPetr);
        Card petrovCard1 = ivanovIvan.getCards().get(1);
        System.out.println("Set balance and limit:");
        ivanovCard1.setBalance(8000);
        ivanovCard1.setLimit(6000);
        System.out.println(ivanovCard1);
        System.out.println("-------------------");
    }
}
