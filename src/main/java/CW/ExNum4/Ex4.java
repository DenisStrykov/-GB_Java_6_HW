package CW.ExNum4;

import CW.ExNum4.model.Fahrenheit;
import CW.ExNum4.model.Kelvin;

public class Ex4 {

    public static void main(String[] args) {

        /**
         *  Напишите интерфейс Converter для конвертации из градусов по Цельсию в
         * Кельвины, Фаренгейты. У классов наследников необходимо переопределить метод интерфейса,
         * для валидного перевода величин. Метод для конвертации назовите "convertValue".
         */


        Double tempCelsius = 100.0;
        System.out.println("Цельсии " + tempCelsius);
        Double tFahrenheit = new Fahrenheit().convertValue(tempCelsius);
        System.out.println("Фаренгейты " + tFahrenheit);
        Double tKelvin = new Kelvin().convertValue(tempCelsius);
        System.out.println("Кельвины " + tKelvin);

    }

}
