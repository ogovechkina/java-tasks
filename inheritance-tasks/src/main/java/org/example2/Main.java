// 1. Создать 3 класса: Карта, Услуга и Пользователь. Карта и Услуга - абстрактные классы (не может быть объектов данного класса)
//2. Может быть несколько видов карт: Кредитная, дебетовая и Детская. Общие поля: номер карты, активность карты, фио, лимит, остаток. Обязательные поля: номер карты и фио. Для детской карты также есть поле: ссылка на родителя и возраст (обязательные поля) Внимание! Поле активности услуги нельзя задать из класса Main! Активировать или дезактивировать карту можно только при вызове специального метода.  (Условие описано ниже). При создании карты поле по умолчанию = true.
//Так же у карт есть ссылка на список услуг.
//3. Также существует несколько видов Услуг: Страховка,  Премиум и Защита счета. Для клиентов, у которых есть дети (оформлена детская карта): Управление картой. (То есть подключение доступно только для детской карты) . Общие поля: стоимость в копейках, активность. Для премиума: тип подписки и минимальный остаток на карте для подключения услуги (обязательные поля) . Внимание! Поле активности услуги нельзя задать из класса Main! Активировать или дезактивировать услугу можно только при вызове специального метода. (Условие описано ниже). При подключении услуги поле по умолчанию = false. * Метод активации/ деактивации принимает карту в качестве параметра, для которой выполняется метод
//4. У пользователя есть ссылка на карту(может быть несколько карт), номер договора и фио. Все поля обязательные.
//5. У карты должны быть методы активации и дезактивации карты.
//А так же метод добавления услуги (с созданием услуги и вызовом метода активации услуги): то есть не создаем сервис вне карты, создать и добавить услугу к карте можно только вызвав этот метод.
//** Можете использовать switch-case с выбором по типу карты, указанными в enum
//6. У услуги должен быть метод подключения и отключения услуги - Если карта не активна, то нельзя подключать услуги. Если денег на карте не достаточно, то ни одна из услуг не подключиться без оплаты (отказ клиенту) - Если стоимость услуги больше лимита, то тоже отказ клиенту - по услуге «Премиум» может быть отказ, если средств меньше, чем требуется для премиум сегмента.  Метод не должен быть статичным! Так как вызывается для конкретной услуги, а не на уровне класса.
//7. Создайте пользователей, карты и подключите услуги. Используйте метод активации/деактивации карт
//8. У пользователя есть методы (не статические! Вызываются по конкретному пользователю, а не на уровне класса):- Вывести в консоль количество активных карт каждого пользователя (c детскими) - Вывести в консоль количество активных карт каждого пользователя (без детских) - Вывести в консоль пользователей, у которых есть дети с картами и имена детей !! Если у вас у пользователя может не быть карт вовсе, то этот случай тоже нужно обработать 
//** (hard) при деактивации карты необходимо отключить все услуги.

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

        cardsOfIvanovIvan.add(new KidsCard("2200 0000 1111 0001", "IVANOV VASYA", 14, ivanovIvan));

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
