package zad1;

import zad1.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
public class main {
    public static void main(String[] args) {
        Kaczka[] array = new Kaczka[5];
        array[0] = new Kaczka("Babcia");
        array[1] = new Kaczka("Mama");
        array[2] = new Kaczka("Antonii");
        array[3] = new Kaczka("Jarosław");
        array[4] = new Kaczka("Mateusz");

        ArrayList<Kaczka> arrayList = new ArrayList();
        arrayList.add(new Kaczka("Babcia"));
        arrayList.add(new Kaczka("Mama"));
        arrayList.add(new Kaczka("Antoni"));
        arrayList.add(new Kaczka("Mateusz"));
        arrayList.add(new Kaczka("Jarosław"));


        BubbleSort babelek = new BubbleSort();
        SelectSort selekcik = new SelectSort();
        ListOfKaczka lista = new ListOfKaczka(babelek);

        System.out.println("Array sortowany bąbelkowo");
        long millisActualTime = System.currentTimeMillis();
            lista.sort(array);
        long executionTime = System.currentTimeMillis() - millisActualTime;
        System.out.println("Sortowanie bąbelkowe trwało: "+ executionTime);

        System.out.println("ArrayList sortowany bąbelkowo");
        millisActualTime = System.currentTimeMillis();
        lista.sort(arrayList);
        executionTime = System.currentTimeMillis() - millisActualTime;
        System.out.println("Sortowanie bąbelkowe trwało: "+ executionTime);
        lista.setSorting(selekcik);

        System.out.println("Array sortowany selectsortem");
         millisActualTime = System.currentTimeMillis();
        lista.sort(array);
         executionTime = System.currentTimeMillis() - millisActualTime;
        System.out.println("Sortowanie bąbelkowe trwało: "+ executionTime);

        System.out.println("ArrayList sortowany selectsortem");
        millisActualTime = System.currentTimeMillis();
        lista.sort(arrayList);
        executionTime = System.currentTimeMillis() - millisActualTime;
        System.out.println("Sortowanie bąbelkowe trwało: "+ executionTime);

    }
}