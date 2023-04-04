package CW.ExNum2;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Ex2 {

    public static void main(String[] args) {

        /**
         * Найдите пересечение двух множеств
         * Пример:
         * set1 = [1, 2, 3, 4]
         * set2 = [3, 5, 6, 7]
         * Вывод в консоль:
         * [3]
         */

        Set<Integer> set1 = new HashSet<>(Arrays.asList(1, 2, 3, 4));
        Set<Integer> set2 = new HashSet<>(Arrays.asList(3, 5, 6, 7));

        Set<Integer> crossover = new HashSet<>(set1);
        crossover.retainAll(set2);  // Метод удаляет из этого множества все его элементы, которые не содержатся в указанной коллекции.
                                    // Если указанная коллекция также является множеством,
                                    // эта операция эффективно изменяет данное множество таким образом,
                                    // что его значение является пересечением двух множеств.

        System.out.println(set1);
        System.out.println(set2);
        System.out.println(crossover);

    }

}
