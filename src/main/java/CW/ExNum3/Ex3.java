package CW.ExNum3;

import javax.swing.plaf.IconUIResource;
import java.util.*;

public class Ex3 {

    public static void main(String[] args) {

        /**
         * Найти пересечения слов в массивах и указать их общее кол-во
         * Пример:
         * Mas1 ["qwe", "asd", "qwe", "x"]
         * Mas2 ["qwe", "v"]
         * Результат:
         * qwe = 3
         */

        List<String> list1 = new ArrayList<>(List.of("qwe", "asd", "qwe", "x"));
        List<String> list2 = new ArrayList<>(List.of("qwe", "v", "x"));

        Set<String> crossover = new HashSet<>(list1);
        crossover.retainAll(list2);

        List<String> listAll = new ArrayList<>(list1);
        listAll.addAll(list2);

        Map<String, Integer> map = new HashMap<>();

        for (String items : crossover) {

            int count = 0;
            for (String s : listAll) {
                if (items.equals(s)) {
                    count++;
                }
            }
            map.put(items, count);
        }

        for (String items : map.keySet()) {

            System.out.println("Слово " + items + " встретилось " + map.get(items) + " раз(а)");
        }


    }

}
