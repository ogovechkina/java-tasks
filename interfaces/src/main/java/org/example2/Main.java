// 1- Создать три класса Человек, Кот, Робот, которые не наследуются от одного класса.
// Эти классы должны уметь бегать и прыгать (методы просто выводят информацию о действии в консоль).
//
// 2 - Создать два класса: беговая дорожка и стена, при прохождении через которые, участники должны выполнять
// соответствующие действия (бежать или прыгать), результат выполнения печатаем в консоль (успешно пробежал,
// не смог пробежать и т.д.). У препятствий есть длина (для дорожки) или высота (для стены), а участников
// ограничения на бег и прыжки.
//
// 3 - Создать 2 коллекции : с участниками и препятствиями, и заставьте всех участников пройти
// этот набор препятствий. Если участник не смог пройти одно из препятствий,то дальше по списку он препятствий не идет.
// Препятствия можно проходить последовательно (сначала прыжки/потом бег), или чередовать прыжки и бег

package org.example2;

import org.example2.barrier.Barrier;
import org.example2.barrier.Competitor;
import org.example2.barrier.RunningTrackBarrier;
import org.example2.barrier.WallBarrier;
import org.example2.competitor.Cat;
import org.example2.competitor.Human;
import org.example2.competitor.Robot;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    private static final double RUNNING_TRACK_DISTANCE = 4000.5;
    private static final double HEIGHT_OF_THE_WALL = 2.5;

    public static void main(String[] args) {

        // Коллекция участников
        List<Competitor> competitors = new ArrayList<>(Arrays.asList(
                new Human("Аркаша"),
                new Cat("Котейка Лилит"),
                new Robot("R2D2")
        ));

        // Набор препятствий:
        List<Barrier> barriers = new ArrayList<>(Arrays.asList(
                new WallBarrier(HEIGHT_OF_THE_WALL),
                new RunningTrackBarrier(RUNNING_TRACK_DISTANCE)
        ));

        startCompetition(barriers, competitors);
    }

    public static void startCompetition(List<Barrier> barriers, List<Competitor> competitors) {
        for (int i = 0; i < competitors.size(); i++) {
            Competitor competitor = competitors.get(i);
            System.out.println((i + 1) + "й участник: " + competitor.getName());

            boolean win = true;
            for (Barrier barrier : barriers) {
                boolean crossed = barrier.cross(competitor);
                if (!crossed) {
                    win = false;
                    break;
                }
            }
            if (win) {
                System.out.println(competitor.getName() + " молодец, преодолел все препятствия!");
            } else {
                System.out.println(competitor.getName() + " выбывает из соревнования!");
            }
            System.out.println("-----------------------");
        }
    }
}
