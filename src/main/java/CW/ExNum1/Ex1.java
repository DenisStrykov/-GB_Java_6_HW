package CW.ExNum1;

import java.util.*;

public class Ex1 {

    public static void main(String[] args) {

        /**
         * Дан массив чисел, посчитать процент уникальных чисел
         * Процент уникальных чисел = кол-во уникальных чисел * 100 / общее кол-во чисел в массиве
         */


        List<Integer> integerList = new ArrayList<>(Arrays.asList(1, 2, 3, 1));
        Set<Integer> integerSet = new HashSet<>(integerList);

        double percentageOfUniqueNumbers = (double) (integerSet.size() * 100) / integerList.size();


        System.out.println(integerList);
        System.out.println(integerSet);
        System.out.printf("%.2f", percentageOfUniqueNumbers);

    }

}
