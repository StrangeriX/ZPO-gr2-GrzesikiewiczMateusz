package zad1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ListOfKaczka {
    SortStrategy sort;

    public ListOfKaczka(SortStrategy sort){
        this.sort=sort;
    }

    public void setSorting(SortStrategy sort){
        this.sort = sort;
    }

    public ArrayList<Kaczka> sort(ArrayList<Kaczka> arrayList){
        return this.sort.Sort(arrayList);
    }

    public void display(Kaczka[] array){
        for(Kaczka k: array){
            k.tellName();
        }
    }
    public Kaczka[] sort(Kaczka[] array){
        return this.sort.Sort(array);
    }

    public void display(ArrayList<Kaczka> arrayList){
        for(Kaczka k: arrayList){
            k.tellName();
        }
    }
}
