package HW.ExNum1;

import HW.ExNum1.model.Data;
import HW.ExNum1.model.Filter;
import HW.ExNum1.model.Notebook;

import java.util.ArrayList;
import java.util.List;

public class Ex1 {

    public static void main(String[] args) {

        /**
         * Задание на дом:
         * • Подумать над структурой класса Ноутбук для магазина техники - выделить поля и методы. Реализовать в java.
         * • Создать множество ноутбуков.
         * • Написать метод, который будет запрашивать у пользователя критерий (или критерии) фильтрации и выведет ноутбуки, отвечающие фильтру.
         * Критерии фильтрации можно хранить в Map. Например:
         * Введите цифру, соответствующую необходимому критерию:
         * 1 - ОЗУ
         * 2 - Объем ЖД
         * 3 - Операционная система
         * 4 - Цвет …
         * • Далее нужно запросить минимальные значения для указанных критериев - сохранить параметры фильтрации можно также в Map.
         * • Отфильтровать ноутбуки их первоначального множества и вывести проходящие по условиям.
         */

        Filter.filterNotebook(Data.notebookList());

        /**
         * Роман!!!
         * Привет!
         * У меня есть к тебе вопрос, много времени он у тебя не съест
         * Напиши, пожалуйста мне в удобном для тебя мессенджере
         * 89533378775
         * Спасибо!
         */

    }

}