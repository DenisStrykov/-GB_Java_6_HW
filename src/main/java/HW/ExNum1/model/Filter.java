package HW.ExNum1.model;

import java.util.*;

public class Filter {

    public static void filterNotebook(List notebookList) {

        Scanner scanner = new Scanner(System.in);

        List<Notebook> notebooks = new ArrayList<>(notebookList);

        Map<Integer, String> filter = new HashMap<>();
        filter.put(1, "Производитель");
        filter.put(2, "Операционная система");
        filter.put(3, "Объем жесткого диска");
        filter.put(4, "Объем оперативной памяти");

        Map<String, Integer> valueFilter = new HashMap<>();
        Map<String, String> stringFilter = new HashMap<>();

        int value;

        System.out.println("Введите параметр отфильтрованного товара: ");

        for (Map.Entry<Integer, String> pair : filter.entrySet()) {
            String valueF = pair.getValue();
            int val = pair.getKey();
            System.out.println(val + " - " + valueF);

            System.out.print("Ввод: ");
            String input = scanner.next();

            if (isDigit(input)) {
                value = Integer.parseInt(input);

                valueFilter.put(filter.get(val), value);

            } else {
                stringFilter.put(filter.get(val), input);

            }
        }
        List<Notebook> allFilter = notebooks.stream().filter(item ->
                item.getHardDiskDrive().equals(valueFilter.get("Объем жесткого диска")) ||
                        item.getRAM().equals(valueFilter.get("Объем оперативной памяти")) ||
                        item.getManufacturer().equals(stringFilter.get("Производитель")) ||
                        item.getOperatingSystem().equals(stringFilter.get("Операционная система"))).toList();

        for (Notebook el : allFilter) {
            System.out.println(el);
        }

    }

    private static boolean isDigit(String s) throws NumberFormatException {
        try {
            Integer.parseInt(s);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

}
