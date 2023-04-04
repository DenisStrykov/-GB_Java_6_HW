package HW.ExNum1.model;

import java.util.ArrayList;
import java.util.List;

public class Data {

    public static List<Notebook> notebookList() {

        List<Notebook> notebookList = new ArrayList<>();

        notebookList.add(new Notebook(1, "Asus", "Windows10Home", 4, 2, "зеленый"));
        notebookList.add(new Notebook(2, "Apple", "MAC", 2, 1, "черный"));
        notebookList.add(new Notebook(3, "HP", "Windows11Pro", 4, 1, "серый"));
        notebookList.add(new Notebook(4, "Lenovo", "Windows11Pro", 16, 1, "черный"));
        notebookList.add(new Notebook(5, "Apple", "MAC", 16, 4, "зеленый"));
        notebookList.add(new Notebook(6, "Lenovo", "Windows11Pro", 4, 2, "серый"));
        notebookList.add(new Notebook(7, "HP", "Windows11Home", 6, 2, "зеленый"));
        notebookList.add(new Notebook(8, "HP", "Windows11Home", 4, 1, "серый"));

        return notebookList;

    }

}
