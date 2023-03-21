package org.example2;

import org.example2.card.CreditCard;
import org.example2.card.DebitCard;
import org.example2.card.KidsCard;
import org.example2.customer.Customer;
import org.example2.customer.KidsCustomer;
import org.example2.service.Premium;
import org.example2.service.Service;

import java.security.Provider;

public class Main {

    public static void main(String[] args) {
        Customer ivanovIvan = new Customer(
                "Ivanov Ivan", "B-19032023",
                new CreditCard("2200 0000 0000 0001", "IVANOV IVAN"));

        System.out.println(ivanovIvan);
        System.out.println("Set balance and limit:");
        ivanovIvan.getCard().setBalance(3000);
        ivanovIvan.getCard().setLimit(5000);
        System.out.println(ivanovIvan.getCard());
        System.out.println("Deactivate card:");
        ivanovIvan.getCard().deactivate();
        System.out.println(ivanovIvan.getCard());
        System.out.println("-------------------");

        KidsCustomer ivanovVasechka = new KidsCustomer(
                "Ivanov Vasya Jn.", "B-111222333",
                new KidsCard("2200 0000 1111 0001", "IVANOV VASYA", 14, ivanovIvan));

        System.out.println(ivanovVasechka);
        System.out.println("Set balance and limit:");
        ivanovVasechka.getCard().setBalance(5000);
        ivanovVasechka.getCard().setLimit(250);
        System.out.println(ivanovVasechka.getCard());
        System.out.println("-------------------");

        Customer petrovPetr = new Customer(
                "Petrov Petr", "B-19032024",
                new DebitCard("2200 0000 0000 0002", "PETROV PETR"));

        Service service1 = new Premium(ivanovIvan.getCard(), 200.00, "Премиум", 5000.00);
        ivanovIvan.getCard().activate();
        service1.activate();
        ivanovIvan.getCard().setBalance(30000);
        service1.activate();

    }
}
